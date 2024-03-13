public abstract class Car extends Vehicle{
    private String type;
    private boolean booked;
    protected void setType(String type){
        this.type = type;
    }
    protected String getType(){
        return type;
    }
    public void book(){
        this.booked = true;
    }
    public  void cancelBooking(){
        this.booked = false;
    }
    @Override
    public void showDetails(){
        System.out.println("A car type is " + type + ".");
    }
    public boolean isBooked(){
        return booked;
    }  
}
