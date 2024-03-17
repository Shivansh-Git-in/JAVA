import java.io.*;
public class renamefile {
    public static void main(String[] args) {
        try {
            File f1=new File("C:\\college\\summer pep java\\File handling\\File1");
            File f2=new File("C:\\college\\summer pep java\\File handling\\File12");
            if(f1.exists()){
                System.out.println(f1.renameTo(f2));
                System.out.println("File renamed succesfull");
            }else{
                System.out.println("File doesn't exist");
            }
            
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
