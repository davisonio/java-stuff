package src.UniversitiesGUI;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main
{
    public static ArrayList<University> uniList = new ArrayList<University>();

    public static void main(String args[]) throws IOException
    {               
        getDataFromTextFile();          //calls method

        for(University x : uniList) {    //example of enhanced for loop
            System.out.println(x);
        }
    }

    private static void getDataFromTextFile() throws IOException     //this method gets the data from the text file and puts it into uniList
    {
        FileReader fr = new FileReader("src/UniversitiesGUI/universities.txt");     //file included in same folder as project so no path required, data is separated by commas
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null ) {
            String[] values = line.split(",");  // splits lines by comma into a String array called values
            University uni = new University(Integer.parseInt(values[0]),values[1], values[2]);      // create a new University object with data from values array
            uniList.add(uni);           //add the object to the arrayList
        }
        br.close();
    }
}