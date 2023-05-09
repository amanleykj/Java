import java.util.ArrayList;

public class CafeUtil {
    // public int getStreakGoal(int numDrinks, int weeks) {
    //     int totalWeeks = weeks;
    //     int sum;
    //     int i = numDrinks;
    //     ArrayList<Integer> totalDrinks = new ArrayList<Integer>();
    //     for(i = numDrinks; i < totalWeeks; i++) {
            
    //     }
    //     System.out.println(sum);
    //     return totalWeeks;
    // }

    public int getStreakGoal() {
        int sum = 0;
        for(int week = 1; week <= 10; week++) {
            sum+= week;
        }
        return sum;
    }
    
    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        
        for (double price: lineItems) {
            sum+= price;
        }
        return sum;

    }
    
    public void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }
    
    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Please give my your name: ");
        String customerName = System.console().readLine();
        System.out.printf("Thank you for your patronage, %s! ", customerName);
        System.out.printf("There are %s people ahead of you. Here is a complete list:\n", customerList.size());
        customerList.add(customerName);
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

    }

    public void printPriceChart(String product, double price, int MaxQuantity) {
        System.out.println("Enter the product name hereL: ");
        String productName = System.console().readLine();
        System.out.println("How much is this product?");
        String productPriceString = System.console().readLine();
        int productPrice = Integer.parseInt(productPriceString);
        System.out.println(productName);
        for (int i = 0; i )
        System.out.println("1 - %s", productPrice);


    }

}
