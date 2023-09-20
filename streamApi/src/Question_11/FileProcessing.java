package Question_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessing {
    public static void main(String[] args) throws IOException {
        Files.lines(Path.of("C:\\Users\\pavan\\OneDrive\\Desktop\\projects.txt")).forEach(t-> System.out.println(t));

    }
}
