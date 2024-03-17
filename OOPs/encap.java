/*
Encapsulation - 
The process of grouping together data items and all the corresponding methods 
Data hiding with help of private
*/
class bank{
    private int balance = 5000;//hiding
    public int getbalance(){ //getter method fetch and return value
        return balance;
    }
    public void setbalance(int amount){ //setter, add,doesn't require return type
        balance=balance+amount;
        System.out.println("Amount "+amount+" has been credited");
    }
}
public class encap {
    public static void main(String[] args){
        bank sbi=new bank();

        System.out.println(sbi.getbalance());
        sbi.setbalance(1500);
        System.out.println(sbi.getbalance());
    }
}
