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
        int gameNum;
        int greet = 1;
        int even = 2;
        int calc = 3;
        int gcd = 4;
        int progression = 5;
        int prime = 6;
        System.out.print("Your choice: ");
        gameNum = gameNumber.nextInt();
        System.out.println(gameNum);
        // в конце надо поменять на switch case для удобства
        if (gameNum == greet) {
            App.getGreet();
        } else if (gameNum == even) {
            App.getGreet();
            EvenGame.game();
        } else if (gameNum == calc) {
            App.getGreet();
            Calc.game();
        } else if (gameNum == gcd) {
            App.getGreet();
            GCD.game();
        } else if (gameNum == progression) {
            App.getGreet();
            Progression.game();
        } else if (gameNum == prime) {
            App.getGreet();
            Prime.game();
        }
    }

    public static void getGreet() {
        System.out.println("Welcome to the Brain Games!");
        Cli.getByName();
    }
}
