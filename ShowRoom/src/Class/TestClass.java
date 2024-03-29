package Class;

import java.sql.*;
public class TestClass {
    private TestConnection db;
    public void callName(String sql){
        try {
            db = new TestConnection();
            ResultSet rs = db.getConnect(sql);
            while (rs.next()){
                String name = rs.getString(2);
                String type = rs.getString(3);
                System.out.println(name);
                System.out.println(type);
            }
            
        } catch (Exception e){
            e.printStackTrace();
        
    }
}
    public static void main(String[] args) {
        TestClass x = new TestClass();
        x.callName("select * from car where id = 1");
    }
}