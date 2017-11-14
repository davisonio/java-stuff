package inheritance;

public class Shark extends Fish {
    public Shark(String name, double weight, String colour, int fins) {
        super(name, weight, colour, fins);
        System.out.println("A shark was created.");
    }
}
