package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;


public class App {
    private final static String MENU = """
            Welcome to the Brain Games!
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""";
    public static void main(String[] args) {
        System.out.println(MENU);
        Scanner gameNumber = new Scanner(System.in);
        String gameNum;
        System.out.print("Your choice: ");
        gameNum = gameNumber.nextLine();
        System.out.println(gameNum);
        switch (gameNum) {
            case "1":
                Cli.getByName();
                break;
            case "2":
                Cli.getByName();
                EvenGame.game();
                break;
            case "3":
                Cli.getByName();
                Calc.game();
                break;
            case "4":
                Cli.getByName();
                GCD.game();
                break;
            case "5":
                Cli.getByName();
                Progression.game();
                break;
            case "6":
                Cli.getByName();
                Prime.game();
                break;
            default:
                break;
        }
    }
}
