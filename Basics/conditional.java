/*
 break is to break the loop
 continue is to skip that particular iteration and continue to the next
 */
/*import java.util.*;
public class conditional {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int marks=sc.nextInt();
    
    switch (marks/10) {
        case 9://90-100
            System.out.println("A");
            break;
        case 8://80-89
            System.out.println("B");
            break;
        case 7://70-79
            System.out.println("C");
            break;
        case 6://60-69
            System.out.println("D");
            break;
        case 5://50-59
            System.out.println("E");
            break;
        default:
            System.out.println("Fail");
            break;
        }
    }
}
*/

import java.util.*;
public class conditional{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid input");
            break;
        }
    }
}
