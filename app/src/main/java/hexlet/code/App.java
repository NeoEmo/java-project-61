package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner gameNumber = new Scanner(System.in);
        String gameNum;
        System.out.print("Your choice: ");
        gameNum = gameNumber.nextLine();
        System.out.println(gameNum);
        // в конце надо поменять на switch case для удобства
        switch (gameNum) {
            case "1":
                getGreet();
                break;
            case "2":
                getGreet();
                EvenGame.game();
                break;
            case "3":
                getGreet();
                Calc.game();
                break;
            case "4":
                getGreet();
                GCD.game();
                break;
            case "5":
                getGreet();
                Progression.game();
                break;
            case "6":
                getGreet();
                Prime.game();
                break;
            default:
                // Handle the case where the input is not recognized
                break;
        }
    }

    public static void getGreet() {
        System.out.println("Welcome to the Brain Games!");
        Cli.getByName();
    }
}
