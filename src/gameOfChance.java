import java.util.Scanner;

public class gameOfChance {
    public static double winnings(int guessNumber, double betAmount) {
        if ((guessNumber % 2) == 0) {
            // Even
            return (betAmount * 2);
        }
        
        if ((guessNumber % 10) == 0) {
            // Multiple of 10
            return (betAmount * 3);
        }
        
        for(int i = 2; i < guessNumber; i++) {
            if (guessNumber % i != 0) {
                // Prime number
                return (betAmount * 5);
            }
        }
        
        if (guessNumber < 5) {
            // Less than 5
            return (betAmount * 2);
        }
        return 0.00;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter guess number [0-30]:");
        int guessNumber = input.nextInt();
        
        System.out.println("Enter bet amount (£):");
        double betAmount = input.nextDouble();
        
        int randomNumber = (int)(Math.random() * 30 + 0);
        
        if (guessNumber == randomNumber) {
            System.out.println("You won £" + winnings(guessNumber, betAmount));
        } else {
            System.out.println("You didn't win anything");
        }
    }
}