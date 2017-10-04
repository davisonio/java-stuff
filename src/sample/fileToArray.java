package src.sample;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class fileToArray {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("fileToArray.txt");
        BufferedReader br = new BufferedReader(fr);

        String[][] array = new String[5][2];
        String line;

        int i = 0;
        while ((line = br.readLine()) != null) {
            array[i][0] = line.substring(0, 5);
            array[i][1]= line.substring(5);
            i = i + 1;
        }

        br.close();

        System.out.println(Arrays.deepToString(array));
    }
}
