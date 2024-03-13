public abstract class Vehicle {
    private String name;
    private int cc;
    private int price;
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
    public void showDetails(){
        System.out.println(name + "have a " + cc + " cc.");
    }
}
