package hexlet.code;

import java.util.Scanner;


class Cli {
    public static String userName;

    
    public static void getByName() {
        Scanner name = new Scanner(System.in);
        System.out.print("May I have your name ");
        // Здесь мог быть цикл if, который проверял бы наличие имени в словаре имён, но его нет.
        userName = name.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}