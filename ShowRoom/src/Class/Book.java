package Class;

import java.time.LocalDate;
public class Book {
   private int bookingid;
   private Car car;
   private Customer customer;
   private String plan;
   private LocalDate bookingDate;

   public Book(int bookingid, Car car, Customer customer, LocalDate bookingDate, String plan) {
      this.bookingid = bookingid;
      this.car = car;
      this.customer = customer;
      this.bookingDate = bookingDate;
      this.plan = plan;
   }
   public int getBookingid(){
      return bookingid;
   }
   public Car getCar(){
      return car;
   }
   public Customer getCustomer(){
      return customer;
   }
   public String getPlan(){
       return plan;
   }
   public LocalDate getBookingDate(){
      return bookingDate;
   }

}