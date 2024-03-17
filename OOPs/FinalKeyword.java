//final

//final variable
/*
public class FinalKeyword {
    public static void main(String[] args){
        final int i=5;
        //i=i+5;  cant increase vallue of i as 5 is final value of i
        System.out.println(i);
    }
}
*/

//final method

class account{
    void number(){
        System.out.println("123456789");
    }
    final void atm(){
        System.out.println("1234");
    }
}
class theif extends account{
    @Override
    void number(){
        System.out.println("987654321");
    }
    @Override
    void atm(){                        //can't be overridden as atm method is final
        System.out.println("4321");
    }
}
class FinalKeyword{
    public static void main(String[] args) {
        theif t=new theif();
        t.number();
        t.atm();
    }
}