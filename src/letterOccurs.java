public class letterOccurs {
    public static void main(String[] args) {
        String applecake = "Java apple cake";

        int results = applecake.length() - applecake.replace("a", "").length();

        System.out.println(results);
    }
}
