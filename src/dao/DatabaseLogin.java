package dao;

import java.sql.*;

public class DatabaseLogin {
    public static ResultSet getStudentsDb(String TableName) throws ClassNotFoundException, SQLException {


//            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/AdminPanel", "root", "");
            Statement state = connect.createStatement();
            ResultSet resultSet = state.executeQuery("SELECT * FROM Admin WHERE 1");
            System.out.println(connect);
            return resultSet;
    }

}
