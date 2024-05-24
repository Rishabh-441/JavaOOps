package class10protectedModifiers.Package11;


public class AClass10 {
    protected void m1 () {
        System.out.println("A class protected method");
    }
}

class B extends AClass10 {
    public static void main(String[] args) {
        AClass10 a = new AClass10();
        a.m1();

        B b = new B();
        b.m1();

        AClass10 a1 = new B();
        a1.m1();
    }
}
