package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");

        Scanner name = new Scanner(System.in);
        String userName;
        System.out.print("May I have your name " );

// Здесь мог быть цикл if, который проверял по словарю наличие имени, но его нет.
        userName = name.nextLine();
        System.out.println("Hello, " + userName);
        name.close();
    }
}
