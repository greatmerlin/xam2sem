package FFHS;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.shape.Rectangle;

public class PersonCell extends ListCell<Person> {

    @Override
    protected void updateItem(final Person item,final boolean empty) {
        super.updateItem(item, empty);
        if (item != null){

            final Rectangle rect = new Rectangle(30,30);
            rect.setFill(item.getEyecolor());
            setGraphic(rect);

            setText(item.getName() + " (" + item.getAge() + " years)");
        }
    }
}
