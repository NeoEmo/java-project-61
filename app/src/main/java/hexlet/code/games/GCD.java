package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD {
    public static void play() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.generateNumber(Engine.MIN_NUMBER, Engine.HALF_NUMBER);
            int secondNumber = Utils.generateNumber(Engine.MIN_NUMBER, Engine.HALF_NUMBER);
            int rightAnswer = calculationGCD(firstNumber, secondNumber);
            rounds[i][0] =  firstNumber + " " + secondNumber;
            rounds[i][1] = String.valueOf(rightAnswer);
        }
        Engine.run(rules, rounds, App.SCANNER);
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
