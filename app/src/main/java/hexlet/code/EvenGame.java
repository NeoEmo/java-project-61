package hexlet.code;

import java.util.Scanner;

public class EvenGame {
    public static void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int index = 0;
        while(index < 3) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print("You answer: ");
            String yesOrNo = correctQuestion.nextLine();
            if ((yesOrNo.equals("yes") && randomNumber % 2 == 0) || (yesOrNo.equals("no") && randomNumber % 2 == 1)) {
                index++;
                System.out.println("Correct!");
            } else {
                index = 3;
                System.out.println("Congratulations! You Fool!");
            }
        }
    }
}
