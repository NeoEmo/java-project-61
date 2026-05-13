package hexlet.code;

public final class Cli {
    public static String userName;

    private Cli() { }

    public static void greet() {
        String greet = """
                Welcome to the Brain Games!
                May I have your name?\s""";

        System.out.print(greet);
        String name = App.SCANNER.nextLine();
        userName = name;
        System.out.println("Hello, " + name + "!");
    }
}
