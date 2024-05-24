package class27MethodOverloadingCase4;

public class Tester27 {
    public void m1 (int i) {
        System.out.println("int type arg");
    }

    public void m1 (int... i) {
        System.out.println("int... type arg");
    }

    public static void main(String[] args) {
        Tester27 t = new Tester27();
        t.m1();
        t.m1(12);
        t.m1(1,2);

    }
}
