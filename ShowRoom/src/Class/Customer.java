
package Class;

/**
 *
 * @author User
 */
import java.time.LocalDate;
public class Customer {
    private String phoneNumber;
    private String userName;
    private String password;
    private double moneyBudget;
    private String email;
    private String name;
    private String surname;
    private Book booked;

    //constructor
    
    public Customer(String userName, String password, String phoneNumber, double moneyBudget, String email, String name, String surname) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.moneyBudget = moneyBudget;
        this.email = email;
        this.name = name;
        this.surname = surname;
    }
    public void setUsernmae(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    
    //setter
    public void setPhonenumber(String num){
        this.phoneNumber = num;
    }

    public void setEmail(String email){
        this.email = email;
    }
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

    public String getName() {
        return this.name;
    }
    public String getSurname(){
        return surname;
    }
    public void setBudget(double budget){
        this.moneyBudget = budget;
    }
    public double getBudget(){
        return moneyBudget;
    }
    

    public Book Booking(Car car, Customer customer, LocalDate bookingDate, String plan) {
        Book booking = new Book(car, customer, bookingDate, plan);
        booked = booking;
        return booking;
    }

}
