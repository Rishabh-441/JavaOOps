package class43InternalThingsOfObjectTypecasting;

public class Test43 {
    public static void main(String[] args) {
        String s = new String("Hello");
        Object o = (Object) s;
        System.out.println(s == o);
    }
}
