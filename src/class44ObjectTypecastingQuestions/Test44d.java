package class44ObjectTypecastingQuestions;

class A2 {
    int x = 777;
}
class B2 extends A2 {
    int x = 888;
}
class C2 extends B2 {
    int x = 999;
}
public class Test44d {
    public static void main(String[] args) {
        C2 c = new C2();
        System.out.println(c.x);
        System.out.println(((B2)c).x);
        System.out.println(((A2)((B2) c)).x);
    }
}
