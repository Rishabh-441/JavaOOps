package class44ObjectTypecastingQuestions;
class A1 {
    public static void m1() {
        System.out.println("A");
    }
}
class B1 extends A1 {
    public static void m1() {
        System.out.println("B");
    }
}
class C1 extends B1 {
    public static void m1() {
        System.out.println("C");
    }
}
public class Test44c {
    public static void main(String[] args) {
        C1 c = new C1();
        c.m1();
        ((B1)c).m1();
        ((A1)((B1)c)).m1();
    }
}
