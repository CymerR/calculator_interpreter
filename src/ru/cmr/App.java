package ru.cmr;

public class App {
    public static void main(String[] args) {
        var s = "25 * 5 - 100";
        System.out.println(new Calculator(s).calc());
    }
}
