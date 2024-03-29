package Class;

public class Employee implements Human{
    private boolean available;
    private int queue;
    private String name;

    // constructor
    public Employee() {
        this.available = true;
        this.queue = 0;
    }
    
    public Employee(String name, int queue, boolean available) {
        this.name = name;
        this.queue = queue;
        this.available = available;
    }

    // setter
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // getter
    @Override
    public String getName() {
        return this.name; 
    }

    // setter
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // getter
    public boolean isAvailable() {
        return available;
    }

    // setter
    public void setQueue(int queue) {
        this.queue = queue;
    }

    // getter
    public int getQueue() {
        return queue;
    }
    
    //methods
    public void showDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Queue : " + this.queue);
        System.out.println("Status : " + (this.available ? "available" : "not available"));
    }
}

