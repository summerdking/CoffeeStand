import java.util.ArrayList;

public class CoffeeStand {
    
    public int getStreakGoal(int numWeeks) {
        int sumOfDrinks = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sumOfDrinks = sumOfDrinks + i;
        }
        return sumOfDrinks;
    }

    public double getOrderTotal(double[] prices) {
        double orderTotal = 0;
        for (int i = 0; i < prices.length; i++) {
            orderTotal += prices[i];
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s\n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello %s!", userName);
        int peopleInLine = customers.size();
        System.out.printf("There are %s people in front of you", peopleInLine);
        customers.add(userName);
    }

}