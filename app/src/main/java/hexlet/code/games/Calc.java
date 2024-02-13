package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void game() {
        System.out.println("What is the result of the expression?");
        int index = 0;
        while (index < Engine.getEndIndex()) {
            String[][] match = Engine.getCalcLogic2();
            int result = Integer.parseInt(match[0][1]);
            System.out.println(match[0][0]);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print(match[1][2]);
            int answerTheQuestion = correctQuestion.nextInt();
            if (answerTheQuestion == result) {
                System.out.println(match[1][0]);
                index++;
                if (index == Engine.getEndIndex()) {
                    System.out.println(match[1][1]);
                }
            } else {
                index = Engine.getEndIndex();
                System.out.print("'" + answerTheQuestion + "'" + " is wrong answer ;(. Correct answer was ");
                System.out.println("'" + result + "'");
                System.out.println(match[1][3]);
            }
        }
    }
}
