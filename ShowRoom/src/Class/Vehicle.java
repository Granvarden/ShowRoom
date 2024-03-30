package Class;

public abstract class Vehicle {
    private String name;
    private int cc;
    private double price;
    protected Vehicle(String name, int cc, double price){
        this.name = name;
        this.cc = cc;
        this.price = price;
    }
    protected void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    protected void setCC(int cc){
        this.cc = cc;
    }
    public int getCC(){
        return cc;
    }
    protected void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public abstract void showDetails();
}
