package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class GCD {
    public static void play(Scanner scanner, Random random) {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = random.nextInt(Engine.HALF_NUMBER);
            int secondNumber = random.nextInt(Engine.HALF_NUMBER);
            int rightAnswer = calculationGCD(firstNumber, secondNumber);
            rounds[i][0] =  firstNumber + " " + secondNumber;
            rounds[i][1] = String.valueOf(rightAnswer);
        }
        Engine.run(rules, rounds, scanner);
    }

    public static int calculationGCD(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        return Math.abs(firstNumber);
    }

    private GCD() { }
}
