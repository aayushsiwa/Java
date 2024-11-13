/*
 * 1. Aim of the program - Write a program in Java using multi-threading which
 * will display a counter value within a specified range with a gap of 5
 * milliseconds after setting it’s name as given by the user.
 * Input : Name of the thread - First
 * Lower range of counter - 10
 * Upper range of counter - 15
 * Output : Thread - First
 * Counter - 10 11 12 13 14 15
 */
import java.util.Scanner;

class thread extends Thread {
    private String name;
    private int lowerRange;
    private int upperRange;

    public thread(String name, int lowerRange, int upperRange) {
        this.name = name;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public void run() {
        System.out.println("Thread - " + name);
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

class lab10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the thread - ");
        String name = scanner.next();
        System.out.print("Lower range of counter - ");
        int lowerRange = scanner.nextInt();
        System.out.print("Upper range of counter - ");
        int upperRange = scanner.nextInt();
        scanner.close();

        thread counterThread = new thread(name, lowerRange, upperRange);
        counterThread.start();
    }
}