package class44ObjectTypecastingQuestions;
class A {
    public void m1() {
        System.out.println("A");
    }
}
class B extends A {
    public void m1() {
        System.out.println("B");
    }
}
class C extends B {
    public void m1() {
        System.out.println("C");
    }
}
public class Test44b {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        ((B)c).m1();
        ((A)((B)c)).m1();
    }
}
