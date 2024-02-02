package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void game() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int index = 0;
        while (index < 3) {
            int randomNumber = (int) (Math.random() * 200);
            int[] simpleNumber = {
                    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                    103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
            };
            String result = "no";
            for (var i = 0; i < simpleNumber.length - 1; i++) {
                if (randomNumber == simpleNumber[i]) {
                    result = "yes";
                    break;
                }
            }

            System.out.println("Question: " + randomNumber);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print(Engine.getAnswerTxt());
            String answerTheQuestion = correctQuestion.nextLine();
            if (answerTheQuestion.equals(result)) {
                index++;
                System.out.println(Engine.getCorrectTxt());
                if (index == 3) {
                    System.out.println(Engine.getGoodEnding());
                }
            } else {
                index = 3;
                if (answerTheQuestion.equals("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                }
                System.out.println(Engine.getBadEnding());
            }
        }
    }
}
