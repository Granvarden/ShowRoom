package Class;

public abstract class Car extends Vehicle{
    private String type;
    private boolean booked;
    protected Car(String name, int cc, double price, String type, boolean booked){
        super(name, cc, price);
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
