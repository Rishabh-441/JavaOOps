package class36MethodOVerridingVarArgs;

public class Parent36 {
    public void m1 (int... i) {
        System.out.println("Parent");
    }
}
class C extends Parent36 {
    //This is not overriding, but overloading, as the type of argument is changed.
    public void m1(int i) {
        System.out.println("Child");
    }
}
class Test {
    public static void main(String[] args) {
        Parent36 p = new Parent36();
        p.m1(22);

        C c = new C();
        c.m1(23);

        Parent36 p1 = new C();
        p1.m1(33);

    }
}