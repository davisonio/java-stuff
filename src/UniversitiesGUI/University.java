package src.UniversitiesGUI;

public class University    //public keyword means class is available to other classes in this program
{
    // These are the attributes (variables that each instance is given a set of), private meaning accessible only within the declared class itself
    private int ranking;
    private String name;
    private String country;

    //This section is the constructor
    public University(int ranking, String name, String country) 
    {        
        this.ranking = ranking;
        this.name = name;
        this.country = country;
    }

    //override the toString() method, if you don't have this when outputting you get a reference to the object
    // not the values of the object
    @Override   
    public String toString() 
    {
        return this.ranking + ", " + this.name + ", " +   this.country;
    }

    //methods - getters and setters, also known as accessor methods
    public int getRanking() { return ranking;}

    public String getName() {return name;}

    public String getCountry() {return country;}

    //this keyword highlights that the attribute is being assigned to rather than the parameter being assigned to itself
    public void setRanking(int ranking) {this.ranking = ranking;}

    public void setName(String name){this.name = name;}

    public void setCountry(String country){this.country = country;}
}