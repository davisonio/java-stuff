import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number (1-7):");
        int number = input.nextInt();
        
        while (number < 1 & number > 7) {
            System.out.println("Number is out of range");
            System.out.println("Enter a number (1-7):");
            number = input.nextInt();
        }
        
        switch (number) {
            default:
                System.out.println("Number is invalid");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}