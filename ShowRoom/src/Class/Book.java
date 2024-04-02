package Class;

import java.time.LocalDate;
public class Book {
   private Car car;
   private Customer customer;
   private String plan;
   private LocalDate bookingDate;

   public Book(Car car, Customer customer, LocalDate bookingDate, String plan) {
      this.car = car;
      this.customer = customer;
      this.bookingDate = bookingDate;
      this.plan = plan;
   }
   
   public Car getCar(){
      return car;
   }
   public void setCar(Car car){
       this.car = car;
   }
   public Customer getCustomer(){
      return customer;
   }
   public String getPlan(){
       return plan;
   }
   public void setPlan(String Plan){
       this.plan = Plan;
   }
   public LocalDate getBookingDate(){
      return bookingDate;
   }
   public void setDate(LocalDate date){
       this.bookingDate = date;
   }

}