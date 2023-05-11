public class Item {

    private String name;
    private double price;

    // getters 
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    // setters - beware naming conflicts...be wary
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}