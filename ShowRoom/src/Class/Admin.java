package Class;
import java.sql.*;
public class Admin {
    private TestConnection db;
    private ResultSet rs;
    private String username = "Admin";
    private String password = "1234";

    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    public void calcelCus(String id){
        
    }
    public void addEm(String first_name, String last_name){
            db = new TestConnection();
            String sql = String.format("insert into employees (first_name, last_name) values('%s','%s')", first_name, last_name);
            db.getUpdate(sql);
    }
    public void delEm(String id){
        db = new TestConnection();
        String sql = String.format("delete from employees where id = '%s'", id);
        db.getUpdate(sql);
    }
    
    public void addCar(String name, String type, String cc, String price, String stock, String wheel, String door, String capacity) {
            db = new TestConnection();
            String sql = String.format("insert into car (name, type, cc, price, stock, wheel, door, capacity) values('%s','%s','%s','%s','%s','%s','%s','%s')",name, type, cc, price, stock, wheel, door, capacity);
            db.getUpdate(sql);

    }

    
    public void removeCar(String name) {
        db = new TestConnection();
        String sql = String.format("delete from car where name = '%s'", name);
        db.getUpdate(sql);
    }

   
    public void assignEmployee(Employee e) {
        
    }

    
    public String showDetailsEmployee(Employee e) {
        String employeeName = e.getName();
        
        return "Employee Name: " + employeeName;
    }

    
    public String showDetailsCustomer(Customer c) {
        String customerName = c.getName();
        String phoneNumber = c.getPhoneNumber();
        String email = c.getEmail();
        
        return "Customer Name: " + customerName + 
               ", Phone Number: " + phoneNumber + 
               ", Email: " + email;                
    }

    
    public void cancelBooking(Book booking) {
        Car car_1 = booking.getCar();
    }
  
}
