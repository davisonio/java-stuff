import java.util.Scanner;
import java.util.Arrays;

public class lotteryDraw {
    public static void generateNumbers() {
        for (int i = 0; i < 7; i++) {
            int randomNumber = (int)(Math.random() * 49 + 0);
        }
    }

    public static void winnings(int matches) {
        switch(matches) {
            case 7:
                System.out.println("You won £1,000,000!");
                break;
            case 6:
                System.out.println("You won £100,000!");
                break;
            case 5:
                System.out.println("You won £10,000!");
                break;
            case 4:
                System.out.println("You won £1,000!");
                break;
            case 3:
                System.out.println("You won £100!");
                break;
            case 2:
                System.out.println("You won £10!");
                break;
            case 1:
                System.out.println("You won £1!");
                break;
            default:
                System.out.println("You won absolutely nothing!");
                break;
            }
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
