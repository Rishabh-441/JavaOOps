package class23Overloading;

public class Tester1 {
    public void m1 () {
        System.out.println("No arg method");
    }

    public void m1 (int i) {
        System.out.println("int arg method");
    }

    public void m1 (float f) {
        System.out.println("float arg method");
    }

    public static void main(String[] args) {
        Tester1 t = new Tester1();
        t.m1();
        t.m1(2);
        t.m1(34.5f);
    }
}
