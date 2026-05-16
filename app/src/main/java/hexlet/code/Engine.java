package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(String rules, String[][] rounds) {
        Cli.greet();
        System.out.println(rules);
        Scanner sc = new Scanner(System.in);
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
                System.out.println("Let's try again, " + Cli.userName + "!");
                sc.close();
            }
        }
        if(count == ROUNDS_COUNT) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
        sc.close();
    }

    private Engine() { }
}
