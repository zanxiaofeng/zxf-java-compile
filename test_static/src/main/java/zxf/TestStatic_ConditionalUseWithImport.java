package zxf;

// Import a class does not mean the classloader will load the class into memery.
// it loads it dynamically when it's used.
import zxf.util.StaticUtils;

public class TestStatic_ConditionalUseWithImport {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String test = "1234";
        if (test.startsWith("12")) {
            System.out.println(StaticUtils.TEST_STATIC_INITIAL);
            System.out.println(StaticUtils.PATH);
        }
    }
}