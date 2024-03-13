import java.time.LocalDate;
public class Book {
   private int bookingid;
   private Car car;
   private Customer customer;
   private LocalDate bookingDate;

   public int getBookingid(){
      return bookingid;
   }
   public Car getCar(){
      return car;
   }
   public Customer getCustomer(){
      return customer;
   }
   public LocalDate getBookingDate(){
      return bookingDate;
   }

}
