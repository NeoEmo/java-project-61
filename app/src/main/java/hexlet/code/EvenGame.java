package hexlet.code;

import java.util.Scanner;

public class EvenGame {
    public static void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int randomNumber = (int) (Math.random() * 100);
        System.out.println("Question: " + randomNumber);
        Scanner correctQuestion = new Scanner(System.in);
        System.out.println("You answer: ");
        correctQuestion.nextLine();
        correctQuestion.close();
    }
}
