class thisKeyword {
    int a;
    thisKeyword(){
        System.out.println("Learn coding");
    }
    thisKeyword(int a){
        this();       //call default constructor of same class
        this.a=a;    //call instance
    }
    void show(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        thisKeyword r=new thisKeyword(100);
        r.show();
    }
}