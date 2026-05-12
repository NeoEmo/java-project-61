package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Progression {
    public static void play(Scanner scanner, Random random) {
        String rules = "What number is missing in the progression?";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int randomProgression = random.nextInt(Engine.MAX_STEP) + Engine.MIN_STEP;
            int missingNumber = random.nextInt(Engine.LENGTH_PROGRESSION);
            int firstNumberOfProgression = random.nextInt(Engine.MIN_NUMBER);
            int temp = firstNumberOfProgression;
            String rightAnswer = "";
            String[] progression = new String[Engine.LENGTH_PROGRESSION];
            progression[0] = String.valueOf(firstNumberOfProgression);
            for (int j = 0; j < progression.length; j++) {
                if (missingNumber == j) {
                    rightAnswer = String.valueOf(temp);
                    progression[j] = "..";
                } else {
                    progression[j] = String.valueOf(temp);
                }
                temp += randomProgression;
            }
            rounds[i][0] = String.join(" ", progression);
            rounds[i][1] = rightAnswer;
        }
        Engine.run(rules, rounds, scanner);
    }

    private  Progression() { }
}
