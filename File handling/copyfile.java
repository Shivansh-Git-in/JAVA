import java.io.*;
public class copyfile {
    public static void main(String[] args) {
        try {
            FileInputStream f1=new FileInputStream("C:\\college\\summer pep java\\File handling\\File2");
            FileOutputStream f2=new FileOutputStream("C:\\college\\summer pep java\\File handling\\File12");
            try{
                int i;
                while((i=f1.read())!=-1){
                    f2.write((char)i);
                }
            }finally{
                f1.close();
                f2.close();
                System.out.println("File data succesfully copied");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
