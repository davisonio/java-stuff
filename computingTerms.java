import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class computingTerms {
    public static void searchByTerm() throws IOException {
        // Setup
        Scanner input = new Scanner(System.in);
        FileReader fr = new FileReader("computingTerms.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        System.out.println("Enter term:");
        String term = input.nextLine();
        int i = 0;
        Boolean found = false;
        while ((line = br.readLine()) != null) {
            // System.out.println(line);
            if (line.contains(term)) {
                found = true;
                System.out.println("Found!");
                System.out.println(line);
            }
            i = i + 1;
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }
    public static void searchDescriptionsForKeyword() throws IOException {
        // Setup
        Scanner input = new Scanner(System.in);
        FileReader fr = new FileReader("computingTerms.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        System.out.println("Enter keyword:");
        String keyword = input.nextLine();
        int i = 0;
        Boolean found = false;
        while ((line = br.readLine()) != null) {
            if (line.contains(keyword)) {
                found = true;
                System.out.println("Found!");
                System.out.println(line);
            }
            i = i + 1;
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }
    public static void main(String[] args) throws IOException {
        // Setup
        Scanner input = new Scanner(System.in);
        FileReader fr = new FileReader("computingTerms.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        System.out.println("1. Search for a term");
        System.out.println("2. Search for a keyword in the descriptions");
        System.out.println("3. End");
        System.out.println("Enter choice:");
        int choice = input.nextInt();

        if (choice == 1) {
            searchByTerm();
        } else if (choice == 2) {
            searchDescriptionsForKeyword();
        }

        br.close();
    }
}
