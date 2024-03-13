import java.util.Date;
public class Book {
   private int bookingid;
   private Car car;
   private Customer customer;
   private Date bookingDate;

   public int getBookingid(){
      return bookingid;
   }
   public Car getCar(){
      return car;
   }
   public Customer getCustomer(){
      return customer;
   }
   public Date getBookingDate(){
      return bookingDate;
   }

}
