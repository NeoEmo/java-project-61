package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static String userName;

    public static void run(String rules, String[][] rounds) {
        String greet = """
                Welcome to the Brain Games!
                May I have your name?\s""";
        Scanner sc = new Scanner(System.in);
        System.out.print(greet);
        String name = sc.nextLine();
        userName = name;
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
        int count = 0;
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + rounds[i][0]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (answer.equals(rounds[i][1])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rounds[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                sc.close();
                break;
            }
        }
        if (count == ROUNDS_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        }
        sc.close();
    }

    public String getUserName() {
        return userName;
    }

    private Engine() { }
}
