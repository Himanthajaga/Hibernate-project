package lk.ijse.culinary.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class UserDashBoardFormController {

    @FXML
    private TableColumn<?, ?> colCourseName;

    @FXML
    private TableColumn<?, ?> colDuration;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colRegisteredDate;

    @FXML
    private TableColumn<?, ?> colRestPayAmount;

    @FXML
    private AnchorPane dashBoardPane;

    @FXML
    private Label lblBookCount;

    @FXML
    private Label lblDueBookCount;

    @FXML
    private Label lblUserCount;

    @FXML
    private TableView<?> tblStudentCourses;

}
