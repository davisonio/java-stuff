import java.util.Scanner;

public class discountRates {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter quantity:");
            int quantity = input.nextInt();
            
            System.out.println("Enter unit price:");
            float unitPrice = input.nextFloat();
            
            float totalPrice;
            
            if (quantity < 100) {
                totalPrice = unitPrice;
            } else if (quantity >= 100 & quantity <= 120) {
                totalPrice = unitPrice - (unitPrice / 100) * 10;
            } else {
                totalPrice = unitPrice - (unitPrice / 100) * 15;
            }
            System.out.println("Total price is " + totalPrice);
        }
    }
}