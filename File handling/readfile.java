import java.io.*;
public class readfile {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("C:\\college\\summer pep java\\File handling\\File1");
            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }
            }finally{
                f.close();
                System.out.println("File succesfully closed");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
