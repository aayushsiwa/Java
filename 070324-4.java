/*
 * 4. Aim of the Program: Write a program to create user defined exceptions
 * called HrsException, MinException and SecException. Create a class Time which
 * contains data members hours, minutes, seconds and a method to take a time
 * from user which throws the user defined exceptions if hours (>24
 * &<0),minutes(>60 &<0),seconds(>60 &<0).
 * Input: Enter hours: 4
 * Enter minutes: 54
 * Enter seconds: 34
 * Output: Correct Time-> 4:54:34
 * 
 * Input: Enter hours: 30
 * Enter minutes: 65
 * Enter seconds: 65
 * Output: Caught the exception
 * Exception occurred: InvalidHourException:hour is not greater than 24
 * Exception occurred: InvalidMinuteException:hour is not greater than 60
 * Exception occurred: InvalidSecondException:hour is not greater than 60
 */

import java.util.Scanner;

class InvalidHourException extends Exception {
    public InvalidHourException(String message) {
        super(message);
    }
}

class InvalidMinuteException extends Exception {
    public InvalidMinuteException(String message) {
        super(message);
    }
}

class InvalidSecondException extends Exception {
    public InvalidSecondException(String message) {
        super(message);
    }
}

class Time {
    int hours, minutes, seconds;

    public void takeTime() throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        hours = sc.nextInt();
        if (hours > 24 || hours < 0) {
            throw new InvalidHourException("hour is not greater than 24");
        }
        System.out.println("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes > 60 || minutes < 0) {
            throw new InvalidMinuteException("hour is not greater than 60");
        }
        System.out.println("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds > 60 || seconds < 0) {
            throw new InvalidSecondException("hour is not greater than 60");
        }
        sc.close();
    }

    public void displayTime() {
        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

class lab7_4 {
    public static void main(String[] args) {
        Time t = new Time();
        try {
            t.takeTime();
            t.displayTime();
        } catch (InvalidHourException | InvalidMinuteException | InvalidSecondException e) {
            System.out.println("Caught the exception\nException occurred: " + e.getMessage());
        }
    }
}