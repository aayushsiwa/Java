// Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. 
// The cost of sheet is Rs 40/ per square ft.
//  and the cost of box is Rs 60/ per cubic ft. 	Implement it in Java to calculate the cost of plastic 
// as per the dimensions given by the user 	
// where 3D inherits from 2D.
// Input:	Enter  dimensions
// Output: 	Display the cost of plastic
class TwoD {
    double length, breadth;

    TwoD(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    void getData() {
        System.out.println("Enter length and breadth");
        length = Double.parseDouble(System.console().readLine());
        breadth = Double.parseDouble(System.console().readLine());
        // return length * breadth;
    }

    void calculateCost() {
        System.out.println("Cost of plastic is " + area() * 40);
    }
}

class ThreeD extends TwoD {
    double height;

    ThreeD(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }

    void getData() {
        // super.getData();
        System.out.println("Enter height");
        height = Double.parseDouble(System.console().readLine());
    }

    void calculateCost() {
        System.out.println("Cost of plastic is " + volume() * 60);
    }

    public static void main(String[] args) {
        TwoD t = new TwoD(10, 20);
        t.getData();
        t.calculateCost();
        ThreeD t1 = new ThreeD(10, 20, 30);
        t1.getData();
        t1.calculateCost();
    }
}