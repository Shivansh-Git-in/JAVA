import java.io.*;
public class infofile {
    public static void main(String[] args) {
        File f=new File("C:\\college\\summer pep java\\File handling\\File1");
        try{    
            if(f.exists()){
                System.out.println("File name : "+f.getName());
                System.out.println("File stored at : "+f.getAbsolutePath());
                System.out.println("File writeable : "+f.canWrite());
                System.out.println("File readable : "+f.canRead());
                System.out.println("File size : "+f.length());
                System.out.println("File removed : "+f.delete());
            }else{
                System.out.println("File doesn't exist");
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
