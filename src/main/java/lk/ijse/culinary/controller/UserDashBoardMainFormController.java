package lk.ijse.culinary.controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import lk.ijse.culinary.bo.custom.impl.UserBOImpl;

import java.io.IOException;

public class UserDashBoardMainFormController {


    @FXML
    private MFXButton btnCourses;

    @FXML
    private MFXButton btnRegisterStudent;

    @FXML
    private MFXButton btnSetting;

    @FXML
    private MFXButton btnStudentSearch;

    @FXML
    private Circle cirUserImage;

    @FXML
    private AnchorPane holderPane;

    @FXML
    private Label idUserName;

    @FXML
    private Pane imgAndNameHolderPane;

    public void initialize() throws IOException {
        setUserNameAndImage(true);

    }

    private void setUserNameAndImage(boolean flag) {
        imgAndNameHolderPane.setVisible(flag);
        Platform.runLater(() -> {
            idUserName.setText(UserBOImpl.loggedUser.getName());
            Image image = new Image(UserBOImpl.loggedUser.getImgUrl());
            cirUserImage.setFill(new ImagePattern(image));
        });

    }


@FXML
    void btnCoursesOnAction(ActionEvent event) throws IOException {
        setButtonColors(Pages.STUDENTSEARCH);
        setUserNameAndImage(true);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/bookSearchForm.fxml"));
        Pane bookSearchPane = (Pane) fxmlLoader.load();
        holderPane.getChildren().clear();
        holderPane.getChildren().add(bookSearchPane);
    }
    @FXML
    void btnStudentSearchOnAction(ActionEvent event) throws IOException {
        setButtonColors(Pages.STUDENTSEARCH);
        setUserNameAndImage(true);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/bookSearchForm.fxml"));
        Pane bookSearchPane = (Pane) fxmlLoader.load();
        holderPane.getChildren().clear();
        holderPane.getChildren().add(bookSearchPane);
    }

    @FXML
    void btnRegisterStudentOnAction(ActionEvent event) throws IOException {
        setButtonColors(Pages.REGISTER);
        setUserNameAndImage(true);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/userBorrowBookForm.fxml"));
        Pane historyPane = (Pane) fxmlLoader.load();
        holderPane.getChildren().clear();
        holderPane.getChildren().add(historyPane);
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/mainForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Login");
        stage.show();

        //Close the Current Window
        Stage dashboard= (Stage) holderPane.getScene().getWindow();
        dashboard.close();
    }

    @FXML
    void btnSettingsOnAction(ActionEvent event) throws IOException {
        setButtonColors(Pages.SETTINGS);
        setUserNameAndImage(false);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/userSettingsForm.fxml"));
        Pane userSettingsPane = (Pane) fxmlLoader.load();
        holderPane.getChildren().clear();
        holderPane.getChildren().add(userSettingsPane);
    }

    public enum Pages{
        STUDENTSEARCH,REGISTER,SETTINGS,COURSES
    }

    private void setButtonColors(Pages pages){
        btnStudentSearch.getStyleClass().remove("mfx-button-StudentSearch-active");
        btnRegisterStudent.getStyleClass().remove("mfx-button-RegisterStudent-active");
        btnSetting.getStyleClass().remove("mfx-button-Settings-active");
        btnCourses.getStyleClass().remove("mfx-button-Courses-active");

        switch (pages){
            case STUDENTSEARCH:
                btnStudentSearch.getStyleClass().add("mfx-button-StudentSearch-active");
                break;
            case REGISTER:
                btnRegisterStudent.getStyleClass().add("mfx-button-RegisterStudent-active");
                break;
            case SETTINGS:
                btnSetting.getStyleClass().add("mfx-button-Settings-active");
                break;
            case COURSES:
                btnCourses.getStyleClass().add("mfx-button-Courses-active");
                break;
        }
    }




}

