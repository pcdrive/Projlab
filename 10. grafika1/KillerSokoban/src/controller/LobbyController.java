package controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import data.Data;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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

public class LobbyController {
	
	@FXML
	public Button button_megse;
	
	@FXML
	public Button button_start;


	public void onButtonDownAction(ActionEvent actionEvent) {
	    if (actionEvent.getSource() == button_start) {
	    	Data.jatek.StartSzerver();
	        try {
	            Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/GameView.fxml"));
	            Navigator.navigate(root);
	        } catch (IOException e) {
	            e.printStackTrace();
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
}
