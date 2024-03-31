
package Class;
import java.util.*;
/**
 *
 * @author User
 */
public class ShowRoom {
    private ArrayList<Car> carList;
    private Customer cus;
    public ShowRoom(){
        carList = new ArrayList<Car>();
    }
    
    public void addCar(Car car){
        carList.add(car);
    }
    public void viewCar(Car car){
        System.out.println(car.getType());
    }
    
    public Car filterCarByBar(ArrayList<String> type, String name, double price){
        for(int x = 0; x < carList.size(); x++){
            Car c = carList.get(x);
            if(type.contains(c.getType()) || c.getPrice() == price){
                System.out.println("car : " + c.getName() + " Type : " + c.getType() + "price : " + c.getPrice());
                return c;
            }            
        }
        return null; 
    }
    
    
}
