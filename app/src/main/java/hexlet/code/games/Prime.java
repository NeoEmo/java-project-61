package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    public static final int START_DIVISOR = 3;

    public static void play() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.generateNumber(Engine.MIN_NUMBER, Engine.MAX_NUMBER);
            boolean isPrime = calculatePrime(number);
            String rightAnswer;
            if (isPrime) {
                rightAnswer = "yes";
            } else  {
                rightAnswer = "no";
            }
            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = rightAnswer;
        }
        Engine.run(rules, rounds, App.SCANNER);
    }

    public static boolean calculatePrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }

        for (int i = START_DIVISOR; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private Prime() { }
}
