import java.io.*;
public class writefile {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("C:\\college\\summer pep java\\File handling\\File1");
            try{
               f.write("Java is a programming language"); 
            }finally{
                f.close();
            }
            System.out.println("Succesfully wrote data in file");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
