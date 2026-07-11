/**
 * This is a simple Java program that demonstrates the use of different data types in Java.
 * 1. Integer
 *  a. byte
 *  b. short
 *  c. int
 *  d. long
 * 2. Double
 *  a. float -> 4 bytes (32 bits) -> range from 1.4e-45 to 3.4028235e38
 *  b. double -> 8 bytes (64 bits) -> range from 4.9e-324 to 1.7976931348623157e308
 * 3. Character
 *  a. char -> 2 bytes (16 bits) -> range from \u0000 to \uffff
 * 
 * 4. Boolean
 */

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Grab yourself a cup of coffee \uD83C and let's get started!");
        // declare a variable of type int
        int myInt = 10;
        System.out.println("Integer: " + myInt);
        
        // floating-point type double
        double myDouble = 10.5;
        System.out.println("Double: " + myDouble);
        float myFloat = 10.5f; // 'f' suffix indicates a float literal
        System.out.println("Float: " + myFloat);
        
        // declare a variable of type char
        char myChar = 'A';
        System.out.println("Character: " + myChar);
        
        // declare a variable of type boolean
        boolean myBoolean = true;
        System.out.println("Boolean: " + myBoolean);

        // dealing with constants
        final double PI = 3.14159; // 'final' keyword makes this variable a constant
        System.out.println("Constant PI: " + PI);

        final double CM_PER_INCH = 2.54; // 'final' keyword makes this variable a constant
        double paperWidthInInches = 8.5;
        double paperHeightInInches = 11;
        System.out.println("Paper width in cm: " + (paperWidthInInches * CM_PER_INCH));
        System.out.println("Paper height in cm: " + (paperHeightInInches * CM_PER_INCH));

        // dealing with type casting
        int myInt2 = 9;
        double myDouble2 = myInt2; // implicit casting from int to double
        System.out.println("Implicit casting from int to double: " + myDouble2);

        double myDouble3 = 9.78;
        int myInt3 = (int) myDouble3; // explicit casting from double to int
        System.out.println("Explicit casting from double to int: " + myInt3);

        // dealing with type conversion
        String myString = "123";
        int myInt4 = Integer.parseInt(myString); // converting String to int
        System.out.println("String to int conversion: " + myInt4);

        // dealing enumerated types
        enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
       
    }
}
