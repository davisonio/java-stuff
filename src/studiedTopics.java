import java.util.*;

public class studiedTopics {
    public static void main(String[] args){
        ArrayList<String> studiedTopics = new ArrayList<>();

        studiedTopics.add("Systems - I/O devices & storage");
        studiedTopics.add("Programming - Introduction");
        studiedTopics.add("Connectivity - HTML, CSS, etc.");
        studiedTopics.add("Society - Legislation");
        studiedTopics.add("Connectivity - Types of network");
        studiedTopics.add("Programming - String handling");
        studiedTopics.add("Programming - File handling");
        studiedTopics.add("Computation - Arrays & their uses");
        studiedTopics.add("Processing - Types of processor");
        studiedTopics.add("Processing - Internal workings");
        studiedTopics.add("Data - Binary integers and hex numbers");
        studiedTopics.add("Data - Logic gates and flow charts");

        System.out.println("Topics studied so far, sorted by strength:");
        for (int i = 0; i < studiedTopics.size(); i++) {
            System.out.println(studiedTopics.get(i));
        }
    }
}
