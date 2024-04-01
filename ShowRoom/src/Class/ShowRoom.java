
package Class;
import java.awt.Image;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.ImageIcon;
public class ShowRoom {
    private ArrayList<Car> carList;
    private ArrayList<Car> filterdCars;
    private TestConnection db;
    
    public ShowRoom(){
        carList = new ArrayList<Car>();
        filterdCars = new ArrayList<Car>();
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
                byte[] imgBytes = rs.getBytes("img");
                ImageIcon imageIcon = new ImageIcon(imgBytes);
                Image image = imageIcon.getImage();
                Image scaledImage = image.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                
                if(type.equals("Sedan")){
                    carList.add(new SedanCar(name, cc, price, type, door, stock, wheel, capacity, false, scaledImageIcon));
                }
                else if(type.equals("SUV")){
                    carList.add(new SUVCar(name, cc, price, type, door, stock, wheel, capacity, false, scaledImageIcon));
                }
                else if(type.equals("Sport")){
                    carList.add(new SportCar(name, cc, price, type, door, stock, wheel, capacity, false, scaledImageIcon));
                }
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        db.disconnect();
    }
    public void filterCars(String type1, String name, double priceMin, double priceMax){
        filterdCars.removeAll(filterdCars);
        try{
            db = new TestConnection();
            ResultSet rs;
            if(priceMax == 0){
                Car maxPriceCar = Collections.max(carList, Comparator.comparingDouble(Car::getPrice));
                priceMax = maxPriceCar.getPrice();
            }
            if(name.equals("")){
                rs = db.getConnect(String.format("select * from car where type = '%s'", type1));
            }
            else{
                rs = db.getConnect(String.format("select * from car where type = '%s' and name = '%s'", type1, name));
            }
            while (rs.next()){
                String Carname = rs.getString("name");
                for(Car car : carList){
                    if(car.getName().equals(Carname)& car.getPrice()>= priceMin & car.getPrice()<= priceMax){
                        filterdCars.add(car);
                    }
                }
            }
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            db.disconnect();
            
        }
    }
    
    public void filterCars(String type1, String type2, String name, double priceMin, double priceMax){
        filterdCars.removeAll(filterdCars);
        try{
            db = new TestConnection();
            ResultSet rs;
            if(priceMax == 0){
                Car maxPriceCar = Collections.max(carList, Comparator.comparingDouble(Car::getPrice));
                priceMax = maxPriceCar.getPrice();
            }
            if(name.equals("")){
                rs = db.getConnect(String.format("select * from car where type = '%s' and type = '%s'", type1, type2));
            }
            else{
                rs = db.getConnect(String.format("select * from car where type = '%s' and type = '%s' and name = '%s'", type1, type2, name));
            }
            while (rs.next()){
                String Carname = rs.getString("name");
                for(Car car : carList){
                    if(car.getName().equals(Carname)& car.getPrice()>= priceMin & car.getPrice()<= priceMax){
                        filterdCars.add(car);
                    }
                }
            }
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            db.disconnect();
           
        }
    }
    
     public void filterCars(String type1, String type2, String type3, String name, double priceMin, double priceMax){
        filterdCars.removeAll(filterdCars);
        try{
            db = new TestConnection();
            ResultSet rs;
            if(priceMax == 0){
                Car maxPriceCar = Collections.max(carList, Comparator.comparingDouble(Car::getPrice));
                priceMax = maxPriceCar.getPrice();
            }
            if(name.equals("")){
                rs = db.getConnect(String.format("select * from car where type = '%s' and type = '%s' and type = '%s'", type1, type2, type3));
            }
            else{
                rs = db.getConnect(String.format("select * from car where type = '%s' and type = '%s' and type = '%s' and name = '%s'", type1, type2, type3, name));
            }
            while (rs.next()){
                String Carname = rs.getString("name");
                for(Car car : carList){
                    if(car.getName().equals(Carname)& car.getPrice()>= priceMin & car.getPrice()<= priceMax){
                        filterdCars.add(car);
                    }
                }
            }
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            db.disconnect();
            
        }
    }
     
     
     public void filterCars(String name, double priceMin, double priceMax){
        filterdCars.removeAll(filterdCars);
        try{
            db = new TestConnection();
            ResultSet rs;
            if(priceMax == 0){
                Car maxPriceCar = Collections.max(carList, Comparator.comparingDouble(Car::getPrice));
                priceMax = maxPriceCar.getPrice();
            }
            if(name.equals("")){
                rs = db.getConnect(String.format("select * from car"));
            }
            else{
                rs = db.getConnect(String.format("select * from car where name = '%s'", name));
            }
            while (rs.next()){
                String Carname = rs.getString("name");
                for(Car car : carList){
                    if(car.getName().equals(Carname)& car.getPrice()>= priceMin & car.getPrice()<= priceMax){
                        filterdCars.add(car);
                    }
                }
            }
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            db.disconnect();
            
        }
    }
    public ArrayList<Car> getFilterdCar(){
        return filterdCars;
    }
    public void reload(){
        carList.removeAll(carList);
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
                byte[] imgBytes = rs.getBytes("img");
                ImageIcon imageIcon = new ImageIcon(imgBytes);
                Image image = imageIcon.getImage();
                Image scaledImage = image.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                
                if(type.equals("Sedan")){
                    carList.add(new SedanCar(name, cc, price, type, door, stock, wheel, capacity, false, scaledImageIcon));
                }
                else if(type.equals("SUV")){
                    carList.add(new SUVCar(name, cc, price, type, door, stock, wheel, capacity, false, scaledImageIcon));
                }
                else if(type.equals("Sport")){
                    carList.add(new SportCar(name, cc, price, type, door, stock, wheel, capacity, false, scaledImageIcon));
                }
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        db.disconnect();
    }
    
    public ArrayList<Car> getAllCars() {
       return carList;
    }
}
