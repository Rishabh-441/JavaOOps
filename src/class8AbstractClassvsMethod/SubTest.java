package class8AbstractClassvsMethod;

abstract class Test {
    public abstract void m1();
    public abstract void m2();
}

public abstract class SubTest extends Test {
}

class SubSubTest extends SubTest {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}
