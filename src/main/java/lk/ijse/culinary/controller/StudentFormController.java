package lk.ijse.culinary.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentFormController {

    @FXML
    private AnchorPane StudentPane;

    @FXML
    private MFXButton btnAdd;

    @FXML
    private MFXButton btnRemove;

    @FXML
    private MFXButton btnSearch;

    @FXML
    private MFXButton btnUpdate;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colContact;

    @FXML
    private TableColumn<?, ?> colDob;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableView<?> tblStudent;

    @FXML
    private MFXTextField txtSearch;
    private StudentFormController studentFormController;

    @FXML
    void btnAddOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/studentDataForm.fxml"));
        Parent rootNode = loader.load();

//        StudentDataFormController studentDataFormController = loader.getController();
//        studentDataFormController.setS(this);
//        //Set Button Name
//        studentDataFormController.setBtnAndLblName("Add");


        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Add User");
        stage.show();
    }
    public void setStudentFormController(StudentFormController studentFormController) {
        this.studentFormController = studentFormController;
    }
//    public void setBtnAndLblName(String action){
//        btnAdd.setText(action);
//        lbl.setText(action + " User");
//    }
    @FXML
    void btnRemoveOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
