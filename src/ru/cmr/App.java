package ru.cmr;

public class App {
    public static void main(String[] args) {
        var s = "2 + 3 - 4";
        System.out.println(new Calculator(s).calc());
    }
}
