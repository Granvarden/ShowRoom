public class Admin {
    
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    
    public void addCar(Car car) {
        
    }

    
    public void removeCar(Car car) {
        
    }

   
    public void assignEmployee(Employee e) {
        
    }

    
    public String showDetailsEmployee(Employee e) {
        String employeeName = e.getName();
        
        return "Employee Name: " + employeeName;
    }

    
    public String showDetailsCustomer(Customer c) {
        String customerName = c.getName();
        String phoneNumber = c.getPhoneNumber();
        String email = c.getEmail();
        
        return "Customer Name: " + customerName + 
               ", Phone Number: " + phoneNumber + 
               ", Email: " + email;                
    }

    
    public void cancelBooking(Book booking) {
        Car car_1 = booking.getCar();
        car_1.cancelBooking();
    }
  
}
