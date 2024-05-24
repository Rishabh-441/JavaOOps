package class20MultipleInheritance;

public interface P1Interface {
    public void m1();
    public void m2();
}

interface P2Interface {
    public void m1();
    public void m2();
}

class ChildClass implements P1Interface, P2Interface {
    @Override
    public void m1() {
        System.out.println("Child implements m1() method");
    }

    @Override
    public void m2() {
        System.out.println("child implements m2() method");
    }
}
