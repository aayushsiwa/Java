/**
 * Constructor
 * Two types of constructors
 * 1. Default constructor (Non-parameterized constructor)
 * 2. Parameterized constructor
 */

// class Constructor {
// int a;
// int b;

// // Default constructor
// Constructor() {
// a = 10;
// b = 20;
// }

// // Parameterized constructor
// Constructor(int x, int y) {
// a = x;
// b = y;
// }

// public static void main(String[] args) {
// Constructor obj1 = new Constructor();
// Constructor obj2 = new Constructor(30, 40);
// System.out.println("Obj1: " + obj1.a + " " + obj1.b);
// System.out.println("Obj2: " + obj2.a + " " + obj2.b);
// }
// }

// class Student {
// String name;
// int roll;
// String branch;
// String college;

// Student() {
// name = "John Doe";
// roll = 00001;
// branch = "CSE";
// college = "KIIT";
// }

// void introduction() {
// System.out.println("Hi I am " + name + ".My roll number is " + roll + ".My
// branch is " + branch
// + ".And I study at " + college + ".");
// }
// }

// class DemoStudent {
// public static void main(String[] args) {
// Student S1 = new Student();
// S1.introduction();
// }
// }

/**
 * Constructor is used to initialize the object of a class. Constructor is
 * invoked at the time of object creation. It constructs the values i.e. provides
 * data for the object that is why it is known as constructor.
 * It must have the same name as that of the class and have no return type.
 * It can have parameters.
 * It is called constructor because it constructs the values at the time of
 * object creation.
 * It is not necessary to write a constructor for a class. It is because java
 * compiler creates a default constructor if your class doesn't have any.
 */

 // Constructor Overloading
// If a constructor has different number of parameters or different types of
// parameters, then it is called constructor overloading.

// class Box {
//     int h;
//     int b;
//     int d;

//     Box() {
//         h = -1;
//         b = 1;
//         d = -1;
//     }

//     Box(int x, int y, int z) {
//         h = x;
//         b = y;
//         d = z;
//     }

//     Box(int t, int u) {
//         h = t;
//         b = u;
//     }

//     void volume() {
//         System.out.println(h * b * d);
//     }
// }

// class DemoBox {
//     public static void main(String[] args) {
//         Box B1 = new Box(1, 2, 3);
//         B1.volume();
//         Box B2 = new Box(4, 5);
//         B2.volume();
//         Box B3 = new Box();
//         B3.volume();
//     }
// }

class Student {
    String name;
    int roll;
    String branch;
    String college;

    Student() {
        name = "John Doe";
        roll = 00001;
        branch = "CSE";
        college = "KIIT";
    }

    Student(String n, int r, String b, String c) {
        name = n;
        roll = r;
        branch = b;
        college = c;
    }

    Student(String n, int r) {
        name = n;
        roll = r;
        branch = "CSE";
        college = "KIIT";
    }

    void introduction() {
        System.out.println("Hi I am " + name + ".My roll number is " + roll + ".My branch is " + branch
                + ".And I study at " + college + ".");
    }
}

class DemoStudent {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.introduction();
        Student S2 = new Student("Jane Doe", 00002, "ECE", "KIIT");
        S2.introduction();
        Student S3 = new Student("Jack Doe", 00003);
        S3.introduction();
    }
}