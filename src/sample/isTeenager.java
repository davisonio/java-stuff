package src.sample;

import java.util.Scanner;

public class isTeenager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How old are you");
        int age = input.nextInt();
        
        if (age > 12 & age < 20) {
            System.out.println("You are a teenager. Lucky you!");
        } else if (age >= 20) {
            System.out.println("You are older than a teenager. Sorry!");
        } else  {
            System.out.println("You are younger than a teenager. Sorry!");
        }
    }
}