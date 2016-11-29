import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class tablePeople{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter fw = new FileWriter("U:\\Desktop_2k\\tablePeople.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        // Get names
        System.out.println("Enter name 1:");
        String name1 = input.nextLine();
        System.out.println("Enter name 2:");
        String name2 = input.nextLine();
        System.out.println("Enter name 3:");
        String name3 = input.nextLine();
        System.out.println("Enter name 4:");
        String name4 = input.nextLine();

        // Write names to file
        bw.write(name1);
        bw.newLine();
        bw.write(name2);
        bw.newLine();
        bw.write(name3);
        bw.newLine();
        bw.write(name4);
        bw.close();
    }
}
