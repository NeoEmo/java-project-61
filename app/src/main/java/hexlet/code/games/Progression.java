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
            String[] round = generateRound(start, step, lengthProgression);
            rounds[i][0] = round[0];
            rounds[i][1] = round[1];
        }
        Engine.run(rules, rounds);
    }

    private static String[] generateRound(int  start, int step, int lengthProgression) {
        String[] progression = new String[lengthProgression];
        int missingPosition = Utils.generateNumber(MIN_START, lengthProgression - 1);
        int current = start;
        String rightAnswer = "";
        for (int i = 0; i < lengthProgression; i++) {
            if (i == missingPosition) {
                rightAnswer = String.valueOf(current);
                progression[i] = "..";
            } else {
                progression[i] = String.valueOf(current);
            }
            current += step;
        }
        String question = String.join(" ", progression);
        return new String[]{question, rightAnswer};
    }

    private  Progression() { }
}
