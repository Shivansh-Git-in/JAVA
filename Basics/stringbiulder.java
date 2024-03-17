public class stringbiulder {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Hello");

        //append - like concat, insert at end
        System.out.println(sb.append("World"));

        //insert - insert anywhere
        System.out.println(sb.insert(5," new "));

        //delete
        System.out.println(sb.delete(5,10));

        //replace
        System.out.println(sb.replace(0,5,"Hi"));

        //reverse
        System.out.println(sb.reverse());
    }
}
