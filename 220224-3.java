/*
 * 4. Aim of the program - Define an interface Emploee with a method
 * getDetails() to get emplyee details as Empid and Ename. Also define a derived
 * interface Manager with a method getDeptDetails() to get department details
 * such as Deptid and Deptname.Then define a class Head which implements Manager
 * interface and also prints all details of the employee. Write the complete
 * program to display all details of one head of the department.
 * Input - Enter employee id - 123
 * Enter employee name - Sidharth Ambani
 * Enter department id - 06
 * Enter department name -Marketing
 */
interface Employee {
    void getDetails();
}

interface Manag extends Employee {
    void getDeptDetails();
}

class Head implements Manag {
    int empid;
    String ename;
    int deptid;
    String deptname;
    public void getDetails() {
        System.out.print("Enter employee id - ");
        empid = Integer.parseInt(System.console().readLine());
        System.out.print("Enter employee name - ");
        ename = System.console().readLine();
    }
    public void getDeptDetails() {
        System.out.print("Enter department id - ");
        deptid = Integer.parseInt(System.console().readLine());
        System.out.print("Enter department name - ");
        deptname = System.console().readLine();
    }
    public void printDetails() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + ename);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

class lab5_4 {
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        System.out.println("\nDetails of the head of the department:\n");
        h.printDetails();
    }
}

// implementation of interface and inheritance of interface 