package Class;

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
    public Connection conn = null;
    public Statement stm;
    public ResultSet rs;
    private String url = "jdbc:mysql://localhost:3306/mydb";
    private String username = "root";
    private String password = "1234";
    public ResultSet getConnect(String sql){
        try {
            conn = DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    public void getUpdate(String sql){
        try {
            conn = DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
            stm.executeUpdate(sql);   
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void disconnect(){
        try{
            conn = DriverManager.getConnection(url, username, password);
            stm.close();
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
    }
}
}
