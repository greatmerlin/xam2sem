package FFHS;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MyGui extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {

        final String[] colors = {"red", "green", "yellow", "blue", "black", "gray", "brown", "orange"};

        final ObservableList<String> entries = FXCollections.observableArrayList(colors);

        final ComboBox<String> comboBox = new ComboBox<>(entries);
        comboBox.getSelectionModel().selectFirst();

        final ListView<String> listView = new ListView<>(entries);





        final VBox vBox = new VBox(10,comboBox,listView);
        vBox.setPadding(new Insets(7));

        primaryStage.setScene(new Scene(vBox,300,200));
        primaryStage.setTitle("ComboBoxListViewExample");
        primaryStage.show();
    }
}
