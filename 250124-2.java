import java.util.Scanner;

/**
 * 250124-2
 * Aim of the program : Write a program in Java to create a class
 * Rectangle having data members length and breadth and
 * three methods called read, calculate and display
 * to read the values of length and breadth,
 * calculate the area and perimeter of the rectangle
 * and display the result respectively.
 * Create a class named 'Rectangle' with two data members 'length'
 * and 'breadth' and two methods to print the area and perimeter
 * of the rectangle respectively.
 * Its constructor having parameters for length and breadth is used to
 * initialize length
 * and breadth of the rectangle.
 * Create a class named 'Rectangle' with two data members 'length' and 'breadth'
 * and
 * two methods to print the area and perimeter of the rectangle respectively.
 * Its constructor having parameters for length and breadth is used to
 * initialize length
 * and breadth of the rectangle.
 * Input: Mention length and breadth
 * Output: Display Area of Rectangle and Perimeter of rectangle..
 */
class Lab3_2 {
    int area, perimeter, l, b;

    Lab3_2(int x, int y) {
        l = x;
        b = y;
    }

    void calcDis(int l, int b) {
        int area = l * b;
        int perimeter = 2 * (l + b);
        System.out.println(area);
        System.out.println(perimeter);
    }

    public static void main(String[] args) {
        int l, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth:-");
        l = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        Lab3_2 box = new Lab3_2(l, b);
        box.calcDis(l, b);
    }
}