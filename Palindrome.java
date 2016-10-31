import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter text:");
        String text = input.nextLine();
        
        String reversedText = "";
        
        for (int i = (text.length() - 1); i >= 0; i--) {
            reversedText = reversedText + text.charAt(i);
        }
        
        if (text.equalsIgnoreCase(reversedText)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }
    }
}
