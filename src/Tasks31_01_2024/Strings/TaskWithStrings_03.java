package Tasks31_01_2024.Strings;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TaskWithStrings_03 {
    public static void main(String[] args) {

        Path testFilePath = Paths.get("C:\\Windows\\System32\\calc.exe");

        Path fileName = testFilePath.getFileName();
        System.out.println(fileName);

        Path parent = testFilePath.getParent();
        System.out.println(parent);
    }
}

