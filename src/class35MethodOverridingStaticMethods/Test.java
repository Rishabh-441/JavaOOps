package class35MethodOverridingStaticMethods;

class Parent35 {
    public static void m1() {//static methods are class level methods, can't be overridden!
        System.out.println("Parent static");
    }
}

class C extends Parent35 {
    // Method hiding
    public static void m1() {
        System.out.println("Child static");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent35 p = new C();
        p.m1();

        Parent35 p1 = new Parent35();
        p1.m1();

        C c = new C();
        c.m1();
    }
}
