package zxf;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;

public class LoadSpecifiedClassFromJar {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("Class load for main: " + LoadSpecifiedClassFromJar.class.getClassLoader());
        System.out.println("Class load for thread: " + Thread.currentThread().getContextClassLoader());

        URL urlA = new URL("jar:file:" + Paths.get("./test_dynamic_jar/libraries/same-class-a-0.0.1.jar").toAbsolutePath() + "!/");
        URL urlB = new URL("jar:file:" + Paths.get("./test_dynamic_jar/libraries/same-class-b-0.0.1.jar").toAbsolutePath() + "!/");
        //Because parent first, the Common class in same-class will be loaded first.
        loadAsSequence(urlA, urlB);
        loadAsSequence(urlB, urlA);
    }

    private static void loadAsSequence(URL url1, URL url2) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        URLClassLoader urlClassLoader = URLClassLoader.newInstance(new URL[]{url1, url2});
        Class klass = urlClassLoader.loadClass("zxf.common.Common");
        klass.newInstance();
    }
}
