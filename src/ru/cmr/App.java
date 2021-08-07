package ru.cmr;

public class App {
    public static void main(String[] args) {
        var s = "3 * 4 / 6";
        System.out.println(new Calculator(s).calc());
    }
}
