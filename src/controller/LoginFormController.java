package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.SQLException;

public class LoginFormController {
    public JFXTextField txtUsername;
    public JFXPasswordField txtPassword;
    public StackPane loginContext;


    public void loginOnAction(ActionEvent actionEvent) throws IOException, SQLException {
        Stage stage = (Stage) loginContext.getScene().getWindow();
//        System.out.println(connectdb());
        if (txtUsername.getText().equalsIgnoreCase("admin")) {//  <<<<<<<<<<
            if (txtPassword.getText().equalsIgnoreCase("1234")) {//  <<<<<<<<<
                stage = (Stage) loginContext.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
                stage.setResizable(false);
                stage.centerOnScreen();
                stage.show();
            }else{
                if (txtPassword.isFocused()) {
                    txtPassword.setFocusColor(Paint.valueOf("#ff0000"));
                }else{
                    txtPassword.setUnFocusColor(Paint.valueOf("#ff0000"));
                }
            }
        }
        else {
            if (txtUsername.isFocused()) {
                txtUsername.setFocusColor(Paint.valueOf("#ff0000"));
            }else{
                txtUsername.setUnFocusColor(Paint.valueOf("#ff0000"));
            }
        }
    }


    public void txtUserNameMouseClicked(MouseEvent mouseEvent) {
        txtUsername.setFocusColor(Paint.valueOf("#0000ff"));
        txtUsername.setUnFocusColor(Paint.valueOf("#0000ff"));
    }

    public void txtPasswordMouseClicked(MouseEvent mouseEvent) {
        txtPassword.setFocusColor(Paint.valueOf("#0000ff"));
        txtPassword.setUnFocusColor(Paint.valueOf("#0000ff"));
    }

    public void closeOnAction(MouseEvent mouseEvent) {
        System.exit(0);
    }
}
