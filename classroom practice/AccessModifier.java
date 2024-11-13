/*
 * Access Modifiers
 * They specify the accessibility or scope of a field, method, constructor, or
 * class.
 * there are 4 types of access modifiers:
 * 1. Private
 * private access modifier is accessible only within the class.
 * exapmle:
 * class A{
 * private int data=40;
 * private void msg(){System.out.println("Hello java");}
 * }
 * 2. Default
 * If you don't use any modifier, it is treated as default by default.
 * The default modifier is accessible only within package.
 * example:
 * class A{
 * int data=40;
 * void msg(){System.out.println("Hello java");}
 * }
 * 3. Protected
 * The protected access modifier is accessible within package and outside the
 * package but through inheritance only.
 * example:
 * package pack;
 * protected class A{
 * protected void msg(){System.out.println("Hello");}
 * }
 * package mypack;
 * class B extends A{
 * public static void main(String args[]){
 * B obj = new B();
 * obj.msg();
 * }
 * }
 * 4. Public
 * The public access modifier is accessible everywhere. It has the widest scope
 * among all other modifiers.
 * example:
 * public class A{
 * public void msg(){System.out.println("Hello");}
 * }
 * class B{
 * public static void main(String args[]){
 * A obj = new A();
 * obj.msg();
 * }
 * we can change the access level of fields, constructors, methods, and class by
 * applying the access modifier on it.
 */

// Inheritance

// import pack.A;
// import pack.B;

class A{
    protected void msg(){System.out.println("Hello java");}
}
class B extends A{
    public static void main(String args[]){
        B obj = new B();
        obj.msg();
    }
}