package class24MethodOverloadingCase1;

public class Tester24 {
    public void m1 (int i) {
        System.out.println("int m1 method");
    }

    public void m1 (float f) {
        System.out.println("float m1 method");
    }

    public static void main(String[] args) {
        Tester24 t = new Tester24();
        t.m1(23);
        t.m1(10.5f);
        t.m1('a');
        t.m1(10l);
    }
}
