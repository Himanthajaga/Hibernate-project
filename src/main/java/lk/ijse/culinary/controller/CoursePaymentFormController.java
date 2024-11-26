package lk.ijse.culinary.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lk.ijse.culinary.bo.BOFactory;
import lk.ijse.culinary.bo.custom.CourseBO;
import lk.ijse.culinary.bo.custom.PaymentBO;
import lk.ijse.culinary.bo.custom.StudentBO;
import lk.ijse.culinary.bo.custom.StudentCourseBO;
import lk.ijse.culinary.dto.PaymentDto;
import lk.ijse.culinary.dto.StudentDto;
import lk.ijse.culinary.tm.PaymentTm;

import java.util.ArrayList;
import java.util.List;

public class CoursePaymentFormController {

    @FXML
    private MFXButton btnAdd;

    @FXML
    private MFXButton btnSearch;

    @FXML
    private TableColumn<PaymentTm,String> colCourseId;

    @FXML
    private TableColumn<PaymentTm,String> colID;

    @FXML
    private TableColumn<PaymentTm,String> colName;

    @FXML
    private TableColumn<PaymentTm,String> colPayAmount;

    @FXML
    private TableColumn<PaymentTm,String> colPayDate;

    @FXML
    private TableColumn<PaymentTm,String> colPaymentID;

    @FXML
    private TableColumn<PaymentTm,String> colRemove;

    @FXML
    private TableView<PaymentTm> tblPayment;

    @FXML
    private MFXTextField txtSearch;
    private List<PaymentDto> paymenttList = new ArrayList<>();
    StudentBO studentBO = (StudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);
    CourseBO courseBO = (CourseBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COURSE);
    PaymentBO paymentBO = (PaymentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PAYMENT);
    StudentCourseBO studentCourseBO = (StudentCourseBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT_COURSE);
    public void initialize(){
        refreshTable();
        fetchAllPayments();
        setCellValueFactory();
    }
    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

}
