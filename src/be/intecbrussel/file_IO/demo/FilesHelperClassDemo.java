package be.intecbrussel.file_IO.demo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesHelperClassDemo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\SIRISHAA\\Documents");
        try {
            Files.createDirectories(path.getParent());
            if (Files.notExists(path)) {
                Files.createFile(path);
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
            List<String> words = new ArrayList<>();
            words.add("Appel");
            words.add("Aardbei");
            words.add("Ananas");
            words.add("Avocado");
            words.add("Golden kiwi is yummy");

            Files.write(path, words, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
            DosFileAttributes attributes = Files.readAttributes(path, DosFileAttributes.class);

            System.out.println("Size of the file " + attributes.size());
            System.out.println("Time of file creation:" + attributes.creationTime());
            System.out.println(attributes.lastAccessTime());
            System.out.println(attributes.lastModifiedTime());
            System.out.println(attributes.isHidden());
            System.out.println(attributes.isReadOnly());

            System.out.println("*".repeat(20));
            Files.lines(path).forEach(System.out::println);

            Path path1 = Paths.get(path)

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
