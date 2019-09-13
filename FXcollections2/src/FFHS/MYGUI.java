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

public class MYGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        final String[] names = {"Micha", "Andi", "Andy", "Tom", "Matze"};
        final ObservableList<String> entries = FXCollections.observableArrayList(names);

        // create a list View -> add our ObservableList
        final ListView<String> listView = new ListView<>(entries);

        final Button addButton = new Button("add");
        final TextField textField = new TextField();
        final Button removeButton = new Button("remove");

        //add a Toolbar and inside the Toolbar the buttons and textfield we added
        final ToolBar toolBar = new ToolBar(addButton, textField, new Separator(), removeButton);

        final VBox vBox = new VBox();
        vBox.setPadding(new Insets(5,5,5,5));
        vBox.getChildren().addAll(toolBar,listView);  // add the list view to the vBox

        //Action Handling

        final SelectionModel<String> selectionModel = listView.getSelectionModel();
        addButton.setOnAction(event -> entries.add(textField.getText()));
        addButton.setOnAction(event ->
        {
                entries.add(textField.getText());

                listView.scrollTo(entries.size()); // jump to the new entry

        });
        removeButton.setOnAction(event ->
        {
            entries.remove(selectionModel.getSelectedItem());
        });

        //usability steigen: Button disabling

        addButton.disableProperty().bind(textField.textProperty().isEmpty());
        removeButton.disableProperty().bind(Bindings.isNull(
                selectionModel.selectedItemProperty()
        ));

        primaryStage.setScene(new Scene(vBox,400,175));
        primaryStage.setTitle("ListViewExample");
        primaryStage.show();

    }
}
