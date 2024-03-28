/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Kacha
 */
public class TestConnection {
    public static void main(String[] args) {
        Connection connect = null;
        Statement s = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","1234");
            s = connect.createStatement();
            String sql = "select * from employees";
            ResultSet rec = s.executeQuery(sql);
            while (rec.next()){
                System.out.println(rec.getInt(1) + " " + rec.getString(2) + " " + rec.getString(3) + " " + rec.getInt(4) + " " + rec.getBoolean("free"));
            }
        } catch (Exception e){
            System.out.println(e);
        }
        try {
            if (connect != null) {
                connect.close();
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
