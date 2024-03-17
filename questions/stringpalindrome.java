import java.util.*;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        String rev="";
        for(int i=txt.length()-1;i>=0;i--){
            rev=rev+txt.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(txt)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
