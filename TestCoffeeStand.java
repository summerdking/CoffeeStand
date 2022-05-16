import java.util.ArrayList;

public class TestCoffeeStand {
    public static void main(String[] args) {

        CoffeeStand appTest = new CoffeeStand();

        int numWeeks = 10;
        
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week %s: %s \n\n", numWeeks, appTest.getStreakGoal(numWeeks));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
                ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
