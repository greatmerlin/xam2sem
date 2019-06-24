package FFHS;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class MYGUI extends Application {

    final ChangeListener<Number> changeReporter =
                                (observable, oldValue, newValue) ->
                                System.out.println("Value changed: " +
                                oldValue + " -> " + newValue);

    @Override
    public void start(Stage primaryStage) throws Exception {

        final Slider slider = new Slider(0,100,0);
        slider.valueProperty().addListener(changeReporter);  // auto usarei ton ChangeListener apo panw k kanei report se sout ta values
        slider.showTickMarksProperty().set(true); // deixnei tis grammoules panw stin slider
        slider.showTickLabelsProperty().set(true); // deixnei tous fix ari8mous sto slider

        final TextField textField = new TextField(); // to parakatw einai o tropos na sundeseis to textfield me ton slider
        textField.textProperty().bindBidirectional(slider.valueProperty(),
                                                    new NumberStringConverter()); // gia na metatrepsei to String tou textfield se double tou Slider

        final VBox vBox = new VBox(textField, slider);
        vBox.setPadding(new Insets(5,5,5,5));
        vBox.setSpacing(10);

        primaryStage.setScene(new Scene(vBox,300,100));
        primaryStage.setTitle("TextFieldAndSliderPropertyExample");
        primaryStage.show();
    }
}
