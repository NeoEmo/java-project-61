package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameLogic;

import java.util.Scanner;

public class EvenGame {
    public static void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int index = 0;
        while (index < Engine.getEndIndex()) {
            System.out.println("Question: " + GameLogic.getEvenLogic()[0]);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print(Engine.getAnswerTxt());
            String yesOrNo = correctQuestion.nextLine();
            if ((yesOrNo.equals("yes") && GameLogic.getEvenLogic()[0] % 2 == 0)
                || (yesOrNo.equals("no") && GameLogic.getEvenLogic()[0] % 2 == 1)) {
                index++;
                System.out.println(Engine.getCorrectTxt());
                if (index == Engine.getEndIndex()) {
                    System.out.println(Engine.getGoodEnding());
                }
            } else {
                index = Engine.getEndIndex();
                if (yesOrNo.equals("yes") && GameLogic.getEvenLogic()[0] % 2 == 1) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                }
                System.out.println(Engine.getBadEnding());
            }
        }
    }
}
