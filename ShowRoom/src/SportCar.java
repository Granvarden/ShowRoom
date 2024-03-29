
import java.sql.ResultSet;
import java.sql.SQLException;

public class SportCar extends Car{
    private TestConnection db;
    public SportCar(String name, int cc, int price, String type, boolean booked) {
        super(name, cc, price, type, booked);
    }
    @Override
    public void showDetails() {
        try{
            db = new TestConnection();
            ResultSet rs = db.getConnect(String.format("select * from car where name = '%s'", this.getName()));
            while (rs.next()){
                System.out.println("Car name: " + rs.getString("name"));
                System.out.println("Type: " + rs.getString("type"));
                System.out.println("CC: " + rs.getString("cc"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        db.disconnect();
        //if(this.isBooked() == true) {
        //    System.out.println("The car is booked.");
        //} else {
        //    System.out.println("The car is not booked");
        //}
        //System.out.println("Price: " + super.getPrice());
    }
    public static void main(String[] args) {
        SedanCar x = new SedanCar("GR86", 1000, 1000, "Sport", false);
        x.showDetails();
    }
}
