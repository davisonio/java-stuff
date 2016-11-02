import java.util.Scanner;
import java.util.Arrays;

public class lotteryDraw {
    public static int draw() {
        return (int)(Math.random() * 49 + 0);
    }

    public static int winnings(int matches) {
        int winnings = 0;
        switch(matches) {
            case 7:
                winnings = 1000000;
                break;
            case 6:
                winnings = 100000;
                break;
            case 5:
                winnings = 10000;
                break;
            case 4:
                winnings = 1000;
                break;
            case 3:
                winnings = 100;
                break;
            case 2:
                winnings = 10;
                break;
            case 1:
                winnings = 1;
                break;
            default:
                winnings = 0;
                break;
        }
        return winnings;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[7];
        int[] guessNumbers = new int[7];
        int matches = 0;

        for (int i = 0; i < 7; i++) {
            int guessNumber = 50;
            while (guessNumber < 0 && guessNumber > 49) {
                System.out.println("Enter guess number " + (i + 1) + ":");
                guessNumber = input.nextInt();
                guessNumbers[i] = guessNumber;
            }
        }

        generateNumbers();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (guessNumbers[i] == numbers[j]) {
                    matches += 1;
                }
            }
        }

        System.out.println("Drawn numbers were: " + Arrays.toString(drawnNumbers));
        System.out.println("Guess numbers were: " + Arrays.toString(guessNumbers));
    }
}
