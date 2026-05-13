package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int EXIT_SUCCESS = 0;
    public static final int CLI_GREET = 1;
    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;

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
        Cli.greet();
        boolean isValid = false;
        SCANNER.nextLine();
        while (!isValid) {
            switch (userAnswer) {
                case EXIT_SUCCESS -> {
                    System.exit(EXIT_SUCCESS);
                    isValid = true;
                }

                case CLI_GREET -> {
                    Cli.greet();
                    isValid = true;
                }

                case EVEN_GAME -> {
                    Even.play();
                    isValid = true;
                }
                case CALC_GAME -> {
                    Calc.play();
                    isValid = true;
                }
                case GCD_GAME -> {
                    GCD.play();
                    isValid = true;
                }
                case PROGRESSION_GAME -> {
                    Progression.play();
                    isValid = true;
                }
                case PRIME_GAME -> {
                    Prime.play();
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
