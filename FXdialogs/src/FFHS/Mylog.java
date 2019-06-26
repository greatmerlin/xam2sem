package FFHS;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.Optional;

public class Mylog extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        final Optional<ButtonType> result = showConfirmationDialog();

        if(result.isPresent() && result.get() == ButtonType.OK){

            final Optional<String> enteredText = showTextInputDialog();

            final Optional<String> selectedNickName = showNickNameSelectDialog();
            System.out.println(selectedNickName);
        }
    }

    private Optional<String> showNickNameSelectDialog() {

        final ChoiceDialog<String> dialog = new ChoiceDialog<>("Iron", "Dark", "Lord", "Dragon");

        dialog.setTitle("Nickname Selection");
        dialog.setHeaderText("");
        dialog.setContentText("Please enter your desired Nickname");
        dialog.setGraphic(null);

        return dialog.showAndWait();
    }

    private Optional<String> showTextInputDialog() {

        final TextInputDialog textInputDialog = new TextInputDialog("What's your name");

        textInputDialog.setTitle("Text Input Dialog");
        textInputDialog.setHeaderText("This is a Text Input Dialog");
        textInputDialog.setContentText("Please enter your name");
        textInputDialog.setGraphic(new ImageView());

        return textInputDialog.showAndWait();
    }

    private Optional<ButtonType> showConfirmationDialog() {
        return new Alert(Alert.AlertType.CONFIRMATION,
                "Do you want to learn more about dialogs?").showAndWait();
    }
}
