package com.futurecollars.lesson8;

public class Main {
    public static void main(String[] args) {
        ConsoleMessage consoleMessage = new ConsoleMessage();
        System.out.println(consoleMessage.getMessage());
        WindowMessage windowMessage = new WindowMessage();
        System.out.println(windowMessage.getMessage());
    }
}
