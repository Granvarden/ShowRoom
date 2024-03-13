public class SportCar extends Car{
    public SportCar(String name, int cc, int price, String type, boolean booked) {
        super(name, cc, price, type, booked);
    }
    @Override
    public void showDetails() {
        System.out.println("Car name: " + super.getName());
        System.out.println("Type: " + super.getType());
        System.out.println("CC: " + super.getCC());
        if(this.isBooked() == true) {
            System.out.println("The car is booked.");
        } else {
            System.out.println("The car is not booked");
        }
        System.out.println("Price: " + super.getPrice());
    }
}
