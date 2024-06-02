/*
 * 3. Aim of the program -Define an interface with three methods – earnings(),
 * deductions() and bonus() and define a Java class ‘Manager’ which uses this
 * interface without implementing bonus() method. Also define another Java class
 * ‘Substaff’ which extends from ‘Manager’ class and implements bonus() method.
 * Write the complete program to find out earnings, deduction and bonus of a
 * sbstaff with basic salary amount entered by the user as per the following
 * guidelines –
 * earnings basic + DA (80% of basic) + HRA (15% of basic)
 * deduction PF 12% of basic
 * bonus 50% of basic
 *      Input -Basic salary - 50000
 *      Output -Earnings - 97500
 *              Deduction -6000
 *              Bonus - 25000
 */

interface Employee {
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Employee {
    int basic;
    Manager(int basic) {
        this.basic = basic;
    }
    public void earnings() {
        System.out.println("Earnings - " + (basic + 0.8 * basic + 0.15 * basic));
    }
    public void deductions() {
        System.out.println("Deduction - " + 0.12 * basic);
    }
    public void bonus() {
        System.out.println("Bonus - Not implemented");
    }
}

class Substaff extends Manager {
    Substaff(int basic) {
        super(basic);
    }
    public void bonus() {
        System.out.println("Bonus - " + 0.5 * basic);
    }
}

class lab5_3 {
    public static void main(String[] args) {
        Substaff s = new Substaff(60000);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}