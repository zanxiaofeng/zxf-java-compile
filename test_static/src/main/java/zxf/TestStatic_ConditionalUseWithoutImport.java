package zxf;

public class TestStatic_ConditionalUseWithoutImport {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String test = "1234";
        if (test.startsWith("13")) {
            System.out.println(zxf.util.StaticUtils.TEST_STATIC_INITIAL);
            System.out.println(zxf.util.StaticUtils.PATH);
        }
    }
}