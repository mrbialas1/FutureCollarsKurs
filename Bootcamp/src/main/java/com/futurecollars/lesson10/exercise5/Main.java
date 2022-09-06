package com.futurecollars.lesson10.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String content = null;
        try {
            content = Files.readString(Paths.get("C:/Users/mrbia/Desktop/FutureCollarsKurs/Bootcamp/src/main" +
                    "/java/com/futurecollars/lesson10/exercise5/data.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        String searchFor="Pliki";
        boolean value = content.contains(searchFor);
        if (value){
            System.out.println("W tekście jest słowo " + searchFor);
        }
        else {
            System.out.println("W tekście nie ma słowa " + searchFor);
        }
    }
}