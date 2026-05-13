package hexlet.code;

public class Utils {
    public static int generateNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private Utils() { }
}
