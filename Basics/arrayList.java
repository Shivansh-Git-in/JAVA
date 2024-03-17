/*
arraylist is a dynamic array
array is of a fixed size, so  arraylist is used we can extend and shrink
part of collection list
public static List <Integer> count(int[] arr){
*/

import java.util.*;
public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        
        //Insertion - .add(element),add(index,element) - add element
        list.add(20);
        list.add(30);
        list.add(0,60);
        System.out.println(list);
        list.add(3, 25);
        System.out.println(list);

        //Remove - .remove(element),remove(index,element) - remove element;
        list.remove(1);
        System.out.println(list);

        //get - get() element at the input value
        System.out.println(list.get(1));

        //contains - .contains(), boolean,checks if element is present in arraylist, use it with condition
        System.out.println(list.contains(25));
        System.out.println(list.contains(56));
        if(list.contains(60)){
            System.out.println("Element is present");
        }

        //length - .size()
        System.out.println(list.size());

        //isEmpty - .isEmpty(), boolean, list is empty or not.
        System.out.println(list.isEmpty());

        //replace - .set(index,element), replaces a element
        list.set(0,400);
        System.out.println(list);

        //clear - .clear(), clear the list
        list.clear();
        System.out.println(list);
        
        
        System.out.println(list.size());
        System.out.println(list.isEmpty());

    }
}

/*
//add elements divisible ny 3
import java.util.*;
public class arrayList{
    public static List <Integer> count(int[] arr){
        List<Integer> L=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                L.add(arr[i]);
            }
        }
        return L;
    }
    public static void main(String[] args){
        int[] arr={2,3,55,66,87,89,45,64};
        System.out.println(count(arr));
    }
}
*/