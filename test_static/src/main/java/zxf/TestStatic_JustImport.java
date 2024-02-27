package zxf;

// Import a class does not mean the classloader will load the class into memery.
// it loads it dynamically when it's used.
import zxf.util.StaticUtils;

public class TestStatic_JustImport {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}