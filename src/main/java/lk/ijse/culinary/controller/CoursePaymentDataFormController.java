package lk.ijse.culinary.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXFilterComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import lk.ijse.culinary.dto.CourseDto;

public class CoursePaymentDataFormController {
    @FXML
    private MFXButton btnAdd;

    @FXML
    private MFXButton btnCancel;

    @FXML
    private MFXFilterComboBox<?> cmbCourse;

    @FXML
    private Label lblPayID;

    @FXML
    private MFXTextField txtName;

    @FXML
    private MFXTextField txtStudentId;

    @FXML
    private MFXTextField txtpayment;
    @FXML
    void btnAddOnAction(ActionEvent event) {
        // Retrieve input values
        String payId = lblPayID.getText();
        String studentId = txtStudentId.getText();
        String studentName = txtName.getText();
        String cmbCourse = this.cmbCourse.getSelectionModel().getSelectedItem().toString();
        String payment = txtpayment.getText();

//        // Validate input fields
//        if (studentId.trim().isEmpty() || studentName.trim().isEmpty() || cmbCourse.trim().isEmpty() || payment.trim().isEmpty()) {
//            new Alert(Alert.AlertType.ERROR, "Please fill all the fields").show();
//            return;
//        }
//
//        // Parse course fee
//        double courseFee;
//        try {
//            courseFee = Double.parseDouble(courseFeeText);
//        } catch (NumberFormatException e) {
//            new Alert(Alert.AlertType.ERROR, "Invalid course fee").show();
//            return;
//        }
//
//        // Create CourseDto object
//        CourseDto courseDto = new CourseDto(courseId, courseName, courseDuration, courseFee);
//        System.out.println("awaaaaaaaooooooooooo");
//        // Save course using CourseBO
//        try {
//            boolean isAdded = courseBO.saveCourse(courseDto);
//            System.out.println("awaaaaaaa");
//            if (isAdded) {
//                new Alert(Alert.AlertType.CONFIRMATION, "Course Added Successfully").show();
//                clearFields();
//            } else {
//                new Alert(Alert.AlertType.ERROR, "Failed to add the course").show();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            new Alert(Alert.AlertType.ERROR, "An error occurred while adding the course").show();
//        }

    }

    @FXML
    void btnCancelOnAction(ActionEvent event) {

    }

}
