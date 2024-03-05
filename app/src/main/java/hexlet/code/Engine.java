package hexlet.code;


import hexlet.code.games.Calc;

public class Engine {
    static String correctTxt() {
        return "Correct!";
    }

    static String goodEnding() {
        return "Congratulations, " + Cli.userName + "!";
    }

    static String answerTxt() {
        return "You answer: ";
    }

    static String badEnding() {
        return "Let's try again, " + Cli.userName + "!";
    }

    static int endIndex() {
        final int index = 3;
        return index;
    }

    private static int[] evenLogic() {
        final int randomNumber = (int) (Math.random() * 100);
        int evenOrNo = randomNumber % 2;
        return new int[]{randomNumber, evenOrNo};
    }

//    private static String[] calcLogic() {
//        final int firstNumber = (int) (Math.random() * 20);
//        final int secondNumber = (int) (Math.random() * 20);
//        final int randomOperator = (int) (Math.random() * 3);
//        int result;
//
//        if (randomOperator == 1) {
//            result = firstNumber + secondNumber;
//            return new String[]{"Question: " + firstNumber + " + " + secondNumber, String.valueOf(result)};
//        } else if (randomOperator == 2) {
//            result = firstNumber - secondNumber;
//            return new String[]{"Question: " + firstNumber + " - " + secondNumber, String.valueOf(result)};
//        } else {
//            result = firstNumber * secondNumber;
//            return new String[]{"Question: " + firstNumber + " * " + secondNumber, String.valueOf(result)};
//        }
//    }
    static int checkGreet = 0;
    static final int greetLocker = 1;
private static String[][] calcLogic2() {
    if (checkGreet < greetLocker) {
        Cli.getUserName();
        checkGreet = 1;
        System.out.println(Calc.RULE);
    }

    final int firstNumber = (int) (Math.random() * 20);
    final int secondNumber = (int) (Math.random() * 20);
    final int randomOperator = (int) (Math.random() * 3);
    int result;
    String correct = "Correct!";
    String congratulations = "Congratulations, " + Cli.userName + "!";
    String answer = "You answer: ";
    String badEnding = "Let's try again, " + Cli.userName + "!";
    final int index = 3;

    if (randomOperator == 1) {
        result = firstNumber + secondNumber;

        return new String[][] {{"Question: " + firstNumber + " + " + secondNumber, String.valueOf(result)},
                {correct, congratulations, answer, badEnding, String.valueOf(index)}};

    } else if (randomOperator == 2) {
        result = firstNumber - secondNumber;

        return new String[][] {{"Question: " + firstNumber + " - " + secondNumber, String.valueOf(result)},
                {correct, congratulations, answer, badEnding, String.valueOf(index)}};

    } else {
        result = firstNumber * secondNumber;

        return new String[][] {{"Question: " + firstNumber + " * " + secondNumber, String.valueOf(result)},
                {correct, congratulations, answer, badEnding, String.valueOf(index)}};
    }
}


    //Геттеры
    public static String getCorrectTxt() {
        return correctTxt();
    }
    public static String getAnswerTxt() {
        return answerTxt();
    }
    public static String getGoodEnding() {
        return goodEnding();
    }
    public static String getBadEnding() {
        return badEnding();
    }
    public static int getEndIndex() {
        return  endIndex();
    }
    public static int[] getEvenLogic() {
        return evenLogic();
    }
//    public static String[] getCalcLogic() {
//        return calcLogic();
//    }
    public static String[][] getCalcLogic2() {
        return  calcLogic2();
    }
}
