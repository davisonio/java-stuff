package src.sample;

import java.util.*;

public class listEditor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean quit = false;

        while (!quit) {
            System.out.println("List Editor - Select a function:");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Quit");
            int function = input.nextInt();

            if (function == 1) {
                System.out.println("Value:");
                String value = input.nextLine();
                System.out.println("Position:");
                int position = input.nextInt();
                list.add(position, value);
            } else if (function == 2) {
                System.out.println("Position:");
                int position = input.nextInt();
                list.remove(position);
            } else {
                quit = true;
            }
            System.out.println("Current List:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }
}
