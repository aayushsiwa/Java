/*
 * 2.	Aim of the program : Illustrate the execution of constructors in multi-level  inheritance with three Java classes – 
 * plate(length, width), 
 * box(length, width, height), 
 * wood box (length, width, height, thick) 
 * where box inherits from plate and woodbox inherits from box class. 
 * Each class has constructor where dimensions are taken from user. 
 * Input: Enter the dimensions 
 * Output: Display the dimensions accordingly
 */

class Plate {
    double length, width;

    Plate(double l, double w) {     
        length = l;
        width = w;
    }

    void getData() {
        System.out.println("Enter length and width");
        length = Double.parseDouble(System.console().readLine());
        width = Double.parseDouble(System.console().readLine());

    }

    void display() {
        System.out.println("Length = " + length + " Width = " + width);
    }

}

class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    void getData() {
        super.getData();
        System.out.println("Enter height");
        height = Double.parseDouble(System.console().readLine());
    }

    void display() {
        super.display();
        System.out.println("Height = " + height);
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
    }

    void getData() {
        super.getData();
        System.out.println("Enter thickness");
        thick = Double.parseDouble(System.console().readLine());
    }

    void display() {
        super.display();
        System.out.println("Thickness = " + thick);
    }

    public static void main(String[] args) {
        WoodBox w = new WoodBox(10, 20, 30, 40);
        w.getData();
        w.display();
    }
}