package src.sample;

import java.util.Scanner;

public class searchProcedures{
    public static void linearSearch(int[] array, int search, Boolean found){
        int i = 0;
        while (found == false) {
            i = i + 1;
            if (array[i] == search) {
                found = true;
                int foundIndex = array[i];
            }
        }
    }
    public static void binarySearch(int[] array, int search, Boolean found){
        int start = 0;
        int end = array.length -1;
        while (found == false && start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == search) {
                found = true;
                int foundIndex = array[mid];
            } else if (array[mid] > search) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    public static void main(String[] args){
        Boolean found = false;
        
        Scanner input = new Scanner(System.in);
        
        int[] array = {12, 39, 45, 63, 89};
        int search = 63;
        
        System.out.println("What type of search?");
        String type = input.nextLine();
        
        if (type == "linear") {
            linearSearch(array, search, found);
        } else if (type == "binary") {
            binarySearch(array, search, found);
        }
        
        if (found) {
            System.out.println("Found");
        }
    }
}