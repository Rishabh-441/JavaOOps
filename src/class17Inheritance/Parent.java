package class17Inheritance;

public class Parent {
    public void m1 () {
        System.out.println("Method m1 in the parent class");
    }
}

class C extends Parent {
    public void m2 () {
        System.out.println("Method m2 in C class");
    }
}

class Test {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1();

        Parent p = new C();
        p.m1();
//        p.m2();

        C c = new C();
        c.m2();
        c.m1();

//        C c1 = new Parent();

    }
}