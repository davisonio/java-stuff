import java.util.Scanner;

public class Quadruple{
    public static int quadruple(int number){
        return (number * 4);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int number = input.nextInt();
        
        System.out.println(quadruple(number));
    }
}