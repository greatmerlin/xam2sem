package FFHS;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class LeGui extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {

        final List<Person> persons = createDemoPersons();

        final ObservableList<Person> entries = FXCollections.observableArrayList(persons);

        final ComboBox<Person> comboBox = new ComboBox<>(entries);

        final ListView<Person> listView = new ListView<>(entries);

        comboBox.setCellFactory(list -> new PersonCell());  // kanei oti k i toString stp comboBox
        comboBox.setButtonCell(new PersonCell());
        listView.setCellFactory(list -> new PersonCell()); // kanei oti k i toString sto list View

        final VBox vBox = new VBox(10,comboBox,listView);
        vBox.setPadding(new Insets(7));

        primaryStage.setScene(new Scene(vBox,300,200));
        primaryStage.setTitle("ComboBoxListViewExample");
        primaryStage.show();
    }

    private List<Person> createDemoPersons() {

        final Person micha = new Person("Micha", 43, Color.BLUE,184);
        final Person tom = new Person("Tom", 22, Color.GREEN,177);
        final Person tim = new Person("Tim", 43, Color.BLUE,181);
        final Person andy = new Person("Andy", 31, Color.BROWN,178);

        return Arrays.asList(micha, tom, tim, andy);
    }
}
