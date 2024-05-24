package class28MethodOverloadingCase5;

public class Tester28 {
    public void m1 (int i, float f) {
        System.out.println("int float version");
    }

    public void m1 (float f, int i) {
        System.out.println("float int version");
    }

    public static void main(String[] args) {
        Tester28 t = new Tester28();
        t.m1(2,45.6f); //int float version
        t.m1 (12.45f, 3); //float int version
//        t.m1(23,34); <----reference to m1() is ambiguous: compiler error, as both method matched.
//        t.m1(23.4f, 343.5f); <----no match found for m1(float, float)
    }
}
