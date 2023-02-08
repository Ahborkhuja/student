package controller;

import dao.DatabaseStudents;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentsController {
    @FXML
    public VBox idCol,studentCol,checkCol,FirstNameCol,SurnameCol,FamilyCol,emailCol,
            deparmentCol,actionCol,YearCol,addressCol,phoneNumberCol;

    public void AddStudentAction(javafx.event.ActionEvent actionEvent) throws IOException, SQLException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/AddStudentForm.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Add Student");
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();

    }

    public void Students() throws SQLException {
        DatabaseStudents db = new DatabaseStudents();
        ResultSet data = db.getStudentsDb();
        while (data.next()){
            System.out.println(data.getString("ID"));
            labelAdding(data,"ID",idCol);
            labelAdding(data,"Student_ID",studentCol);
            labelAdding(data,"First_name",FirstNameCol);
            labelAdding(data,"Second_name",SurnameCol);
            labelAdding(data,"Family_name",FamilyCol);
            labelAdding(data,"Email",emailCol);
            labelAdding(data,"Department",deparmentCol);
            labelAdding(data,"Year",YearCol);
            labelAdding(data,"Phone_number",phoneNumberCol);
            labelAdding(data,"Address",addressCol);
        }
    }
    public static void labelAdding(ResultSet datas, String colName, VBox Coltype) throws SQLException {
        String columnName = datas.getString(colName);
        System.out.println(colName);
        Label label = new Label(" ");
        label.setText(columnName);
       // Coltype.getChildren().add(label);
    }
}
