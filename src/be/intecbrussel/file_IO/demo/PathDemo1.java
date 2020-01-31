package be.intecbrussel.file_IO.demo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo1 {
    public static void main(String[] args) {
        Path filePath =
                Paths.get("C:\\Users\\SIRISHAA\\Documents");
        System.out.println(filePath);
        System.out.println("File name is: " + filePath.getFileName());

        Path path1 = Paths.get("C:\\Users");
        Path path2 = path1.resolve("SIRISHAA");
        Path path3 = path2.resolve("Documents");
        System.out.println(path3);
        Path path4 = Paths.get("texts.txt");
        System.out.println("Absolute path of file is : "+path4.toAbsolutePath());
        Path path5 = Paths.get("C:\\Users\\IntecPC221=02\\SIRISHAA\\Documents");
        Path path6 = Paths.get("C:\\Users\\IntecPC221=02\\SIRISHAA\\Documents");
        System.out.println("Relativize method "+ path5.relativize(path6));
        System.out.println("Root of the file: "+path6.getRoot());
    }
}
