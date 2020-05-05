/**
 *
 * @author hunterbentley
 */


// Import the scanner so that user input can be read
import java.util.Scanner;
    
public class EvenOrOdd {

    public static void main(String[] args) {
        
        // User input can be read
        Scanner reader = new Scanner(System.in);

        // Print out "Enter a number" to the user
        System.out.print("Enter a number: ");
        // Assign variable "num" to whatever number the user inputs
        int num = reader.nextInt();

        // If the number inputted by the user divided by two is equal to 0 print that the number is even 
        if(num % 2 == 0)
            System.out.println(num + " is even");
        // If the number inputted by the user divided by two is not equal to 0 print that the number is odd 
        else
            System.out.println(num + " is odd");
    }
}
    

