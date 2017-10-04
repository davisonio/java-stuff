package src.sample;

import java.util.Scanner;

public class newStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello new students!");
        
        System.out.println("How would you describe yourself?");
        String description = input.nextLine();
        
        System.out.println("How tall are you in metres?");
        float height = input.nextFloat();
        int heightCm = (int) height * 100;
        System.out.println("Ok so that's " + heightCm + "cm");
        
        System.out.println("You like the course so far?");
        boolean likesCourse = input.nextBoolean();
        
        System.out.println("How old are you?");
        int age = input.nextInt();
    }
}