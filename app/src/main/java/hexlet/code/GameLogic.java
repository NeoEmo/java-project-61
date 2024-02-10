package hexlet.code;

public class GameLogic {
    private static int[] evenLogic() {
        final int randomNumber = (int) (Math.random() * 100);
        final  int evenOrNo = randomNumber % 2;
        return new int[]{randomNumber, evenOrNo};
    }






    public static int[] getEvenLogic() {
        return evenLogic();
    }
}
