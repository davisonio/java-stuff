package src.sample;

import java.util.Scanner;

public class isbnValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String isbn = "";
        int isbnTotal = 0;
        
        while (isbn.length() != 13) {
            System.out.println("Enter an ISBN number (13 digits):");
            isbn = input.nextLine();
        }
        
        for (int i = 0; i < isbn.length(); i++) {
            isbnTotal =+ isbn.charAt(i);
        }
        if ((isbnTotal % 10) == 0) {
            System.out.println("ISBN number is valid");
        } else {
            System.out.println(isbnTotal % 10);
            System.out.println("ISBN number is not valid");
        }
    }
}
