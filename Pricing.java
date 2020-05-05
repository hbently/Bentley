
/**
 *
 * @author hunterbentley
 */

// Import scanner so that user can input data
import java.util.Scanner;

public class Pricing {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner reader = new Scanner(System.in);

        // Print statements
        System.out.println("MENU");
        System.out.println("1. Hamburger");
        System.out.println("2. Hotdog");
        System.out.println("3. Chicken Fingers");
        System.out.println("4. French Fries");
        System.out.println("5. Onion Rings");
        System.out.println();
                        
        
        System.out.println("Enter a number to find price: ");
        // Assign the user input to variable "num"
        int num = reader.nextInt();
        
        // If the user inputted number is 1 (Hamburger) print $3.00 and so on for every food item
        if (num == 1)
            System.out.println("$3.00");
        if (num == 2)
            System.out.println("$1.50");
        if (num == 3)
            System.out.println("$3.50");
        if (num == 4)
            System.out.println("$1.00");
        if (num == 5)
            System.out.println("$2.00");
        
                    
        
    }
    
}
