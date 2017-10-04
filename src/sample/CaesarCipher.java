package src.sample;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter plain text:");
        String plainText = input.nextLine();
        
        System.out.println("Enter offset:");
        int offset = input.nextInt();
        
        for (int i = 0; i < plainText.length(); i++) {
            System.out.print((char)(plainText.charAt(i)+ offset));
        }
    }
}
