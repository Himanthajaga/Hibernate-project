package lk.ijse.culinary.controller;

import io.github.palexdev.materialfx.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lk.ijse.culinary.bo.BOFactory;
import lk.ijse.culinary.bo.custom.StudentBO;
import lk.ijse.culinary.dto.StudentDto;
import lk.ijse.culinary.dto.UserDto;

public class UserDataFormController {

    @FXML
    private MFXButton btnAdd;

    @FXML
    private MFXButton btnCancel;

    @FXML
    private MFXComboBox<?> cmbCourse;

    @FXML
    private MFXTextField contact;

    @FXML
    private MFXDatePicker date;

    @FXML
    private Label lblAction;

    @FXML
    private Label studentId;

    @FXML
    private MFXTextField txtAddress;

    @FXML
    private MFXTextField txtEmail;

    @FXML
    private MFXTextField txtName;



    private final StudentBO studentBO = (StudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);



    @FXML
    void  btnAddOnAction(ActionEvent event) {

        boolean isValidated = validateFields();

        if (!isValidated){
            return;
        }

        if (btnAdd.getText().equals("Add")) {
            StudentDto studentDto = new StudentDto(txtEmail.getText(), txtName.getText(), txtAddress.getText(), date.getValue(), contact.getText());
            boolean isSaved = StudentBO.saveStudent(StudentDto);

            if (isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "User Saved").show();
                clearFields();
                closeTheWindow();

                //Load User Details
                StudentFormController.loadUserDetails();
            } else {
                new Alert(Alert.AlertType.ERROR, "User Doesnt Saved").show();
            }
        }else {
            UserDto userDto = new UserDto(txtEmail.getText(), txtName.getText(), txtAddress.getText(), txtPassword.getText());
            boolean isUpdated = userBO.updateUser(userDto);

            if (isUpdated){
                new Alert(Alert.AlertType.CONFIRMATION,"User Updated").show();

                //Load User Details
                StudentFormController.loadUserDetails();
            }
            else {
                new Alert(Alert.AlertType.ERROR,"User Doesnt Updated").show();
            }
        }

    }

    private void clearFields() {
        txtEmail.clear();
        txtName.clear();
        txtAddress.clear();
        date.clear();
        contact.clear();

    }


    private boolean validateFields() {

        boolean isEmailValid = txtEmail.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        if (!isEmailValid) {
            txtEmail.requestFocus();
            txtEmail.getStyleClass().add("mfx-text-field-error");
            return false;
        }

        txtEmail.getStyleClass().remove("mfx-text-field-error");

        boolean isNameValid = txtName.getText().matches("^[\\p{L} '-]+$");
        if (!isNameValid) {
            txtName.requestFocus();
            txtName.getStyleClass().add("mfx-text-field-error");
            return false;
        }

        txtName.getStyleClass().remove("mfx-text-field-error");



        boolean isAddressValid = txtAddress.getText().matches("^[a-zA-Z0-9,._#()/:;]+$");
        if (!isAddressValid) {
            txtAddress.requestFocus();
            txtAddress.getStyleClass().add("mfx-text-field-error");
            return false;
        }

        txtAddress.getStyleClass().remove("mfx-text-field-error");


        boolean isPasswordValid = txtPassword.getText().matches("^[a-zA-Z0-9@#]{3,}$");
        if (!isPasswordValid) {
            txtPassword.requestFocus();
            txtPassword.getStyleClass().add("mfx-text-field-error");
            return false;
        }

        txtPassword.getStyleClass().remove("mfx-text-field-error");
        return true;
    }

    @FXML
    void btnCancelOnAction(ActionEvent event) {
        closeTheWindow();
    }

    private void closeTheWindow() {
        Stage userDataStage= (Stage) txtName.getScene().getWindow();
        userDataStage.close();
    }


    public void setUserFormController(StudentFormController studentFormController) {
        this.userFormController = studentFormController;
    }

    public void loadUserData(String email){
        UserDto userDto = userBO.searchUser(email);
        setFields(userDto);
    }

    public void setBtnAndLblName(String action){
        btnAction.setText(action);
        lblAction.setText(action + " User");
    }


    private void setFields(UserDto userDto){
        txtEmail.setText(userDto.getEmail());
        txtName.setText(userDto.getName());
        txtAddress.setText(userDto.getAddress());
        txtPassword.setText(userDto.getPassword());

        //Disable Email Field
        txtEmail.setEditable(false);
    }



}

