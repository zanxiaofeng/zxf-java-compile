package zxf.util;

public class StaticUtils {
    public static final String PATH = getEnv("PATH");
    public static final String TEST_STATIC_INITIAL;

    private static String getEnv(String name) {
        System.out.println("Try to get env for " + name);
        return System.getenv(name);
    }

    static {
        System.out.println("StaticUtils static init");
        TEST_STATIC_INITIAL = "initialed by static init";
    }
}
