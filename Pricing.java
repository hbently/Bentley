/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunterbentley
 */
import java.util.Scanner;

public class Pricing {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String finalOrder = "";
        System.out.println("MENU");
        System.out.println("1. Hamburger");
        System.out.println("2. Hotdog");
        System.out.println("3. Chicken Fingers");
        System.out.println("4. French Fries");
        System.out.println("5. Onion Rings");
        System.out.println();
                        

        System.out.println("Enter a number to find price: ");
        int num = reader.nextInt();
        
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
