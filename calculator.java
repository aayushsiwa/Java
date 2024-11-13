import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter operation('+','-','/','*')");
        Scanner sc = new Scanner(System.in);
        String op = sc.next();
        System.out.println("Enter numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (op) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "*":
                System.out.println(a*b);
                break;
        }

    }
}
