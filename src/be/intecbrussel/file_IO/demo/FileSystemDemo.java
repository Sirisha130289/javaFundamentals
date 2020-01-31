package be.intecbrussel.file_IO.demo;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemDemo {
    public static void main(String[] args) {
        try{
            FileSystem fs = FileSystems.getDefault();
            System.out.println(fs.getSeparator());
            for(Path p:fs.getRootDirectories()){
                System.out.println(p);
            }
                        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
