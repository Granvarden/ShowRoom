public class Employee implements Human{
    private boolean available;
    private int queue;
    private String name;

    // constructor
    public Employee() {
        this.available = true;
        this.queue = 0;
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
}

