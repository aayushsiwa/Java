/*
 * Aim of the program : Write a program in Java having three classes Apple,
 * Banana and Cherry. Class Banana and Cherry are inherited from class Apple and
 * each class have their own member function show() . Using Dynamic Method
 * Dispatch concept display all the show() method of each class.
 * Input: Mention show function of each class.
 * Output: Display show function of each class accordingly.
 */

class Apple {
    void show() {
        System.out.println("Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry");
    }
}

class DynamicMethodDispatch {
    public static void main(String[] args) {
        Apple a = new Apple();
        Banana b = new Banana();
        Cherry c = new Cherry();
        a.show();
        b.show();
        c.show();
    }
}