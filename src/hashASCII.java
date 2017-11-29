public class hashASCII {
    public static void main(String[] args){
        String input = "Hello world";
        String hash = "";
        for(int i = 0 ; i < input.length(); i++) {
            hash += (int)input.charAt(i);
        }
        System.out.println(hash);
    }
}
