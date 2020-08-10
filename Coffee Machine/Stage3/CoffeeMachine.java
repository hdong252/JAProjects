package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        /* //Stage 1
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!"); */
        
        // System.out.println("Write how many cups of coffee you will need: ");
        Scanner s = new Scanner(System.in);
        int waterPerCup = 200;
        int milkPerCup = 50;
        int beansPerCup = 15;
        
        
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterLeft = s.nextInt();
        
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkLeft = s.nextInt();
        
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beansLeft = s.nextInt();
        
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsNeeded = s.nextInt();
        
        int cupsCanMake = Math.min(Math.min(waterLeft/waterPerCup, milkLeft/milkPerCup), beansLeft/beansPerCup);
        
        if (cupsCanMake < cupsNeeded) {
            System.out.println("No, I can make only " + cupsCanMake + " cup(s) of coffee");
        } else if (cupsCanMake == cupsNeeded) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsCanMake - cupsNeeded) + " more than that)");
        }
        
        /* //Stage 2
        int cupsOfCoffee = s.nextInt();
        
        System.out.println("For 25 cups of coffee you will need:");
        System.out.println(200 * cupsOfCoffee + " ml of water");
        System.out.println(50 * cupsOfCoffee + " ml of milk");
        System.out.println(15 * cupsOfCoffee + " g of coffee beans"); */
        
    }
}
