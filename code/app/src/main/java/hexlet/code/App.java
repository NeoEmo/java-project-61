package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static final int EXIT_SUCCESS = 0;

    public static void main(String[] args) {
        String menu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""";

        System.out.print(menu);
        int userAnswer = SCANNER.nextInt();
        boolean isValid = false;
        SCANNER.nextLine();
        while (!isValid) {
            switch (userAnswer) {
                case 0 -> {
                    System.exit(EXIT_SUCCESS);
                    isValid = true;
                }

                case 1 -> {
                    Cli.greet(SCANNER);
                    isValid = true;
                }

                case 2 -> {
                    Cli.greet(SCANNER);
                    Even.play(SCANNER, RANDOM);
                    isValid = true;
                }
                case 3 -> {
                    Cli.greet(SCANNER);
                    Calc.play(SCANNER, RANDOM);
                    isValid = true;
                }
                case 4 -> {
                    Cli.greet(SCANNER);
                    GCD.play(SCANNER, RANDOM);
                    isValid = true;
                }
                case 5 -> {
                    Cli.greet(SCANNER);
                    Progression.play(SCANNER, RANDOM);
                    isValid = true;
                }
                case 6 -> {
                    Cli.greet(SCANNER);
                    Prime.play(SCANNER, RANDOM);
                    isValid = true;
                }
                default -> {
                    System.out.print(menu);
                    userAnswer = SCANNER.nextInt();
                    SCANNER.nextLine();
                }
            }
        }
    }

    public static void closeScanner() {
        SCANNER.close();
    }
}
