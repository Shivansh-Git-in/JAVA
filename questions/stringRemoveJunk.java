public class stringRemoveJunk {
    public static void main(String[] args) {
        String s="hello java 123456789";
        System.out.println(s);
        s=s.replaceAll("[^a-zA-Z\\s]", "");
        System.out.println(s);
    }    
}
