package class30MethodOverriding;

public class Parent30 {
    public void property() {
        System.out.println("cash + gold + land");
    }

    //overridden method
    public void marry () {
        System.out.println("xyz girl");
    }
}
class Child extends Parent30 {
    //overriding method
    @Override
    public void marry() {
        System.out.println("abc girl");
    }
}

class Test {
    public static void main(String[] args) {
        Parent30 p = new Parent30();
        p.marry(); //xyz girl

        Child c = new Child();
        c.marry(); //abc girl

        Parent30 p1 = new Child();
        p1.marry(); //abc girl

    }
}