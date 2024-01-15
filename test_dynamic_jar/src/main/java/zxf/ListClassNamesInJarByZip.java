package zxf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;

public class ListClassNamesInJarByZip {
    public static void main(String[] args) throws IOException {
        List<String> classNames = new ArrayList<>();
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(Paths.get("./test_dynamic_jar/libraries/same-class-a-0.0.1.jar").toAbsolutePath().toString()))) {
            for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
                if (!entry.isDirectory() && entry.getName().endsWith(".class")) {
                    String className = entry.getName().replace('/', '.');
                    classNames.add(className.substring(0, className.length() - ".class".length()));
                }
            }
        }
        System.out.println("Classes: " + classNames);
    }
}
