/*
 * Interface
 *  It is similar to the abstract class, but it can't have method implementation.
 * It can have only abstract methods.
 * It can have only public and abstract methods.
 * It can have only static and final fields.
 * It can have only static and default methods.
 * It can have only public, static, and final fields.
 * 
 * It is similar to class, but it can't be instantiated.
 * It can be inherited by other classes.
 * It can have only abstract methods, default methods, and static methods.
 * It must have atleast one abstract method. 
 * We cannot create an object of interface.
 * 
 */
interface Shape {
    void area(){
    };
}

class Rectangle implements Shape {
    int l, b;

    Rectangle(int m, int n) {
        l = m;
        b = n;
    }

    public void area() {
        int area = l * b;
        System.out.println("Area is " + area);
    }
}

class Demo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        rect.area();
        Shape shape = new Rectangle(10, 30);
        shape.area();
    }
}