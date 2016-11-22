import java.util.Scanner;
import java.util.Arrays;

public class arrays2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] values = new int[10];
        
        for (int i = 0; i < 10; i++){
            System.out.println("Enter value:");
            int value = input.nextInt();
            values[i] = value;
        }
        
        System.out.println("Continue?");
        Boolean doContinue = input.nextBoolean();
        
        if (doContinue) {
            System.out.println(Arrays.toString(values));
        }
    }
}
