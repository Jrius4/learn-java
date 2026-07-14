/***
 * A simple Java program to demonstrate input/output operations.
 * 
 */

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class InputOutputJv {
    public static void main(String[] args) {
        System.out.println("Welcome to Core Java Programming!");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            Console console = System.console();
            String username;
            char[] password;

            if (console != null) {
                username = console.readLine("Username: ");
                password = console.readPassword("Password: ");
            } else {
                System.out.print("Username: ");
                username = scanner.next();

                System.out.print("Password: ");
                password = scanner.next().toCharArray();
            }

            char[] maskedPassword = new char[password.length];
            Arrays.fill(maskedPassword, '*');

            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");
            System.out.println("Username: " + username);
            System.out.println("Password: " + new String(maskedPassword));

            Arrays.fill(password, '*');

            System.out.printf("Hello, %s! You are %d years old. Your username is %s and your password is %s.%n", name, age, username, new String(maskedPassword));
            System.out.println("Thank you for using the program!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
