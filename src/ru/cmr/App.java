package ru.cmr;

public class App {
    public static void main(String[] args) {
        var s = "1 + 1";
        System.out.println(new Calculator(s).calc());
    }
}
