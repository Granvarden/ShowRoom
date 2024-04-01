package Class;
import java.sql.*;
import javax.swing.ImageIcon;

public abstract class Car extends Vehicle{
    private String type;
    private int Stock, Wheel, Capacity, Door;
    private boolean booked;
    private ImageIcon img;
    protected Car(String name, int cc, double price, String type, int Door, int Stock, int Wheel, int Capacity, boolean booked, ImageIcon img){
        super(name, cc, price);
        this.Door = Door;
        this.Stock = Stock;
        this.Wheel = Wheel;
        this.Capacity = Capacity;
        this.type = type;
        this.booked = booked;
        this.img = img;
    }
    public int getDoor(){
        return Door;
    }
    public void setDoor(int Door){
        this.Door = Door;
    }
    public int getStock(){
        return Stock;
    }
    public void setStock(int Stock){
        this.Stock = Stock;
    }
    public int getCapacity(){
        return Capacity;
    }
    public  void setCapacity(int Capa){
        this.Capacity = Capa;
    }
    public int getWheel(){
        return Wheel;
    }
    public void setWheel(int Wheel){
        this.Wheel = Wheel;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public ImageIcon getImg(){
        return img;
    }
    public void book(){
        this.booked = true;
    }
    public  void cancleBooking(){
        this.booked = false;
    }
    public abstract void showDetails();
    public boolean isBooked(){
        return booked;
    }
}
