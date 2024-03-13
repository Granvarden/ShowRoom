public class Admin {
    private String username;
    private String password;

    public AdminImpl(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void addCar(Car car) {
        
    }

    @Override
    public void removeCar(Car car) {
        
    }

    @Override
    public void assignEmployee(Employee e) {
        
    }

     @Override
    public String showDetailsEmployee(Employee e) {
        String employeeName = e.getName();
        
        return "Employee Name: " + employeeName;
    }

    @Override
    public String showDetailsCustomer(Customer c) {
        String customerName = c.getName();
        String phoneNumber = c.getPhoneNumber();
        String email = c.getEmail();
        
        return "Customer Name: " + customerName + 
               ", Phone Number: " + phoneNumber + 
               ", Email: " + email;                
    }

    @Override
    public void cancelBooking(Car booking) {
        Car car_1 = booking.getCar();
        car_1.cancelBooking();
    }
  
}
