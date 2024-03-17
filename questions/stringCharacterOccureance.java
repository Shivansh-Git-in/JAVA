import java.util.*;
public class stringCharacterOccureance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type the string");
        String str=sc.nextLine();
        int length=str.length();
        System.out.println("Type the character you want to count");
        String x=sc.nextLine();
        int lengthAfterRemovingm=str.replace(x,"").length();
        int noOfOccurance=length-lengthAfterRemovingm;
        System.out.println("No of "+x+" present in the String are: "+noOfOccurance);
    }
}
