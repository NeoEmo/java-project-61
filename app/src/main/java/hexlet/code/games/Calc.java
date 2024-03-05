package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    private final static String RULE = "What is the result of the expression?";
    private final static int MAX_ROUNDS = Integer.parseInt(Engine.getCalcLogic2()[1][4]);
    public static void game() {
        System.out.println(RULE);
        for (var i = 0; i < MAX_ROUNDS; i++) {
            String[][] round = Engine.getCalcLogic2();
            int result = Integer.parseInt(round[0][1]);
            System.out.println(round[0][0]);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print(round[1][2]);
            int answerTheQuestion = correctQuestion.nextInt();
            if (answerTheQuestion == result) {
                System.out.println(round[1][0]);
                // Колдун ******
                if (i == MAX_ROUNDS - 1) {
                    System.out.println(round[1][1]);
                }
            } else {
                i = MAX_ROUNDS;
                System.out.print("'" + answerTheQuestion + "'" + " is wrong answer ;(. Correct answer was ");
                System.out.println("'" + result + "'");
                System.out.println(round[1][3]);
            }
        }

        /*int index = 0;
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
        }*/
    }
}
