/*
combination of character
non primitive,userdefined
immutable(in java) - cannot be changed.if changed, new string object is created
substring is a continuous part of string
*/

public class strings {
    public static void main(String[] args){

        //ascii
        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'A');
        System.out.println((int)'Z');

        //concatenation
        String s1="Hello";
        String s2="World";
        System.out.println(s1.concat(s2));
        System.out.println(s2.concat(s1));

        //length
        System.out.println(s1.length());

        //charat
        System.out.println(s1.charAt(1));

        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }

        //equals
        System.out.println(s1.equals("Hello"));
        System.out.println(s1.equals(s2));

        //replace
        String s3=s1.replace('l','p');
        String s4=s3.replace('e','i');
        System.out.println(s4);

        //contains
        System.out.println(s1.contains("ell"));
        System.out.println(s2.contains("el"));

        //indexof
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.lastIndexOf("e"));

        //substring
        String s5="i love dogs";
        System.out.println(s5.substring(3,10));

        //uppercase
        System.out.println(s5.toUpperCase());

        //lowercase
        String s6="JAVA IS A PROGRAMMING LANGUAGE";
        System.out.println(s6.toLowerCase());

        //isempty
        System.out.println(s6.isEmpty());

        //comparesTo
        System.out.println(s5.compareTo(s1));        
    }
}

/*
//no of vowels in the entered string
import java.util.*;
public class strings{
    public static void main(String[] args){
        int vowels=0;
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| 
            ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
*/
/*
//check string palindrome
import java.util.*;
public class strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reverseStr="";
        for(int i=str.length()-1;i>=0;i--){
            reverseStr=reverseStr+str.charAt(i);
        }
        if(str.equals(reverseStr)){
                System.out.println("Palindrome string");
            }else{
                System.out.println("Not a palidrome string");
            }
    }
}
*/