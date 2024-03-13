public class SedanCar extends Car{
    private String type;
    
    protected void setType(String type){
        this.type = type;
    }
    
    protected String getType() {
        return this.type;
    }
    
//    @Override
//    NOT FINISHED
    public void showDetails() {
        System.out.println("...........");
    }
}
