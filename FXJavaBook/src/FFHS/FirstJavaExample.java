package FFHS;

import javafx.application.Application;  // basis FX app Klasse
import javafx.scene.Node;               // create a Label - Text
import javafx.scene.Scene;              // be able to unite the Stage, Scene, Pane
import javafx.scene.control.Label;      //Darstellung von Text
import javafx.scene.layout.StackPane;   //Container
import javafx.stage.Stage;              // Bühne

public class FirstJavaExample extends Application {

    @Override                                                                     // abstract Method start (Stage)
    public void start(final Stage stage) throws Exception {                       // Stage = bildet die Bühne

        final StackPane stackPane = new StackPane();                              // Scene = Pane -> Container of elemente (px Labels)

        final Node labelNode = new Label("Hello JavaFX World");             //create a Label (to put text in it)
        stackPane.getChildren().add(labelNode);                                 //add the Label to the Container (Pane)

        stage.setScene(new Scene(stackPane, 250 , 75));          // verbinden Stage, Scene (and StackPane (Bühne, ContentPanel <- Container with Elements) + window dimensions )

        stage.setTitle("First JavaFX example");                                // Fenster Titel setzen
        stage.setResizable(true);                                             //make the window resizable

        stage.centerOnScreen();                                                 // Positionierung
        stage.show();                                                          //make sichtbar




    }
}
