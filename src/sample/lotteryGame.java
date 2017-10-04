package src.sample;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class lotteryGame {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lotteryGame.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        Boolean[] lotteryNumbers = new Boolean[6];
        int numberOfSelectedBalls = 0;
        int winningBall;
        
        while (numberOfSelectedBalls != 6) {
            do {
                winningBall = (int)(Math.random() * 50 + 0);
            } while (winningBall == 0);
            if (lotteryNumbers[winningBall] == false) {
                lotteryNumbers[winningBall] = true;
                numberOfSelectedBalls = numberOfSelectedBalls + 1;
            }
        }

        for (int i = 1; i < 50; i++) {
            if (lotteryNumbers[i] == true) {
                bw.write(i);
                bw.write(" ");
            }
        }
        bw.newLine();
        bw.close();
    }
}
