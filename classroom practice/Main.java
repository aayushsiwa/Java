class Main {
    public static void main(String args[]) {
        final int i;
        i = 20;
        i = 30;
        System.out.println(i);
    }
}

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The final local variable i may already have been assigned

        at Main.main(Main.java:5)