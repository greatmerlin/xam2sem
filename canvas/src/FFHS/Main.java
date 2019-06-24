package FFHS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("testCanvas"); // give a title to the main Window

        Group root = new Group(); // Parent - main Window/Scene, the stage is as local variable in the start Method
        Canvas canvas = new Canvas(300, 250); // main Node
        GraphicsContext gc = canvas.getGraphicsContext2D(); //the way to show the canvas, save canvas in a var of type GraphicsContext
        drawshapes(gc);    //what to draw, use as parameter the above created variable
        root.getChildren().add(canvas);  // set the canvas as child of your scene (attach the canvas with the scene)
        primaryStage.setScene(new Scene(root)); // connect the stage and the scene (with it's nodes, here canvas)
        primaryStage.show(); // show the stage and everything below it (scene and nodes)
    }

    private void drawshapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.fillRoundRect(110, 60, 100, 100, 10, 10);
        gc.strokeRoundRect(110, 60, 100, 100, 10, 10);
    }
}
