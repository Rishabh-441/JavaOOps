package class12Interface;

public interface Interf {
    //every method present inside interface is public and abstract.
    //even if we are declaring it public and abstract or not, it's by default public and abstract.
    public void m1();
    public void m2();

    static void m3() {
        System.out.println("this is private static method m3()");
    }

    private void m4() {
        Interf.m3();
    }
}
