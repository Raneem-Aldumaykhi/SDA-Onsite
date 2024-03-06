package homeworks.day11;

import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;

public class Task2 extends TestBase {

    public static void main(String[] args) {
        String user = System.getProperty("user.home");
        String sepertor = System.getProperty("file.separator");
        System.out.println("userDir = " + user);
        System.out.println("sepertor = " + sepertor);


        String path =user + sepertor + "OneDrive\\سطح المكتب\\Pass.docx";

        System.out.println("path = " + path);
        boolean isExists = Files.exists(Path.of(path));
        System.out.println("isExists = " + isExists);
    }

}
