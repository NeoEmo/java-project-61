package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void game() {
        //Значения
        int index = 0;
        while (index < Engine.getEndIndex()) {
            final int firstNumber = (int) (Math.random() * 100);
            final int secondNumber = (int) (Math.random() * 100);
            final int divider = 50;
            int result = 1;
            int tmpResult;
            final int[] simpleNumber = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
            };


            /* Логика определения результата
            Есть ещё вариант делать через "Алгоритм Евклида", но:
            1)Я мало знаком с ним
            2)Видел что на больших числах он становится неточным
            Логика простых чисел */
            for (var i = 0; i < simpleNumber.length; i++) {
                if (firstNumber == simpleNumber[i] && secondNumber % simpleNumber[i] == 0) {
                    tmpResult = simpleNumber[i];
                    if (tmpResult > result) {
                        result = tmpResult;
                    }
                } else if (secondNumber == simpleNumber[i] && firstNumber % simpleNumber[i] == 0) {
                    tmpResult = simpleNumber[i];
                    if (tmpResult > result) {
                        result = tmpResult;
                    }
                }
            }


            /*Лотерейные варианты (1-ый if банальное сравнение 2-ух чисел,
                                    2-ой и 3-ий if - деление одного числа на второе)
             */
            if (firstNumber == secondNumber) {
                tmpResult = firstNumber;
                if (tmpResult > result) {
                    result = tmpResult;
                }
            } else if (firstNumber % secondNumber == 0) {
                tmpResult = secondNumber;
                if (tmpResult > result) {
                    result = tmpResult;
                }
            } else if (secondNumber % firstNumber == 0) {
                tmpResult = firstNumber;
                if (tmpResult > result) {
                    result = tmpResult;
                }
            }


            //Логика шанса, что у числа есть популярный делитель (2 = 50%, 3 = 33% 4 = 25% итд до 50, т.к. 51 = 1%)
            var i = 2;
            while (i < divider) {
                if (firstNumber % i == 0 && secondNumber % i == 0) {
                    tmpResult = i;
                    if (tmpResult > result) {
                        result = tmpResult;
                    }
                }
                i++;
            }


            //Программа
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + firstNumber + " " + secondNumber);
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
