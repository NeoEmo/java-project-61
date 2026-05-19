package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public final class Progression {
    public static final int MIN_START = 0;
    public static final int MAX_START = 10;
    public static final int MAX_STEP = 50;
    public static final int LENGTH_PROGRESSION = 10;
    public static final int MIN_LENGTH_PROGRESSION = 5;

    public static void play() {
        String rules = "What number is missing in the progression?";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = Utils.generateNumber(MIN_START, MAX_START);
            int step = Utils.generateNumber(MIN_START, MAX_STEP);
            int lengthProgression = Utils.generateNumber(MIN_LENGTH_PROGRESSION, LENGTH_PROGRESSION);
            int[] progression = generateProgression(start, step, lengthProgression);
            int missingPosition = Utils.generateNumber(MIN_START, lengthProgression - 1);
            int rightAnswer = progression[missingPosition];

            String[] parts = new String[progression.length];
            for (int second = 0; second < progression.length; second++) {
                parts[second] = (second == missingPosition) ? ".." : String.valueOf(progression[second]);
            }
            String question = String.join(" ", parts);
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(rightAnswer);
        }
        Engine.run(rules, rounds);
    }

    private static int[] generateProgression(int start, int step, int lengthProgression) {
        int[] progression = new int[lengthProgression];
        for (int i = 0; i < lengthProgression; i++) {
            progression[i] = start + i  * step;
        }
        return progression;
    }

    private  Progression() { }
}
