package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        //System.out.println(Files.exists(Path.of("file.txt")));
        try (BufferedReader reader = Files.newBufferedReader(Path.of("file.txt"))) {
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
