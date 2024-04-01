package Class;

import java.time.LocalDate;
public class Customer implements Human{
    private String phoneNumber;
    private String userName;
    private String password;
    private int moneyBudget;
    private String email;
    private int customerNumber;
    private String name;
    private String surname;
    private Book awd;

    //constructor
    public Customer(String userName, String password, String phoneNumber, int moneyBudget, String email, String name, String surname) {
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
    public String getSurname(){
        return surname;
    }


    public void tryCar(Car car, LocalDate tryDate){
        
    }
    

    public Book Booking(Car car, Customer customer, LocalDate bookingDate) {
        car.book();
        customerNumber +=1;
        int bookingId = customerNumber;
        Book booking = new Book(bookingId, car, customer, bookingDate);
        System.out.println("Thank you for booking! " + "Your date at " + bookingDate);
        awd = booking;
        return booking;
    }

    public void showDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Phonenumber : " + this.phoneNumber);
        System.out.println("Email : " + this.email);
    }
}