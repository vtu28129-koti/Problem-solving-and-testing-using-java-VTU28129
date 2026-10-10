import java.io.*;
import java.util.*;

class Printer {
    // Generic method to print array elements
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}
OUTPUT:
Your Output (stdout)
1
2
3
Hello
World
Expected Output
1
2
3
Hello
