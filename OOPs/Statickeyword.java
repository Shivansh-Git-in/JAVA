//Static
/*
class abc{
    public void show(){
        System.out.println(10);
    }
}
public class Statickeyword {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.show();
    }
}
*/
class abc{
    public static void show(){
        System.out.println(10);
    }
}
public class Statickeyword {
    public static void main(String[] args) {
        abc.show();
    }
}