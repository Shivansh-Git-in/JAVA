/*
Constructor name will always be same as class name
Constructor is used to initialize object, dont have return type

Types: default - dont have to define , parameterized - define parameter in brackets , non-parameterized


*/
class pen {
    //instance varible
    String colour; 
    int price;
    String type;
    /*
        //constructor (non-parameterized)
    pen(){
        this.colour = "Blue"; 
        this.price = 50;
        this.type = "Gel";
    */
        //constructor (parameterized)
    pen(String colour,int price , String type){
        this.colour = colour; 
        this.price = price;
        this.type = type;
    }

    //public method
    public void write(){    
        System.out.println("Pen is writing");
    }
    //Static method
    static void draw(){
        System.out.println("Pen is drawing");
    }
}
public class oops{
    public static void main(String[] args){
        pen trimax=new pen("Blue",50,"gel");
        /*
        trimax.colour="Blue";
        trimax.price=50;
        trimax.type="Gel";
        */
        System.out.println("Trimax colour = "+trimax.colour);
        System.out.println("Trimax price = "+trimax.price);
        System.out.println("Trimax type = "+trimax.type);
        
        trimax.write();
        pen.draw();

        pen linc=new pen("Black",20,"Ballpoint");
        /*
        linc.colour="Black";
        linc.price=20;
        linc.type="Ballpoint";
        */
        System.out.println("Linc colour = "+linc.colour);
        System.out.println("Linc price = "+linc.price);
        System.out.println("Linc type = "+linc.type);

        linc.write();
        pen.draw();
        
    }
}
