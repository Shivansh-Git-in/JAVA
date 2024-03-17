public class stringRemoveWhite {
    public static void main(String[] args) {
        String s="Hello  this  is  java  language";
        System.out.println(s);
        s=s.replaceAll("\\s", "");
        System.out.println(s);
    }
}
