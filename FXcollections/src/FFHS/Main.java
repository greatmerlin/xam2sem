package FFHS;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class Main {

    public static void main(String[] args) {


        final String[] values = { "Orig1", "Orig2"};

        final ObservableList<String> content = FXCollections.observableArrayList(values);

        final ListChangeListener<String> changeReporter = change -> reportChanges(change);

        content.addListener(changeReporter);

        System.out.println("Modifications");
        performChanges(content);

        System.out.println("rotate()");
        FXCollections.rotate(content,2);

        System.out.println("shuffle()");
        FXCollections.shuffle(content);
    }

    private static void performChanges(ObservableList<String> content) {

        content.addAll("A","B","C");
        content.removeAll("Orig1", "Orig2");
        content.add("1");
        content.add("2");
    }

    private static void reportChanges(ListChangeListener.Change<? extends String> change) {

        System.out.println("Changed to: " + change.getList());
    }
}
