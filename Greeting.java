import java.util.Scanner;

public class Greeting{
    public static String greeting(String name, String location){
        return "Hello " + name + " from " + location;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name:");
        String name = input.nextLine();
        
        System.out.println("Enter location:");
        String location = input.nextLine();
        
        System.out.println(greeting(name, location));
    }
}
