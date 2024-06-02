// Accept 10 numbers from command line and check how many of them are even and how many are odd.
class Lab2_2 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[10];
        int o = 0, e = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        System.out.println("There are " + e + " even numbers");
        System.out.println("There are " + o + " odd numbers");
    }
}