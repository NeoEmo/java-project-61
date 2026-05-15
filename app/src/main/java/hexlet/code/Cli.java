package hexlet.code;

import java.util.Scanner;

public final class Cli {
    public static String userName;

    private Cli() { }

    public static void greet() {
        String greet = """
                Welcome to the Brain Games!
                May I have your name?\s""";
        Scanner input = new Scanner(System.in);
        System.out.print(greet);
        String name = input.nextLine();
        userName = name;
        System.out.println("Hello, " + name + "!");
    }
}
