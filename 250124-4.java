/**
 * Aim of the program : Write a program to overload subtract method with
 * various parameters in a class in Java. Write the driver class to use the
 * different subtract methods using object.
 * Input: Mention various subtract method having different parameters.
 * Output: Subtract method will display the result accordingly
 */
class Lab3_4{
    int subtract(int a, int b){
        return a-b;
    }
    int subtract(int a, int b, int c){
        return a-b-c;
    }
    int subtract(int a, int b, int c, int d){
        return a-b-c-d;
    }
    public static void main(String[] args) {
        Lab3_4 on = new Lab3_4();
        System.out.println(on.subtract(10, 5));
        System.out.println(on.subtract(10, 5, 2));
        System.out.println(on.subtract(10, 5, 2, 1));
    }
}