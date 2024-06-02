import java.util.Scanner;

/**
 * 250124-3
 * 3. Aim of the program : Write a program in java to input and display the
 * details of n number of students having roll, name and cgpa as data members.
 * Also display the name of the student having lowest cgpa.
 * Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
 * Output: Display the details of ‘n’ number of students. Also display the name
 * of student with lowest cgpa
 * 
 */
class Lab3_3 {
    static class Student {
        int roll;
        String name;
        double cgpa;

        Student(int roll, String name, double cgpa) {
            this.roll = roll;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll no: ");
            int roll = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter cgpa: ");
            double cgpa = sc.nextDouble();
            students[i] = new Student(roll, name, cgpa);
        }
        Student lowest = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowest.cgpa) {
                lowest = students[i];
            }
        }
        System.out.println("Lowest cgpa: " + lowest.cgpa);
        sc.close();
    }
}