package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import data.Data;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.util.Pair;
import sokoban.Navigator;

/**
 * A KillerSokoban egy jatek, ahol a jatekos egy raktari munkast alakit.
 * A cel, hogy minden mas jatekosnal tobb megjelolt ladat tolj a helyere.
 *
 * @author Horvath Gergo
 * @author Mocsari Andras
 * @author Zsiros Balint
 * @author Bottlik Judit
 * @author Holub Csongor
 * @version 1.0
 * @since 2018.04.29.
 */
public class GameController {

    @FXML
    public GridPane lowergridpane_preview;
    @FXML
    public GridPane uppergridpane_preview;
	@FXML
	public Button button_menu;

    private Image CelhelyImg;
    private Image DobozImg;
    private Image FalImg;
    private Image JeloltDImg;
    private Image KapcsoloImg;
    private Image LyukImg;
    private Image MezImg;
    private Image OlajImg;
    private Image MezOlajImg;
    private Image UresMezoImg;
    private ArrayList<Image> PlayerImgs = new ArrayList<Image>();
    private ArrayList<Pair<Integer, Integer>> usedplayers = new ArrayList<Pair<Integer, Integer>>();
    private Timeline interval;
    
    public GameController() 
    {
        CelhelyImg = new Image("/data/resources/drawable/celhely.png");
        DobozImg = new Image("/data/resources/drawable/doboz.png");
        FalImg = new Image("/data/resources/drawable/fal.png");
        JeloltDImg = new Image("/data/resources/drawable/jeloltdoboz.png");
        KapcsoloImg = new Image("/data/resources/drawable/kapcsolo.png");
        LyukImg = new Image("/data/resources/drawable/lyuk.png");
        MezImg = new Image("/data/resources/drawable/mez.png");
        MezOlajImg = new Image("/data/resources/drawable/mezolaj.png");
        OlajImg = new Image("/data/resources/drawable/olaj.png");
        UresMezoImg = new Image("/data/resources/drawable/uresmezo.png");
        fillPlayerImages();
        
        EventHandler<ActionEvent> EH = new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) {
    	    	disposeGrid();
    	    	
    	    	setGrid();
    	    	
    	    	fillGrid();
            }};
        interval = new Timeline(new KeyFrame(Duration.millis(100), EH));
        interval.setCycleCount(Timeline.INDEFINITE);
        interval.play();
    }

    private void fillPlayerImages()
    {
    	if (PlayerImgs==null) 
    	{
    		PlayerImgs = new ArrayList<Image>();
    	}
    	
    	for (int i=0;i<21;i++) 
    	{
    		PlayerImgs.add(new Image("/data/resources/drawable/jatekosok/jo"+i+".png"));
    	}
    }
    

	public void onVisszaButtonDownAction() {
        try {
        	
        	interval.stop();
        	
            Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/MenuView.fxml"));
            Navigator.navigate(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
    
    private void setGrid() 
    {
    	for (int i=0;i<Data.PalyaX;i++) 
    	{
            ColumnConstraints row = new ColumnConstraints();
            lowergridpane_preview.getColumnConstraints().add(row);
            row = new ColumnConstraints();
            uppergridpane_preview.getColumnConstraints().add(row);
    	}

    	for (int i=0;i<Data.PalyaY;i++) 
    	{
    		RowConstraints row = new RowConstraints();
            lowergridpane_preview.getRowConstraints().add(row);
    		row = new RowConstraints();
            uppergridpane_preview.getRowConstraints().add(row);
    	}
    }
    
    private void fillGrid() 
    {
    	int[] IDs = Data.jatek.getData().palya;
    	if (IDs!=null) 
    	{
	    	for (int x=0; x<Data.PalyaX;x++) 
	    	{
	        	for (int y=0; y<Data.PalyaY;y++) 
	        	{
	        		ImageView New = new ImageView();
	        		int CellWidth = lowergridpane_preview.widthProperty().intValue()/Data.PalyaX;
	        		int ColumnHeight = lowergridpane_preview.heightProperty().intValue()/Data.PalyaY;
	        		
	        		switch ((int)(IDs[x+y*Data.PalyaX]%10000/1000)) 
	        		{
	        			case 0:{ New = new ImageView(UresMezoImg); }break;
	        			case 1:{ New = new ImageView(FalImg); }break;
	        			case 2:{ New = new ImageView(LyukImg); }break;
	        			case 3:{ if ((int)(IDs[x+y*10]%100000/100)==0) {New = new ImageView(CelhelyImg);} else {New = new ImageView(UresMezoImg);} }break;
	        			case 4:{ if ((int)(IDs[x+y*10]%100000/100)==0) {New = new ImageView(LyukImg);} else {New = new ImageView(UresMezoImg);} }break;
	        			case 5:{ New = new ImageView(KapcsoloImg); }break;
	        			default: { New = new ImageView(UresMezoImg); }break;
	        		}
	        		New.setFitWidth(CellWidth);
	        		New.setFitHeight(ColumnHeight);
	        		lowergridpane_preview.add(New, x, y);
	
	        		New = new ImageView();
	        		switch ((int)(IDs[x+y*Data.PalyaX]/10000000)) 
	        		{
	        			case 0:{  }break;
	        			case 1:{ New = new ImageView(PlayerImgs.get(getRandomPlayerImg(IDs[x+y*Data.PalyaX]))); }break;
	        			case 2:{ New = new ImageView(DobozImg); }break;
	        			case 3:{ New = new ImageView(JeloltDImg); }break;
	        		}
	        		New.setFitWidth(CellWidth);
	        		New.setFitHeight(ColumnHeight);
	        		uppergridpane_preview.add(New, x, y);
	        	}
	    	}
	    }
    }
    
    private void disposeGrid() 
    {
    	lowergridpane_preview.getChildren().clear();
    	uppergridpane_preview.getChildren().clear();
    } 
    
    private int getRandomPlayerImg(int ID) 
    {    	
    	int PLID=ID%1000000/100000;
    	
    	for (Pair<Integer, Integer> pair : usedplayers) 
    	{
    		if (pair.getKey()==PLID)
    			return pair.getValue();
    	}
    	
    	Random rand = new Random();
    	Integer res;
    	do {
    		res = rand.nextInt(21);
    	} while (usedplayers.contains(new Pair<Integer, Integer>(PLID, res)));
    	
    	usedplayers.add(new Pair<Integer, Integer>(PLID, res));
    	return res;
    }
}
