/*
Sorting - arranging in ascending or decending.
*/
/*
//BubbleSort
import java.util.*;
public class sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
*/
/*
//SelectionSort
import java.util.*;
class Sorting {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};


       //selection sort
       for(int i=0; i<arr.length-1; i++) {
           int smallest = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[j] < arr[smallest]) {
                   smallest = j;
               }
           }
           //swap
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
       }


       printArray(arr);
   }
}
*/
/*
//InsertionSort
import java.util.*;
class Sorting {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};

       //insertion sort
       for(int i=1; i<arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
               while(j >= 0 && arr[j] > current) {
                   //Keep swapping
                   arr[j+1] = arr[j];
                   j--;
               }
           arr[j+1] = current;
       }
       printArray(arr);
   }
}
*/




//Comparable
/*
import java.util.*;
public class sorting {
    public static void main(String[] args){
        List<Student> ans=new ArrayList<>();
        ans.add(new Student("rahul",20));
        ans.add(new Student("rohan",18));
        ans.add(new Student("arun",24));

        Collections.sort(ans);
        for(Student s : ans){
            System.out.println(s.name+s.age);
        }
    }
}
class Student implements Comparable<Student>{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }else{
            return -1;
        }
    }
}
*/

//Comparator

import java.util.*;
public class sorting {
    public static void main(String[] args){
        List<Student> ans=new ArrayList<>();
        ans.add(new Student("rahul",20));
        ans.add(new Student("rohan",18));
        ans.add(new Student("arun",24));

        Comparator<Student> con=new Comparator<Student>() {
            public int compare(Student i,Student j){
                if(i.age > j.age){
                    return 1;
                }else{
                    return -1;
                }
            }
        } ;
        Collections.sort(ans,con);
        for(Student s : ans){
            System.out.println(s.name+s.age);
        }
    }
}
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}