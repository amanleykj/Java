public class TestOrders {

    public static void main(String[] args) {
        
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        item1.setName("Orange Mocha Frappuchino");
        item2.setName("Shot in the Dark");
        item3.setName("Sludge Cup");
        item4.setName("Red Eye");

        item1.setPrice(5.5);
        item2.setPrice(4.25);
        item3.setPrice(3.5);
        item4.setPrice(3.5);

        order1.setName("Cindhuri");
        order2.setName("Jimmy");
        order3.setName("Noah");
        order4.setName("Sam");

        System.out.println(order1);
        System.out.println(order1.getItems());
        
    }
    
}
