package inheritance;

public abstract class Fish extends Animal {

    private int fins;

    public Fish(String name, double weight, String colour, int fins) {
        super(name, weight, colour);
        this.fins = fins;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public void die() {
        System.out.println("A fish has died.");
    }
}
