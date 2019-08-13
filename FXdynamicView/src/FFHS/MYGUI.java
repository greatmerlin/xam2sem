package FFHS;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MYGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        final String[] names = {"Micha", "Andi", "Andy", "Tom", "Matze"};
        final ObservableList<String> entries = FXCollections.observableArrayList(names);

        // create a list View -> add our ObservableList
        final ListView<String> listView = new ListView<>(entries);
        listView.setPrefHeight(200);

        final TextField searchFor = new TextField();
        searchFor.setPromptText("Enter Filter");
        searchFor.textProperty().addListener((observable, oldValue, newValue) ->
        {
            //Kopie notwendig, da removeIf() in der Collection löscht

            final List<String> filteredEntries = new ArrayList<>(entries);

            final Predicate<String> caseInsensitiveContains = entry ->
            {
              return entry.toUpperCase().contains(newValue.toUpperCase());
            };
            filteredEntries.removeIf(caseInsensitiveContains.negate());

            listView.setItems(FXCollections.observableArrayList(filteredEntries));
        });


        final VBox vBox = new VBox();
        vBox.setPadding(new Insets(5,5,5,5));
        vBox.getChildren().addAll(searchFor,listView);  // add the list view to the vBox


        primaryStage.setScene(new Scene(vBox,300,150));
        primaryStage.setTitle("DynamicListViewExample");
        primaryStage.show();

    }
}
