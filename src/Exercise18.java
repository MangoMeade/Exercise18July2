/**
 * Created by aibar on 7/2/2017.
 */
//Author: Andres
// Programs sums all numbers from 1 to the number provided by the user.
import java.util.Scanner;
import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput;
        int sumOfNumbers = 0;
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) {
            System.out.println("Enter a number: ");
            try {
                userInput = scnr.nextInt();
                if (userInput > 0) {
                    for (int i = 1; i < userInput + 1; i++) {
                        sumOfNumbers += i;
                    }
                    System.out.println(sumOfNumbers);
                }
                else {
                    System.out.println("Only numbers larger than 0");
                }
                System.out.println("Continue? (y/n)");
                sumOfNumbers = 0;
                loop = scnr.next();
            }
            catch (InputMismatchException e) {
                System.out.println("Numbers only!");
                System.out.println("Continue? (y/n)");
                loop = scnr.next();
                loop = scnr.next();
            }
        }
        if (!loop.equalsIgnoreCase("y")) {
            System.out.println("Bye!");
        }
    }
}
