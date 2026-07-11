/***
 * A simple Java program to demonstrate input/output operations.
 * 
 */

import java.util.Scanner;

public class InputOutputJv {
    public static void main(String[] args) {
        System.out.println("Welcome to Core Java Programming!");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
