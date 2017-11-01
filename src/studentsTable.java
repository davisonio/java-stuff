import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class studentsTable{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("U:\\Desktop_2k\\data.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        String[][] myStudents = new String[][]{
            {"Sophie", "Stanfield", "Class 5"},
            {"James", "Kitson", "Class 5"},
            {"Zoe", "Gaskill", "Class 1"},
            {"Paul", "Johns", "Class 1"},
            {"Freya", "Moore", "Class 5"}
        };

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 2; column++) {
                bw.write(myStudents[row][column]);
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.close();
    }
}
