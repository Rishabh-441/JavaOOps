package class26MethodOverloadingCase3;

public class Tester26 {
    public void m1 (String s) {
        System.out.println("m1 with String");
    }

    public void m1 (StringBuffer s) {
        System.out.println("m1 with StringBuffer");
    }

    public static void main(String[] args) {
        Tester26 t = new Tester26();
        t.m1("Hello"); // m1 with String
        t.m1(new StringBuffer("Hello")); // m1 with StringBuffer
//        t.m1(null); // compile time error: ambiguous as both are valid.
    }
}
