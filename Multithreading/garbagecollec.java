public class garbagecollec {
    public void finalize(){
        System.out.println("Garbage collection");
    }
    public static void main(String[] args) {
        garbagecollec g1=new garbagecollec();
        garbagecollec g2=new garbagecollec();
        g1=null;
        g2=null;
        System.gc();
    }
}
