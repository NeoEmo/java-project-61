package hexlet.code;

import java.util.Scanner;

public final class Cli {
    public static String userName;

    private Cli() { }

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        String greet = """
                Welcome to the Brain Games!
                May I have your name?\s""";

        System.out.print(greet);
        String name = scanner.nextLine();
        userName = name;
        System.out.println("Hello, " + name + "!");
    }
}
