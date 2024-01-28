package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner gameNumber = new Scanner(System.in);
        int gameNum;
        System.out.print("Your choice: ");
        gameNum = gameNumber.nextInt();
        System.out.println(gameNum);
        // в конце надо поменять на switch case для удобства
        if (gameNum == 1) {
            App.getGreet();
        } else if (gameNum == 2) {
            App.getGreet();
            EvenGame.game();
        } else if (gameNum == 3) {
            App.getGreet();
            Calc.game();
        }
    }

    public static void getGreet() {
        System.out.println("Welcome to the Brain Games!");
        Cli.getByName();
    }
}
