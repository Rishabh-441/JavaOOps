package class37MethodOverridingWRTVariables;

public class Parent37 {
    static String s = "Parent";
}
class C extends Parent37 {
    String s = "Child";
}
class Test {
    public static void main(String[] args) {
        Parent37 p = new Parent37();
        System.out.println(p.s);

        C c = new C();
        System.out.println(c.s);

        Parent37 p1 = new C();
        System.out.println(p1.s);
    }
}
