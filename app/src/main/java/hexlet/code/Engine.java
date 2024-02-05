package hexlet.code;

import static hexlet.code.Cli.userName;

public class Engine {
    static String correctTxt() {
        return "Correct!";
    }

    static String goodEnding() {
        return "Congratulations, " + userName + "!";
    }

    static String answerTxt() {
        return "You answer: ";
    }

    static String badEnding() {
        return "Let's try again, " + userName + "!";
    }

    static int endIndex() { return 3;}

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
    public static int getEndIndex() {return  endIndex();}
}
