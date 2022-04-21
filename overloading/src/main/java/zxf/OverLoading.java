package zxf;

public class OverLoading {
    public static String staticOverloading(String string) {
        return "static string " + string.toString();
    }

    public String overloading(String string) {
        return "string " + string.toString();
    }

    public static String staticOverloading(Object object) {
        return "static object " + object.toString();
    }

    public String overloading(Object object) {
        return "object " + object.toString();
    }
}