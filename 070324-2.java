/*
 * 2. Aim of the program- Write a Java program to handle an ArithmeticException
 * using try, catch, and finally block.
 * Input: Operand values for division operation mentioned in the program
 * Output: ArithmeticException caught by try-catch-finally block
 */

import java.util.Scanner;

class lab7_2{
    public static void main(String[] args) {
        // int a = 10, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        sc.close();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}