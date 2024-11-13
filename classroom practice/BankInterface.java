interface Bank  {
    void getInterestOf();
}

class SBI implements Bank  {
    public void getInterestOf()  {
        System.out.println("7%");
    }
}

class ICICI implements Bank  {
    public void getInterestOf()  {
        System.out.println("9%");
    }
}

class AXIS implements Bank  {
    public void getInterestOf()  {
        System.out.println("8%");
    }
}

class DemoBank  {
    public static void main(String[] args) {
        Bank a=new AXIS();
        Bank b=new SBI();
        Bank c=new ICICI();
        a.getInterestOf();
        b.getInterestOf();
        c.getInterestOf();

    }
}