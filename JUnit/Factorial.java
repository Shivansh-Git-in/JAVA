package junittest;

public class Factorial {
public int fact(int num) {
 int fact=1;
while(num!=0) {
 fact=fact*num;
 num--;
} 
 return fact;
}
}
