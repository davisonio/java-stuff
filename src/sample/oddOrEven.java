package src.sample;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        String[][] array = new String[5][2];
        String line;

        if (number % 2 != 0) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
}
