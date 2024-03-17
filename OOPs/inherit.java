/*
Inheritance - 
child inherit behaviour of parent
*/
class dad{
    int money = 500000;
    public void drivebmw(){
        System.out.println("Drive bmw");
    }
}
class kid1 extends dad{
    public void drivewagonr(){
        System.out.println("Drive wagonr");
    }
}
class kid2 extends dad{
    public void drivemaruti(){
        System.out.println("Drive maruti");
    }
}
class kid3 extends kid2{
    public void drivekia(){
        System.out.println("Drive kia");
    }
}
public class inherit {
    public static void main(String[] args){
        dad ramesh=new dad();
        kid1 rocky=new kid1();
        kid2 rahul=new kid2();
        kid3 rohan=new kid3();
        ramesh.drivebmw();
        rocky.drivewagonr();
        rahul.drivemaruti();
        rohan.drivekia();

        rocky.drivebmw(); //inherit parent class 
        rahul.drivebmw();
        rohan.drivebmw(); //kid2 can drive bmw and kid3 extend kid2 so kid 3 also drive bmw
        rohan.drivemaruti();
        System.out.println(rocky.money);
        System.out.println(rahul.money);
        System.out.println(rohan.money);

    }
}
