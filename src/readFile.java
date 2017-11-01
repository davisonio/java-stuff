import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class readFile{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("U:\\Desktop_2k\\readFile.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        do {
            System.out.println(line);
        } while ((line = br.readLine()) != null);

        br.close();
    }
}
