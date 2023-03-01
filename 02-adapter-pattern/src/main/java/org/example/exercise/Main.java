package org.example.exercise;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("adapter-pattern/src/main/java/org/example/exercise/file.txt");
            f.setValue("year", "2002");
            f.setValue("month", "2");
            f.setValue("day", "27");
            f.writeToFile("adapter-pattern/src/main/java/org/example/exercise/newfile.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
