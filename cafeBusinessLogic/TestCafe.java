import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil(); // this calls an instance of this Class, which can then be utilized below

        System.out.println(appTest.getStreakGoal());


        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());
    
        double[] lineItems = {2.5, 3.5, 4.5, 4.2};
        System.out.printf("Order total: $%s0 \n\n",appTest.getOrderTotal(lineItems));
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
