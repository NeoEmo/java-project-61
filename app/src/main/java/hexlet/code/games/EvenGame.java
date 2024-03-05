package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class EvenGame {
    private final static int MAX_ROUNDS = 3;
    public final static String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static int ROUND = 0;
    public static void game() {
        while (ROUND < MAX_ROUNDS) {
            String[][] round = Engine.getEvenLogic();
            int number = Integer.parseInt(round[0][0]);
            System.out.println("Question: " + round[0][0]);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print(round[1][2]);
            String yesOrNo = correctQuestion.nextLine();
            if ((yesOrNo.equals("yes") && number % 2 == 0)
                || (yesOrNo.equals("no") && number % 2 == 1)) {
                ROUND++;
                System.out.println(Engine.getCorrectTxt());
                if (ROUND == MAX_ROUNDS) {
                    System.out.println(Engine.getGoodEnding());
                }
            } else {
                ROUND = MAX_ROUNDS;
                if (yesOrNo.equals("yes") && number % 2 == 1) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                }
                System.out.println(Engine.getBadEnding());
            }
        }
    }
}
