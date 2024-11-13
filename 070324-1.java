/*
 * 1. Aim of the program - Write a Java program to generate an
 * ArrayIndexOutofBoundsException and handle it using catch statement.
 * Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
 * Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4
 */

import java.util.*;

class lab7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        String[] numbers = sc.nextLine().split(" ");
        int[] arr = new int[4];
        try {
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }
        } catch (Exception e){
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException:" + e.getMessage());
        }
        sc.close(); 
    }
}