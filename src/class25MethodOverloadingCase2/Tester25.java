package class25MethodOverloadingCase2;

public class Tester25 {
    public void m1 (Object obj) {
        System.out.println("Object version");
    }

    public void m1 (String str) {
        System.out.println("String version");
    }

    public static void main(String[] args) {
        Tester25 t = new Tester25();
        t.m1(new Object()); //Object version
        t.m1("Rishabh"); //String version
        t.m1(null); //String version
    }
}
