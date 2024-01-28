package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;


public class EvenGame {
    public static void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int index = 0;
        while (index < 3) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print(Engine.getAnswerTxt());
            String yesOrNo = correctQuestion.nextLine();
            if ((yesOrNo.equals("yes") && randomNumber % 2 == 0) || (yesOrNo.equals("no") && randomNumber % 2 == 1)) {
                index++;
                System.out.println(Engine.getCorrectTxt());
                if (index == 3) {
                    System.out.println(Engine.getGoodEnding());
                }
            } else {
                index = 3;
                if (yesOrNo.equals("yes") && randomNumber % 2 == 1) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                }
                System.out.println(Engine.getBadEnding());
            }
        }
    }
}
