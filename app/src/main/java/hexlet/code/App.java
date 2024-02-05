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
        String greet = "1";
        String even = "2";
        String calc = "3";
        String gcd = "4";
        String progression = "5";
        String prime = "6";
        System.out.print("Your choice: ");
        gameNum = gameNumber.nextLine();
        System.out.println(gameNum);
        // в конце надо поменять на switch case для удобства
        if (gameNum.equals(greet)) {
            App.getGreet();
        } else if (gameNum.equals(even)) {
            App.getGreet();
            EvenGame.game();
        } else if (gameNum.equals(calc)) {
            App.getGreet();
            Calc.game();
        } else if (gameNum.equals(gcd)) {
            App.getGreet();
            GCD.game();
        } else if (gameNum.equals(progression)) {
            App.getGreet();
            Progression.game();
        } else if (gameNum.equals(prime)) {
            App.getGreet();
            Prime.game();
        }
    }

    public static void getGreet() {
        System.out.println("Welcome to the Brain Games!");
        Cli.getByName();
    }
}
