package FFHS;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyButtons extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {

        final Button plainButton = new Button("Plain red text Button");
        final Button loginButton = new Button("Login Button");
        final Button fancyButton = new Button("Fancy Button");

        // Verknüpfung mit der CSS

        loginButton.getStyleClass().add("customLoginButton");
        fancyButton.setId("fancyButton");

        final FlowPane flowPane = new FlowPane();
        flowPane.setHgap(7);
        flowPane.setVgap(7);
        flowPane.setPadding(new Insets(7,7,7,7));
        flowPane.getChildren().addAll(plainButton,loginButton,fancyButton);

        primaryStage.setScene(new Scene(flowPane,480,160));

        // Verknüpfung von Scene und CSS

        primaryStage.getScene().getStylesheets().add(this.getClass().getResource("buttons.css").toExternalForm());

        primaryStage.setTitle(this.getClass().getSimpleName());
        primaryStage.show();
    }
}
