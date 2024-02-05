package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void game() {
        System.out.println("What is the result of the expression?");
        int index = 0;
        while (index < Engine.getEndIndex()) {
            //Создание рандомных значений до 20-ти и рандомного оператора
            final int firstNumber = (int) (Math.random() * 20);
            final int secondNumber = (int) (Math.random() * 20);
            char[] operations = {'+', '-', '*'};
            final int randomOperator = (int) (Math.random() * 3);
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
            System.out.println("Question: " + firstNumber + " " + operations[randomOperator] + " " + secondNumber);
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
