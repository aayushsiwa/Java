// Program to find no. of objects created out of a class using ‘static’ modifier.
class Lab2_4 {
    static int count = 0;

    Lab2_4() {
        count++;
    }

    public static void main(String[] args) {
        Lab2_4 obj1 = new Lab2_4();
        Lab2_4 obj2 = new Lab2_4();
        Lab2_4 obj3 = new Lab2_4();
        System.out.println("No. of objects created: " + count);
    }
}