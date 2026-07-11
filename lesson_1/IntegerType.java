/**
 *  Integer Type Example 
 * byte -> 1 byte (8 bits) -> range from -128 to 127
 * short -> 2 bytes (16 bits) -> range from -32,768 to 32,767
 * int -> 4 bytes (32 bits) -> range from -2,147,483,648 to 2,147,483,647
 * long -> 8 bytes (64 bits) -> range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * 
 * */

public class IntegerType {
    public static void main(String[] args) {
        // declare an integer variable
        byte myInt = 100;
        System.out.println("Byte        : " + myInt);
        short myShort = 1000;
        System.out.println("Short       : " + myShort);
        int myInt2 = 10_000; // underscore can be used to separate digits for better readability
        System.out.println("Integer     : " + myInt2);
        long myLong = 100000L; // 'L' suffix indicates a long literal
        System.out.println("Long        : " + myLong);
        long myLong2 = 10_000_000_000L; // 'L' suffix indicates a long literal
        System.out.println("Long 2      : " + myLong2);
    }
}
