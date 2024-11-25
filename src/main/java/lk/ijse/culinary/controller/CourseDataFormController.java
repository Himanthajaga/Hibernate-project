package lk.ijse.culinary.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lk.ijse.culinary.bo.BOFactory;
import lk.ijse.culinary.bo.custom.CourseBO;
import lk.ijse.culinary.dao.custom.CourseDAO;
import lk.ijse.culinary.dto.CourseDto;
import lk.ijse.culinary.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDataFormController {

    @FXML
    private MFXButton btnAdd;

    @FXML
    private MFXButton btnCancel;

    @FXML
    private Label lblAction;

    @FXML
    private MFXTextField txtCourseDuration;

    @FXML
    private MFXTextField txtCourseFee;

    @FXML
    private MFXTextField txtCourseId;

    @FXML
    private MFXTextField txtCourseName;
    private List<CourseDto> courseList = new ArrayList<>();

    CourseBO courseBO = (CourseBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COURSE);

    @FXML
    void btnAddOnction(ActionEvent event) {
        // Retrieve input values
        String courseId = txtCourseId.getText();
        String courseName = txtCourseName.getText();
        String courseDuration = txtCourseDuration.getText();
        String courseFeeText = txtCourseFee.getText();

        // Validate input fields
        if (courseId.trim().isEmpty() || courseName.trim().isEmpty() || courseDuration.trim().isEmpty() || courseFeeText.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please fill all the fields").show();
            return;
        }

        // Parse course fee
        double courseFee;
        try {
            courseFee = Double.parseDouble(courseFeeText);
        } catch (NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Invalid course fee").show();
            return;
        }

        // Create CourseDto object
        CourseDto courseDto = new CourseDto(courseId, courseName, courseDuration, courseFee);

        // Save course using CourseBO
        try {
            boolean isAdded = courseBO.saveCourse(courseDto);

            if (isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Course Added Successfully").show();

                clearFields();
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to add the course").show();
            }
        } catch (Exception e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "An error occurred while adding the course").show();
        }

    }

    private void clearFields() {
        txtCourseId.clear();
        txtCourseName.clear();
        txtCourseDuration.clear();
        txtCourseFee.clear();
    }

    @FXML
    void btnCancelOnAction(ActionEvent event) {
       closeTheWindow();
    }

    private void closeTheWindow() {
        Stage userDataStage= (Stage) txtCourseId.getScene().getWindow();
        userDataStage.close();
    }

}
