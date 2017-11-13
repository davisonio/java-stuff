package inheritance;

public abstract class Animal {
    private String name;
    private double weight;
    private String colour;

    public Animal(String name, double weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    public abstract void die();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
