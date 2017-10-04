package src.sample;

import java.util.Scanner;
import java.util.Arrays;

public class arrays1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[] names = new String[7];
        
        for (int i = 0; i < 7; i++){
            System.out.println("Enter name:");
            String name = input.nextLine();
            names[i] = name;
        }
        
        System.out.println(Arrays.toString(names));
    }
}
