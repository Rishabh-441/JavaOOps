package class44ObjectTypecastingQuestions;

class Parent44 {
    public void m1() {
        System.out.println("Parent method");
    }
}
class Child extends Parent44 {
    public void m2() {
        System.out.println("Child method");
    }
}
public class Test44 {
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        c.m2();
        ((Parent44)c).m1();
//        ((Parent44)c).m2();
    }
}
