package zxf;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ListClassNamesInJarByJarFile {
    public static void main(String[] args) throws IOException {
        List<String> classNames = new ArrayList<>();
        try (JarFile jarFile = new JarFile(Paths.get("./test_dynamic_jar/libraries/same-class-a-0.0.1.jar").toAbsolutePath().toString())) {
            for (JarEntry entry : Collections.list(jarFile.entries())) {
                if (!entry.isDirectory() && entry.getName().endsWith(".class")) {
                    String className = entry.getName().replace('/', '.');
                    classNames.add(className.substring(0, className.length() - ".class".length()));
                }
            }
        }
        System.out.println("Classes: " + classNames);
    }
}
