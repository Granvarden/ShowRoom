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
    public void cancelReserveBooking(String name, String surname){
        db = new TestConnection();
        String sql = String.format("update customer set car_book = null, date = null where name = '%s' and surname = '%s'", name, surname);
        db.getUpdate(sql);
        this.checkReserve(name, surname);
    }
    public void cancelReserveTestDrive(String name, String surname){
        db = new TestConnection();
        String sql = String.format("update customer set date = null where name = '%s' and surname = '%s'", name, surname);
        db.getUpdate(sql);
        this.checkReserve(name, surname);
    }
    public void registerCus(String username, String password, String name, String surname, String phone, String email){
        db = new TestConnection();
        String sql = String.format("insert into customer (name, surname, phone, email, budget, em_id, car_book, date, username, password) values ('%s', '%s', '%s', '%s', null, null, null, null, '%s', '%s')", name, surname, phone, email, username, password);
        db.getUpdate(sql);
    }
    public String[] checkReserve(String name, String surname){
        db = new TestConnection();
        String[] reserveString = {"", "", "", "", "", ""};
        try
        {
            ResultSet rs = db.getConnect(String.format("select * from customer where name = '%s' and surname = '%s'", name, surname));
            while(rs.next())
            {
                reserveString[0] = rs.getString("name");
                reserveString[1] = rs.getString("surname");
                reserveString[2] = rs.getString("car_book");
                //String price = rs.getString("price");
                reserveString[3] = rs.getString("date");
                reserveString[4] = rs.getString("budget");
                reserveString[5] = rs.getString("plan");
                return reserveString;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public String getPassword(){
        return password;
    }
    public void addPic(String picPath, String car_name){
        db = new TestConnection();
        String sql = String.format("update car set img = load_file('%s') where name = '%s'", picPath.replace("\\", "\\\\"), car_name);
        System.out.println(sql);
        db.getUpdate(sql);
        //String sql = String.format(pic, picPath);
    }
    public void calcelCus(String id){
        if (id != null && !id.isEmpty()) {
            db = new TestConnection();
            String em_id = null;
            try {
                ResultSet rs = db.getConnect(String.format("select em_id from customer where id = '%s'", id));
                while (rs.next()) {
                    em_id = rs.getString("em_id");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (em_id != null && !em_id.isEmpty()) {
                String sql1 = String.format("UPDATE employees SET queue = CASE WHEN queue <= 0 THEN 0 ELSE queue - 1 END WHERE id = '%s'", em_id);
                db.getUpdate(sql1);
            }
            String sql2 = String.format("update customer set em_id = null , date = null, car_book = null where id = '%s'", id);
            db.getUpdate(sql2);
            String sql3 = String.format("update employees set free = case when queue = 0 then 1 else 0 end where id = '%s'", id);
            db.getUpdate(sql3);
        }
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

    
    
    
    public boolean checkUsernameDuplicate(String username) throws SQLException {
        db = new TestConnection();
        try {
            ResultSet rs = db.getConnect(String.format("SELECT username FROM customer WHERE username = '%s'", username));
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            db.disconnect();
        }
    }
}