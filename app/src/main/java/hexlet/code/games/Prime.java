package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 10;

    public static void play() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            boolean isPrime = isPrime(number);
            String rightAnswer = isPrime ? "yes" : "no";
            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = rightAnswer;
        }
        Engine.run(rules, rounds);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }


        for (int divisor = 3; divisor <= Math.sqrt(number); divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    private Prime() { }
}
