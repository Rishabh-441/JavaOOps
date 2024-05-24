package class16TightlyEncapsulatedClass;

public class AClass16 {
    int x = 10;
}

class B extends AClass16{
    private int y = 20;
}

class C extends B {
    private int z = 30;
}

