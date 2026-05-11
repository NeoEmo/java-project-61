package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public final class Calc {
    public static void play(Scanner sc, Random random) {
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        String[] actions = {"+", "-", "*"};
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = random.nextInt(Engine.MAX_NUMBER);
            int secondNumber = random.nextInt(Engine.MAX_NUMBER);
            int numAction = random.nextInt(actions.length);
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
        Engine.run(rules, rounds, sc);
    }

    private Calc() { }
}
