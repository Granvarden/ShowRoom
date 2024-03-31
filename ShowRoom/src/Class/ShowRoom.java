
package Class;
import java.sql.ResultSet;
import java.util.*;


public class ShowRoom {
    private ArrayList carList;
    private TestConnection db;
    public final int SUV = 0, SEDAN = 1, SPORT = 2;
    
    public ShowRoom(){
        carList = new ArrayList();
        carList.add(new ArrayList<Car>()); //SUV
        carList.add(new ArrayList<Car>()); //Sedan
        carList.add(new ArrayList<Car>()); //Sport
    }
    public void addCar(String SQL){
        try {
            db = new TestConnection();
            ResultSet rs = db.getConnect(SQL);
            while (rs.next()){
                String name = rs.getString(2);
                String type = rs.getString(3);
                System.out.println(name);
                System.out.println(type);
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        db.disconnect();
    }
}
