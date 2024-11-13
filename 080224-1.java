/*
 * Aim of the program -Illustrate the usage of abstract class with following Java classes –
 * An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and 
 * an abstract method course() A subclass ‘kiitian’ with course() method implementation 
 * Write the driver class to print the all details of a kiitian object.
 * Input - Rollno - 2205180 Registration no - 1234567890
 * Output -Rollno - 2205180 Registration no - 1234567890
 * Course - B.Tech. (Computer Science & Engg)
 */

import java.util.Scanner;

abstract class Student {
    int rollno;
    long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll No.: ");
        int roll = sc.nextInt();
        System.out.print("Registration No.: ");
        long reg = sc.nextInt();
        Kiitian obj = new Kiitian();
        obj.getinput(roll, reg);
        obj.course();
        sc.close();
    }
}