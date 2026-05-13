package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int MAX_NUMBER = 100;
    public static final int HALF_NUMBER = 50;
    public static final int MIN_NUMBER = 10;
    public static final int LENGTH_PROGRESSION = 10;
    public static final int MIN_STEP = 1;
    public static final int MAX_STEP = 10;
    public static final int ZERO_NUMBER = 0;

    public static void run(String rules, String[][] rounds, Scanner sc) {
        System.out.println(rules);
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + rounds[i][0]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (answer.equals(rounds[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rounds[i][1] + "'.");
                Engine.badAnswer();
                return;
            }
        }
        Engine.congratulations();
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + Cli.userName + "!");
    }

    public static void badAnswer() {
        System.out.println("Let's try again, " + Cli.userName + "!");
    }

    private Engine() { }
}
