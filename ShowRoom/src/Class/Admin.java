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
    public void addPic(String picPath){
        db = new TestConnection();
        //String sql = String.format(pic, picPath);
    }
    public void calcelCus(String id){
        db = new TestConnection();
        String em_id = null;
        try{
            ResultSet rs = db.getConnect(String.format("select em_id from customer where id = '%s'", id));
            while (rs.next()){
                em_id = rs.getString("em_id");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        String sql1 = String.format("UPDATE employees SET queue = CASE WHEN queue <= 0 THEN 0 ELSE queue - 1 END WHERE id = '%s'", em_id);
        db.getUpdate(sql1);
        String sql2 = String.format("update customer set em_id = null where id = '%s'", id);
        db.getUpdate(sql2);
        String sql3 = String.format("update employees set free = case when queue = 0 then 1 else 0 end where id = '%s'", id);
        db.getUpdate(sql3);
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

   
    public void workEm(String em_id, String cus_id) {
        db = new TestConnection();
        String sql1 = String.format("update customer set em_id = '%s' where id = '%s'", em_id, cus_id);
        db.getUpdate(sql1);
        String sql2 = String.format("update employees set queue = queue + 1 where id = '%s'",em_id);
        db.getUpdate(sql2);
        String sql3 = String.format("update employees set free = case when queue = 0 then 1 else 0 end where id = '%s'", em_id);
        db.getUpdate(sql3);
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
