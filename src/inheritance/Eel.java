package inheritance;

public class Eel extends Fish {
    public Eel(String name, double weight, String colour, int fins) {
        super(name, weight, colour, fins);
        System.out.println("An eel was created.");
    }

    public void slither() {
        System.out.println("An eel is slithering.");
    }
}
