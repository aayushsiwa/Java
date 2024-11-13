// Find largest of three

class Lab2_1 {
    public static void main(String[] args) {
        int a, b, c, max = 0;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println("Largest is " + max);
    }
}