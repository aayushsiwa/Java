/*
 * Java Inner Classes
 * 
 */

// Case1 (no relationship)
/*
 * class A{
 * 
 * }
 * class B{
 * }
 */

// Case2 (is a relationship)
/*
 * class A{
 * }
 * class B extends A{
 * }
 */

// Case3 (has a relationship)
/*
 * class A{
 *      class B{
 *      } 
 * }
 */

class Outer {
    int a = 10;

    class Inner {
        int b = 20;

        void m1() {
            System.out.println("Inner class method");
        }
    }

    void m2() {
        System.out.println("Outer class method");
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.m2();
        Outer.Inner i = o.new Inner();
        i.m1();
    }
}