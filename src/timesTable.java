import java.util.Scanner;

public class timesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number (1-12):");
        int number = input.nextInt();
        
        if (number >= 1 & number <= 12) {
            for (int i = 1; i <= 12; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        } else {
            System.out.println("Number is out of range");
        }
        
    }
}