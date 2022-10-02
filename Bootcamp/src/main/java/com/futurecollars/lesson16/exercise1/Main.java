package com.futurecollars.lesson16.exercise1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI("https://futurecollars.com/pl/"))
                        .GET()
                        .build();
        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());
        String name = "HTML";
        String pathToFile = String.format("src/main/resources/%s.txt", name);
        File file = new File(pathToFile, name);
        writeToFile(pathToFile, String.valueOf(httpResponse));
    }

    public static void writeToFile(String pathToFile, String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToFile))) {
            writer.write(text);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
