package controller;

import data.Data;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import server.PalyaAdat;
import sokoban.Navigator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

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
public class ServerController {
    @FXML
    public TextField textfield_jatekos1nev;
    @FXML
    public TextField textfield_jatekos2nev;
    @FXML
    public TextField textfield_port;
    @FXML
    public Button button_megse;
    @FXML
    public Button button_start;
    @FXML
    public ComboBox<String> combobox_palyavalaszto;
    @FXML
    public GridPane lowergridpane_preview;
   /* @FXML
    public GridPane uppergridpane_preview;*/

    private ImageView CelhelyImg;
    private ImageView DobozImg;
    private ImageView FalImg;
    private ImageView JeloltDImg;
    private ImageView KapcsoloImg;
    private ImageView LyukImg;
    private ImageView MezImg;
    private ImageView OlajImg;
    private ImageView MezOlajImg;
    private ImageView UresMezoImg;
    private ArrayList<ImageView> PlayerImgs;
    
    public ServerController() 
    {
        CelhelyImg = new ImageView("/data/resources/drawable/celhely.png");
        DobozImg = new ImageView("/data/resources/drawable/doboz.png");
        FalImg = new ImageView("/data/resources/drawable/fal.png");
        JeloltDImg = new ImageView("/data/resources/drawable/jeloltdoboz.png");
        KapcsoloImg = new ImageView("/data/resources/drawable/kapcsolo.png");
        LyukImg = new ImageView("/data/resources/drawable/lyuk.png");
        MezImg = new ImageView("/data/resources/drawable/mez.png");
        MezOlajImg = new ImageView("/data/resources/drawable/mezolaj.png");
        OlajImg = new ImageView("/data/resources/drawable/olaj.png");
        UresMezoImg = new ImageView("/data/resources/drawable/uresmezo.png");
        fillPlayerImages();
    }
    
    public void onButtonDownAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button_start) {
            if (textfield_jatekos1nev.getText().isEmpty() || textfield_jatekos2nev.getText().isEmpty() || textfield_port.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hiányos adatok!");
                alert.setHeaderText(null);
                alert.setContentText("Nem adott meg minden adatot!");
                alert.show();
                return;
            } else {
                //valamit csinaljon....
            }
        } else if (actionEvent.getSource() == button_megse) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/MenuView.fxml"));
                Navigator.navigate(root);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void initialize() {
        combobox_palyavalaszto.setItems(Data.jatek.getPalyaLista());
        combobox_palyavalaszto.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            	
            	int[] IDs = Data.jatek.getIDLista(newValue);
            	
            	setGrid();
            	
            	fillGrid();
            }
        });
    }
    

    private void fillPlayerImages()
    {
    	for (int i=0;i<21;i++) 
    	{
    		PlayerImgs.add(new ImageView("data/resources/drawable/jatekosok/jo0.png"));
    	}
    }
    
    private void setGrid() 
    {
    	for (int i=0;i<Data.PalyaX;i++) 
    	{
            ColumnConstraints row = new ColumnConstraints();
            lowergridpane_preview.getColumnConstraints().add(row);
       /*     row = new ColumnConstraints();
            uppergridpane_preview.getColumnConstraints().add(row);*/
    	}

    	for (int i=0;i<Data.PalyaY;i++) 
    	{
    		RowConstraints row = new RowConstraints();
            lowergridpane_preview.getRowConstraints().add(row);
    	/*	row = new RowConstraints();
            uppergridpane_preview.getRowConstraints().add(row);*/
    	}
    }
    
    private void fillGrid() 
    {
    	int[] IDs = Data.PA.palya;
    	
    	for (int x=0; x<Data.PalyaX;x++) 
    	{
        	for (int y=0; y<Data.PalyaY;y++) 
        	{
        		switch ((int)(IDs[x+y*10]%1000/10000)) 
        		{
        			case 0:{ lowergridpane_preview.add(UresMezoImg, x, y); }break;
        			case 1:{ lowergridpane_preview.add(FalImg, x, y); }break;
        			case 2:{ lowergridpane_preview.add(LyukImg, x, y); }break;
        			case 3:{ if ((int)(IDs[x+y*10]%100000/100)==0) {lowergridpane_preview.add(UresMezoImg, x, y);} else {lowergridpane_preview.add(CelhelyImg, x, y);} }break;
        			case 4:{ if ((int)(IDs[x+y*10]%100000/100)==0) {lowergridpane_preview.add(UresMezoImg, x, y);} else {lowergridpane_preview.add(LyukImg, x, y);} }break;
        			case 5:{ lowergridpane_preview.add(KapcsoloImg, x, y); }break;
        		}
        	}
    	}
    }
}