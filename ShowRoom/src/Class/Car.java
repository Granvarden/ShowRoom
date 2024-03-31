package Class;

public abstract class Car extends Vehicle{
    private String type;
    private int Stock, Wheel, Capacity, Door;
    private boolean booked;
    protected Car(String name, int cc, double price, String type, int Door, int Stock, int Wheel, int Capacity, boolean booked){
        super(name, cc, price);
        this.Door = Door;
        this.Stock = Stock;
        this.Wheel = Wheel;
        this.Capacity = Capacity;
        this.type = type;
        this.booked = booked;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
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
