/**
 * 5. Aim of the program : Write a program which will overload the area ()
 * method and display the area of a circle, triangle and square as per user
 * choice and user entered dimensions.
 * Input: Mention dimensions like radius, base, height, side
 * Output: Display area of circle
 * Display area of triangle
 * Display area of square
 */
class Lab3_5 {
    double area(double r) {
        return Math.PI * r * r;
    }

    double area(double b, double h) {
        return 0.5 * b * h;
    }

    void area(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3) / 2;
        System.out.println(Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)));
    }

    public static void main(String[] args) {
        Lab3_5 on = new Lab3_5();
        System.out.println(on.area(10));
        System.out.println(on.area(10, 5));
        on.area(3, 5, 7);
    }
}