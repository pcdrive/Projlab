package controller;

import data.Data;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import sokoban.Navigator;

import java.io.IOException;
import java.util.stream.Collectors;

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

public class OptionsController {
    @FXML
    public Button button_megse;
    @FXML
    public Button button_mentes;
    @FXML
    public ComboBox<String> combobox_resolutionselector;
    @FXML
    public CheckBox checkbox_fullscreenselector;

    public OptionsController() {
    }

    public void onButtonDownAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button_mentes) {
            Data.resolution = combobox_resolutionselector.getSelectionModel().getSelectedIndex();
            Data.fullScreen = checkbox_fullscreenselector.isSelected();
        }
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/data/resources/layout/MenuView.fxml"));
            Navigator.navigate(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        checkbox_fullscreenselector.setSelected(Data.fullScreen);
        ObservableList<String> tmpResolutions = Data.resolutions.stream().map(res -> res.getKey().toString() + "x" + res.getValue().toString()).collect(Collectors.toCollection(FXCollections::observableArrayList));
        combobox_resolutionselector.setItems(tmpResolutions);
        combobox_resolutionselector.getSelectionModel().select(Data.resolution);
    }
}
