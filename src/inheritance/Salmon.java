package inheritance;

public class Salmon extends Fish {
    public Salmon(String name, double weight, String colour, int fins) {
        super(name, weight, colour, fins);
        System.out.println("A salmon was created.");
    }
}
