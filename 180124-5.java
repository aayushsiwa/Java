// Find the no. of occurrence of each element in a user entered list of nos.
// Input:  	Enter list of numbers  e.g.( 15 25 15 11 25 32 15 32)  
// Output: 	Occurrence of 15=3
// Occurrence of 25=2
// Occurrence of 11=1
// Occurrence of 32=2
import java.util.Scanner;

class Lab2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[10];
        int[] count;
        count = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            count[i] = 0;
        }
        for (int i = 0; i < 10; i++) {
            int c = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            count[i] = c;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] != 0) {
                System.out.println("Occurrence of " + arr[i] + "=" + count[i]);
            }
        }
        sc.close();
    }
}