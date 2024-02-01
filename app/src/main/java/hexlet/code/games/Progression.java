package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void game() {
        //Значения
        int index = 0;
        while (index < 3) {
            int firstNumber = (int) (Math.random() * 10);
            String progression = String.valueOf(firstNumber);
            int result = 0;
            int tempNumber = firstNumber;
            String missingProgression = " ..";
            int randomLengthProgression = 5 + ((int) (Math.random() * 5));
            int difference = 1 + ((int) (Math.random() * 10));
            int randomMissingNumber = 2 + ((int) (Math.random() * 5));
            int afterMissingNumber = randomLengthProgression - randomMissingNumber;

            //Прогрессия
            for (var i = 0; i <= randomMissingNumber; i++) {
                tempNumber = tempNumber + difference;
                progression = progression + " " + String.valueOf(tempNumber);
                result = tempNumber;
                if (i == randomMissingNumber) {
                    progression = progression + missingProgression;
                    tempNumber = tempNumber + difference;
                    result = tempNumber;
                }
            }
            for (var i = 0; i < afterMissingNumber; i++) {
                tempNumber = tempNumber + difference;
                progression = progression + " " + String.valueOf(tempNumber);
            }


            //Программа
            System.out.println("What number is missing in the progression?");
            System.out.println("Question: " + progression);
            Scanner correctQuestion = new Scanner(System.in);
            System.out.print(Engine.getAnswerTxt());
            int answerTheQuestion = correctQuestion.nextInt();
            if (answerTheQuestion == result) {
                System.out.println(Engine.getCorrectTxt());
                index++;
                if (index == 3) {
                    System.out.println(Engine.getGoodEnding());
                }
            } else {
                index = 3;
                System.out.print("'" + answerTheQuestion + "'" + " is wrong answer ;(. Correct answer was ");
                System.out.println("'" + result + "'");
                System.out.println(Engine.getBadEnding());
            }
        }
    }
}