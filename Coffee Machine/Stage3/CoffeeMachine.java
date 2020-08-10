package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        
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
        
    }
}
