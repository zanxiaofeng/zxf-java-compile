package zxf;

public class UseObject {
    public static void main(String[] args) {
        System.out.println(OverLoading.staticOverloading(new Object()));
        System.out.println(new OverLoading().overloading(new Object()));
    }
}
