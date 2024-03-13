public abstract class Vehicle {
    private String name;
    private int cc;
    private int price;
    protected Vehicle(String name, int cc, int price){
        this.name = name;
        this.cc = cc;
        this.price = price;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected String getName(){
        return name;
    }
    protected void setCC(int cc){
        this.cc = cc;
    }
    protected int getCC(){
        return cc;
    }
    protected void setPrice(int price){
        this.price = price;
    }
    protected int getPrice(){
        return price;
    }
    public abstract void showDetails();
}
