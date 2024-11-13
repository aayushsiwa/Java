/**
 * AbstractClass
 * It is vert similar to the interface, but it can have method implementation.
 * It can have constructors and static methods.
 * It can have access specifiers.
 * It can have fields.
 * It can have main method.
 * It can have final methods.
 * It can have static methods.
 * It is similar to class, but it can't be instantiated.
 * It can be inherited by other classes.
 * It can have abstract methods, non-abstract methods, and final methods.
 * It must have atleast one abstract method.
 * We cannot create an object of abstract class.
 */
abstract class AbstractClass {

    AbstractClass() {
        System.out.println("This is constructor of AbstractClass");
    }

    abstract void display();

    void callmetoo() {
        System.out.println("This is main method of AbstractClass");
    }
}

class SubClass extends AbstractClass {
    SubClass() {
        System.out.println("This is constructor of SubClass");
    }

    void display() {
        System.out.println("This is display method of SubClass");
    }
}

class AbstractClassDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
        obj.callmetoo();
    }
}