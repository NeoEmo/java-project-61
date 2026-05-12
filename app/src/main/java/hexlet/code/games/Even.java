package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public final class Even {
    public static void play(Scanner sc, Random random) {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(Engine.MAX_NUMBER);
            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = (number % 2 == 0) ? "yes" : "no";
        }
        Engine.run(rules, rounds, sc);
    }

    private Even() { }
}
