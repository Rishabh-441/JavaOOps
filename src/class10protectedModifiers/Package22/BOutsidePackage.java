package class10protectedModifiers.Package22;

import class10protectedModifiers.Package11.AClass10;

public class BOutsidePackage extends AClass10{
    public static void main(String[] args) {
        AClass10 a = new AClass10();
//        a.m1();   error

        BOutsidePackage b = new BOutsidePackage();
        b.m1();

        AClass10 a1 = new BOutsidePackage();
//        a1.m1();   error

    }
}
