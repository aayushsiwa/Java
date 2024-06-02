import java.util.Scanner;

class Lab2_3 {
    public static void sort(int len) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("Sorted array is: ");
        // for (int i = 0; i < len; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(java.util.Arrays.toString(arr));
        sc.close();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len = sc.nextInt();
        System.out.println("Enter array elements: ");
        sort(len);
        sc.close();
    }
}
