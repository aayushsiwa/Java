import java.util.Scanner;

/**
 * 250124-1
 * 1. Aim of the program :Write a class file – box with three data
 * members(length, width, height) and a method volume() .
 * Also implement the application class Demo where an object of the box class is
 * created with user entered dimensions and volume is printed.
 * Input: length,width and height.
 * Output: Volume
 */
class Lab3_1 {
    int l, b, h;

    Lab3_1(int x, int y, int z) {
        l = x;
        b = y;
        h = z;
    }

    void volume() {
        System.out.println("Volume of the box is " + (l * b * h));
    }
}

class Lab3_1Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        Lab3_1 obj = new Lab3_1(x,y,z);
        obj.volume();
        sc.close();
    }
}