import java.util.Date;
public class Customer implements Human{
    private String phoneNumber;
    private int moneyBudget;
    private String email;
    private int customerNumber;
    private String name;

    //constructor
    public Customer(String phoneNumber, int moneyBudget, String email, String name) {
        this.phoneNumber = phoneNumber;
        this.moneyBudget = moneyBudget;
        this.email = email;
        this.name = name;
    }

    //setter
    public void setPhonenumber(String num){
        this.phoneNumber = num;
    }

    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    //methods
    public void buyCar(Car car){

    }

    public void tryCar(Car car){
        System.out.println("Test driving car: " + car.getName());
        System.out.println("Your test drive request has been successfully sent to the manager. Thank you.");
    }
    
    public Book Booking(Car car, Customer customer, Date bookingDate) {
        car.book();
        customerNumber +=1;
        int bookingId = customerNumber;
        Book booking = new Book(bookingId, car, customer, bookingDate);
        return booking;
    }
} 
