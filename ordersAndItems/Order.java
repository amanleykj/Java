import java.util.ArrayList;

public class Order {
    
    private String name;
    private double total;
    private boolean ready;
    ArrayList<Item> items;

    // getters
    public String getName() {
        return name;
    }
    public double getTotal() {
        return total;
    }
    public boolean getReady() {
        return ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    //setters 
    public void setName(String name) {
        this.name = name;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
}
