package FFHS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class DrawMe extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Canvas 300x200 Pixel erzeugen
        final Canvas canvas = new Canvas(300,200);
        drawOnCanvas(canvas);

        final FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(canvas);

        primaryStage.setScene(new Scene(flowPane,250,100));
        primaryStage.setTitle(this.getClass().getSimpleName());
        primaryStage.show();
    }

    private void drawOnCanvas(final Canvas canvas) {

        final GraphicsContext gc = canvas.getGraphicsContext2D();

        //Canvas-Hintergrund als Rechteck löschen
        gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());

        //Oval zeichnen
        gc.setStroke(Color.DARKGOLDENROD);
        gc.setLineWidth(4);
        gc.strokeOval(10,20,40,40);

        //Abgerundetes Rechteck füllen
        gc.setFill(Color.BLUE);
        gc.fillRoundRect(60,20,40,40,10,10);

        //Pfad definieren
        gc.setStroke(Color.FIREBRICK);
        gc.beginPath();
        gc.moveTo(110,30);
        gc.lineTo(170,20);
        gc.bezierCurveTo(150,110,130,30,110,40);
        gc.closePath();

        //path malen
        gc.stroke();

        //Gefülltes Tortenstück darstellen
        gc.setFill(Color.web("dodgerblue"));
        gc.fillArc(180,30,30,30,45,270, ArcType.ROUND);
    }
}
