class Rectangle{
    int length;
    int breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    int area(){
        return length * breadth;
    }
    int perimeter(){
        return 2 * (length + breadth);
    }
}

// Method initialization

class Main{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(20, 30);
        System.out.println("Area of r1: " + r1.area());
        System.out.println("Perimeter of r1: " + r1.perimeter());
        System.out.println("Area of r2: " + r2.area());
        System.out.println("Perimeter of r2: " + r2.perimeter());
    }
}