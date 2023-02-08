package dao;

import java.sql.*;

public class DatabaseStudents {
        public static ResultSet getStudentsDb() throws SQLException {
                String[][] array=new String[10][];

                Connection con = DriverManager.getConnection("jdbc:sqlite:/home/ahbor/Desktop/Student-Managment-System/src/Database.db",
                        "root", "");
                Statement state = con.createStatement();
                ResultSet resultSet = state.executeQuery("SELECT * FROM Students");
                System.out.println(con);
                return resultSet;

//                for (int i=0;i<10;i++){
//                        for (int j=0;j<10;j++){
//                                resultSet.get(j,array[j][i]);
//                        }
//                }
        }
        public static PreparedStatement setStudentsDb() throws SQLException {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/AdminPanel", "root", "");
                String query = "INSERT INTO Students(ID, First Name, Second Name, Last Name, Teaching Department, Address, Email, Phone Number, Teaching type) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(query);
                return pstmt;
        }
}
