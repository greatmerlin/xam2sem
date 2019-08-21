package FFHS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyMenu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        final MenuBar menuBar = new MenuBar();
        final Menu fileMenu = new Menu("File");
        final MenuItem exitMenuItem = new MenuItem("Exit");

        fileMenu.getItems().addAll(new MenuItem("New"), new MenuItem("Save"), new SeparatorMenuItem(), exitMenuItem);

        final Menu otherMenu = new Menu("Custom");

        otherMenu.getItems().addAll(new MenuItem("MenuItem 1"), new MenuItem("MenuItem 2"));

        //special menu with slider

        final CustomMenuItem customMenuItem = new CustomMenuItem(new Slider());
        customMenuItem.setHideOnClick(false);

        //add custom menu item to the other menu
        otherMenu.getItems().add(customMenuItem);

        //action handling for exit and  slider

        exitMenuItem.setOnAction(event -> {

            final Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to exit?");

            alert.showAndWait().ifPresent(response -> {

                if(response == ButtonType.OK){

                    primaryStage.close();
                }
            });
        });
        customMenuItem.setOnAction(event -> {

            final Slider slider = (Slider)customMenuItem.getContent();
            System.out.println("Slider value: " + slider.getValue());
        });

        menuBar.getMenus().addAll(fileMenu,otherMenu);

        final VBox mainLayout = new VBox();
        mainLayout.getChildren().addAll(menuBar);

        primaryStage.setTitle("MenuExample");
        primaryStage.setScene(new Scene(mainLayout, 300,100));
        primaryStage.show();
    }
}
