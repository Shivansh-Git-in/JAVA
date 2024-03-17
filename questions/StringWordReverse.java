public class StringWordReverse {
    public static void main(String[] args) {
        String s="Java is a programming language";
        String[] words=s.split(" ");
        String revString="";
        for(String w:words){
            String revWords="";
            for(int i=w.length()-1;i>=0;i--){
                revWords=revWords+w.charAt(i);
            }
            revString=revString+revWords+" ";
        }
        System.out.println(revString);
    }
}
