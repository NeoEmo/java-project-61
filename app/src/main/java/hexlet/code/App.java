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
        SCANNER.nextLine();
        switch (userAnswer) {
            case EXIT_SUCCESS -> {
                SCANNER.close();
                System.exit(EXIT_SUCCESS);
            }
            case CLI_GREET -> Cli.greet();
            case EVEN_GAME -> Even.play();
            case CALC_GAME -> Calc.play();
            case GCD_GAME -> GCD.play();
            case PROGRESSION_GAME -> Progression.play();
            case PRIME_GAME -> Prime.play();
            default -> System.out.println("Wrong choice: " + userAnswer + ". Try again.");
        }
    }
    public static void closeScanner() {
        SCANNER.close();
    }
}
