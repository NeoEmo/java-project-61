package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String myName() {
        Scanner name = new Scanner(System.in);
        System.out.print("May I have your name ");
        String userName = name.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static String getUserName() {
        return myName();
    }
}


// Рабочий Cli

//public class Cli {
//    private static String userName;
//
//    public static void getByName() {
//        Scanner name = new Scanner(System.in);
//        System.out.print("May I have your name ");
//        // Здесь мог быть цикл if, который проверял бы наличие имени в словаре имён, но его нет.
//        userName = name.nextLine();
//        System.out.println("Hello, " + userName + "!");
//    }
//
//    //Геттеры
//    public static String getUserName() {
//        return userName;
//    }
//}

// Тут некролог моего в усмерть убитого мозга пытавшегося сделать "нормальным" этот кусок кода, но в 2:32 это тщетно


//public class Cli2 {
//    private static String sayMyName(){
//        String userName;
//        Scanner name = new Scanner(System.in);
//        System.out.print("May I have your name ");
//        userName = name.nextLine();
//        System.out.println("Hello, " + userName + "!");
//        return new String();
//    }
//}
//
//public class Cli {
//
//    private static String getByName() {
//        String userName;
//        Scanner name = new Scanner(System.in);
//        System.out.print("May I have your name ");
//        // Здесь мог быть цикл if, который проверял бы наличие имени в словаре имён, но его нет.
//        userName = name.nextLine();
//        System.out.println("Hello, " + userName + "!");
//        return userName;
//    }
//
//    //Геттеры
//    public static String getUserName(String userName) {
//        return userName;
//    }
//}
