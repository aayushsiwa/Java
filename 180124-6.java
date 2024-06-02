// Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrix in Java.
import java.util.Scanner;
class Lab2_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 X 3 matrix elements: ");
        int[][] arr;
        arr = new int[3][3];
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
                if(i==j){
                    sum1 += arr[i][j];
                }
                if(i+j==2){
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal elements = "+sum1);
        System.out.println("Sum of right diagonal elements = "+sum2);
        sc.close();
    }
}