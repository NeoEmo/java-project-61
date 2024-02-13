package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void game() {
        System.out.println("What is the result of the expression?");
        int index = 0;
        while (index < Engine.getEndIndex()) {
            int result = Integer.parseInt(Engine.getCalcLogic()[1]);
            String match = Engine.getCalcLogic()[0];
            System.out.println(match);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print(Engine.getAnswerTxt());
            int answerTheQuestion = correctQuestion.nextInt();
            if (answerTheQuestion == result) {
                System.out.println(Engine.getCorrectTxt());
                index++;
                if (index == Engine.getEndIndex()) {
                    System.out.println(Engine.getGoodEnding());
                }
            } else {
                index = Engine.getEndIndex();
                System.out.print("'" + answerTheQuestion + "'" + " is wrong answer ;(. Correct answer was ");
                System.out.println("'" + result + "'");
                System.out.println(Engine.getBadEnding());
            }
        }
    }
}
