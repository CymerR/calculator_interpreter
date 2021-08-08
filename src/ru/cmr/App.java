package ru.cmr;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        while(true) {
            var s = sc.nextLine().trim();//"-1 + 2 / 2";
            if (s.equalsIgnoreCase("q")) break;
//            if (!Pattern.matches("\\d+|\\s+|[+\\-*/]+", s)) {
//                System.err.printf(
//                        "Error! \nUsage:\t %s \nInstead was: { '%s' } \n",
//                        "Type correct input!",
//                        s
//                );
//                continue;
//            }
            System.out.println(new Calculator(s).calc());
        }
        System.out.println("BB!");
    }
}
