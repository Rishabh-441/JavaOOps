package class12Interface;

public abstract class ServiceProvider implements Interf{
    //at time of declaring (overriding) the abstract method of the interface, we need to declare it as "public".
    public void m1() {

    }


}

class SubServiceProvider extends ServiceProvider {

    @Override
    public void m2() {
        System.out.println("implementing m2() in subserviceprovider class");
    }

    public static void main(String[] args) {
        Interf.m3();
    }
}
