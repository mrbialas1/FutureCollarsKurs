package com.futurecollars.lesson10.exercise3;


import static com.futurecollars.lesson10.exercise3.FileReader.readEverySecondLineOfFile;
import static com.futurecollars.lesson10.exercise3.FileReader.readFile;

public class Main {
    public static void main(String[] args) {
        String path = "C:/Users/mrbia/Desktop/FutureCollarsKurs/Bootcamp/src/main" +
                "/java/com/futurecollars/lesson10/exercise3/data.txt";
        String content = readFile(path);
        readEverySecondLineOfFile(content);
    }
}
