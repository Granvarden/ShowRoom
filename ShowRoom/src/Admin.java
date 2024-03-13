public interface Admin {
    void addCar(Car car);
    void removeCar(Car car);
    void assignEmployee(Employee e);
    String showDetailsEmployee(Employee e);
    String showDetailsCustomer(Customer e);
    void cancelBooking(Book booking);
}
