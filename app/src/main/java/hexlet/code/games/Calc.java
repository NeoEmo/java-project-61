package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public final class Calc {
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 10;
    public static final int ZERO_NUMBER = 0;

    public static void play() {
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        String[] actions = {"+", "-", "*"};
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int secondNumber = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int numAction = Utils.generateNumber(ZERO_NUMBER, actions.length - 1);
            String action = actions[numAction];
            int rightAnswer = calculate(firstNumber, secondNumber, action);
            rounds[i][0] = firstNumber + " " + action + " " + secondNumber;
            rounds[i][1] = String.valueOf(rightAnswer);
        }
        Engine.run(rules, rounds);
    }

    private static int calculate(int firstNumber, int secondNumber, String action) {
        switch (action) {
            case "+" -> {
                return firstNumber + secondNumber;
            }
            case "-" -> {
                return firstNumber - secondNumber;
            }
            case "*" -> {
                return firstNumber * secondNumber;
            }
            default -> throw new IllegalStateException("Unexpected value: " + action);
        }
    }

    private Calc() { }
}
