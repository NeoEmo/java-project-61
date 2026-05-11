package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private static String userName;

    private Cli() { }

    public static void greet(Scanner sc) {
        String greet = """
                Welcome to the Brain Games!
                May I have your name?\s""";

        System.out.print(greet);
        String name = sc.nextLine();
        userName = name;
        System.out.println("Hello, " + name + "!");
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void badAnswer() {
        System.out.println("Let's try again, " + userName + "!");
    }
}
