package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD {
    public static final int HALF_NUMBER = 50;
    public static final int MIN_NUMBER = 10;

    public static void play() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.generateNumber(MIN_NUMBER, HALF_NUMBER);
            int secondNumber = Utils.generateNumber(MIN_NUMBER, HALF_NUMBER);
            int rightAnswer = calculationGCD(firstNumber, secondNumber);
            rounds[i][0] =  firstNumber + " " + secondNumber;
            rounds[i][1] = String.valueOf(rightAnswer);
        }
        Engine.run(rules, rounds);
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
