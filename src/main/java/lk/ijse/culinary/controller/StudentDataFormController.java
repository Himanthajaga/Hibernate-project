package lk.ijse.culinary.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lk.ijse.culinary.bo.BOFactory;
import lk.ijse.culinary.bo.custom.CourseBO;
import lk.ijse.culinary.bo.custom.StudentBO;
import lk.ijse.culinary.dto.AdminDto;
import lk.ijse.culinary.dto.CourseDto;
import lk.ijse.culinary.dto.StudentDto;

import java.util.List;

public class StudentDataFormController {

    @FXML
    private MFXButton btnAdd;

    @FXML
    private MFXButton btnCancel;

    @FXML
    private MFXComboBox<?> cmbCourse;

    @FXML
    private MFXTextField contact;

    @FXML
    private MFXDatePicker dateofbirth;

    @FXML
    private Label lblAction;

    @FXML
    private Label lblstudentId;

    @FXML
    private MFXTextField txtAddress;

    @FXML
    private MFXTextField txtEmail;

    @FXML
    private MFXTextField txtName;
    StudentBO studentBO = (StudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);
    CourseBO courseBO = (CourseBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COURSE);

    void initialize() {
       generateStudentId();
         loadCourses();
    }

    private void generateStudentId() {
        try {
            String newStudentId = studentBO.getNewStudentId();
            lblstudentId.setText(newStudentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadCourses() {
        try {
            List<CourseDto> courseDtoList = courseBO.getAllCourse();
            for (CourseDto courseDto : courseDtoList) {
                cmbCourse.getItems().add(courseDto.getCourseName());
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void btnAddOnAction(ActionEvent event) {
        // Retrieve input values
        String studentId = lblstudentId.getText();
        String email = txtEmail.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String course = cmbCourse.getSelectionModel().getSelectedItem().toString();
        String dob = dateofbirth.getText();
        String contactNo = contact.getText();


        // Validate input fields
        if (studentId.trim().isEmpty() || email.trim().isEmpty() || name.trim().isEmpty() || address.trim().isEmpty() || course.trim().isEmpty() || dob.trim().isEmpty() || contactNo.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please fill all the fields").show();
            return;
        }

        // Create a StudentDTO object
        StudentDto studentDto = new StudentDto(studentId, email, name, address, course, dob, contactNo);

        // Save the student
        try {
            boolean isSaved = studentBO.saveStudent(studentDto);
            if (isSaved) {
                clearFields();
                new Alert(Alert.AlertType.CONFIRMATION, "Student saved successfully").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to save the student").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "An error occurred: " + e.getMessage()).show();
        }
    }

    private void clearFields() {
        lblstudentId.setText("");
        txtEmail.clear();
        txtName.clear();
        txtAddress.clear();
        cmbCourse.getSelectionModel().clearSelection();
        dateofbirth.clear();
        contact.clear();
    }

    @FXML
    void btnCancelOnAction(ActionEvent event) {
        closeTheWindow();
    }

    private void closeTheWindow() {
        Stage userDataStage= (Stage) lblstudentId.getScene().getWindow();
        userDataStage.close();
    }

    @FXML
    void cmbCourseOnAction(ActionEvent event) {

    }

}
