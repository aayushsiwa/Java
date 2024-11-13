/*
 * Aim of the program :Write a class Account containing acc_no, balance as data
 * members and two methods as input() for taking input from user and disp()
 * method to display the details. Create a subclass Person which has name and
 * aadhar_no as extra data members and override disp() function. Write the
 * complete progrm to take and print details of three persons.
 * Input: Enter details of three persons.
 * Output: Display details of three persons.
 */

import java.util.Scanner;

class Account {
    int acc_no, balance;

    void input() {
        System.out.println("Enter AccNo and Bal");
        acc_no = Integer.parseInt(System.console().readLine());
        balance = Integer.parseInt(System.console().readLine());
    }

    void disp() {
        System.out.println("Acc No. " + acc_no);
        System.out.println("Balance " + balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;

    @Override
    void disp() {
        super.disp();
        System.out.println("Name " + name);
        System.out.println("Aadhar No. " + aadhar_no);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        // int i = 1;
        // for (Person person : persons) {
        // System.out.println("Enter details of person " + i + " : ");
        // person = new Person();
        // System.out.println("Name :");
        // person.name = sc.next();
        // System.out.println("Aadhar No. :");
        // person.aadhar_no = sc.nextInt();
        // person.input();
        // i++;
        // }
        persons[0].name = "aa";
        persons[0].aadhar_no = 123;
        persons[0].balance = 12312;
        System.out.println(persons[0]);
        // int d = 1;
        // for (Person person : persons) {
        // System.out.println("Person " + d + " details :-");
        // person.disp();
        // d++;
        // }
        sc.close();
    }
}