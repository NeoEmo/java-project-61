package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;


public final class Calc {
    public static void play() {
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        String[] actions = {"+", "-", "*"};
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.generateNumber(Engine.MIN_NUMBER, Engine.MAX_NUMBER);
            int secondNumber = Utils.generateNumber(Engine.MIN_NUMBER, Engine.MAX_NUMBER);
            int numAction = Utils.generateNumber(Engine.ZERO_NUMBER, actions.length);
            String action = actions[numAction];
            int rightAnswer = switch (action) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                default -> throw new IllegalStateException("Unexpected value: " + action);
            };
            rounds[i][0] = firstNumber + " " + action + " " + secondNumber;
            rounds[i][1] = String.valueOf(rightAnswer);
        }
        Engine.run(rules, rounds, App.SCANNER);
    }

    private Calc() { }
}
