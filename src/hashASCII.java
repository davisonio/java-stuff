public class hashASCII {
    public static void main(String[] args){
        String input = "Hello world";
        StringBuilder hash = new StringBuilder();
        for(int i = 0 ; i < input.length(); i++) {
            hash.append((int) input.charAt(i));
        }
        System.out.println(hash);
    }
}
