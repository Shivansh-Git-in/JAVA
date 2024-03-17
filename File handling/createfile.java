import java.io.*;
public class createfile {
    public static void main(String[] args) {
        File f=new File("C:\\college\\summer pep java\\File handling\\File1");
        try{    
            if(f.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already present");
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
