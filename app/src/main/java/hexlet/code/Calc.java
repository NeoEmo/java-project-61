package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.userName;

public class Calc {
    public static void game() {
        System.out.println("What is the result of the expression?");
        int index = 0;
        while (index < 3) {
            //Создание рандомных значений до 20-ти и рандомного оператора
            int firstNumber = (int) (Math.random() * 20);
            int secondNumber = (int) (Math.random() * 20);
            char[] operations = {'+', '-', '*'};
            int randomOperator = (int) (Math.random() * 3);
            int result;

            //Логика определения результата
            if (operations[randomOperator] == '+') {
                result = firstNumber + secondNumber;
            } else if (operations[randomOperator] == '-') {
                result = firstNumber - secondNumber;
            } else {
                result = firstNumber * secondNumber;
            }

            //Сама программа
            System.out.println("Question: " + firstNumber + operations[randomOperator] + secondNumber);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print("You answer: ");
            int answerTheQuestion = correctQuestion.nextInt();
            if (answerTheQuestion == result) {
                System.out.println("Correct!");
                index++;
                if (index == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                index = 3;
                System.out.print("'" + answerTheQuestion + "'" + " is wrong answer ;(. Correct answer was ");
                System.out.println("'" + result + "'");
                System.out.println("Let's try again, " + userName + "!");
            }

        /*Интерфейс?
        Scanner correctQuestion = new Scanner(System.in);
        System.out.print("You answer: ");
        String answerTheQuestion = correctQuestion.nextLine();
        index++;*/
        }
    }
}
