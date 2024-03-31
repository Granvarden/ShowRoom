
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
        try {
            db = new TestConnection();
            ResultSet rs = db.getConnect("select * from car");
            while (rs.next()){
                String name = rs.getString("name");
                String type = rs.getString("type");
                int cc = rs.getInt("cc");
                double price = rs.getDouble("price");
                int stock = rs.getInt("stock");
                int wheel = rs.getInt("wheel");
                int door = rs.getInt("door");
                int capacity = rs.getInt("capacity");
                if(type.equals("Sedan")){
                    ((ArrayList<Car>)carList.get(SEDAN)).add(new SedanCar(name, cc, price, type, door, stock, wheel, capacity, false));
                }
                else if(type.equals("SUV")){
                    ((ArrayList<Car>)carList.get(SUV)).add(new SUVCar(name, cc, price, type, door, stock, wheel, capacity, false));
                }
                else if(type.equals("Sport")){
                    ((ArrayList<Car>)carList.get(SPORT)).add(new SportCar(name, cc, price, type, door, stock, wheel, capacity, false));
                }
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        db.disconnect();
    }
    
    
    
    public void addCar(){
        
    }
    
    public String toString(){
        for(int i = 0; i < carList.size(); i++)
            for(int j = 0; j < ((ArrayList<Car>)carList.get(i)).size(); j++){
                
            }
            
    }
    
    public static void main(String[] args) {
        ShowRoom sh = new ShowRoom();
        
    }
}
