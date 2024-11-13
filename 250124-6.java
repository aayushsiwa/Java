/**
 * Aim of the program : Write a program in java using constructor overloading
 * concept to calculate the area of a rectangle having data member as length and
 * breadth. Use default constructor to initialize the value of the data member
 * to zero and parameterized constructor to initialize the value of data member
 * according to the user input.
 * Input: Mention the value of length and breadth
 * Output: Display the area of rectangle accordingly.
 */
class Lab3_6 {
    int length, breadth;

    Lab3_6() {
        length = 0;
        breadth = 0;
    }

    Lab3_6(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Lab3_6 on = new Lab3_6();
        Lab3_6 on2 = new Lab3_6(10, 5);
        System.out.println(on.area());
        System.out.println(on2.area());
    }
}