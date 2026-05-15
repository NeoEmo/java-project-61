package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 10;

    public static void play() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = (number % 2 == 0) ? "yes" : "no";
        }
        Engine.run(rules, rounds);
    }

    private Even() { }
}
