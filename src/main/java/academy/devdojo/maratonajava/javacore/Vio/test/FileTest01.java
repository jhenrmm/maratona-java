package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println("Path "+file.getPath());
            System.out.println("Absolute Path "+file.getAbsolutePath());
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted "+file.delete());
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
