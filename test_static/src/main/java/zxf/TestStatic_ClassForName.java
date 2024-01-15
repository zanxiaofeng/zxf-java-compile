package zxf;

public class TestStatic_ClassForName {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello world! loaded by " + TestStatic_ClassForName.class.getClassLoader());
        Class.forName("zxf.util.StaticUtils");
    }
}