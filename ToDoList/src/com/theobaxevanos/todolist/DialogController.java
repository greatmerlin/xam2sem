package com.theobaxevanos.todolist;

import com.theobaxevanos.todolist.dataModel.ToDoData;
import com.theobaxevanos.todolist.dataModel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescription;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public ToDoItem processResilts(){
        String shortDesctiption = shortDescription.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        ToDoItem newItem = new ToDoItem(shortDesctiption,details,deadlineValue);
        ToDoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
