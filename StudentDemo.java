class Student{
    String name;
    int roll;
    String branch;
    String college;
}

class Main2{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="John";
        s1.roll=2;
        s1.branch="CSE";
        s1.college="IIT";
        s2.name="Sam";
        s2.roll=3;
        s2.branch="ECE";
        s2.college="IIT";
        System.out.println("Name: "+s1.name);
        System.out.println("Roll: "+s1.roll);
        System.out.println("Branch: "+s1.branch);
        System.out.println("College: "+s1.college);
        System.out.println("Name: "+s2.name);
        System.out.println("Roll: "+s2.roll);
        System.out.println("Branch: "+s2.branch);
        System.out.println("College: "+s2.college);
    }
}