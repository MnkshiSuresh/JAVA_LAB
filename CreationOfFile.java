import java.io.File;
public class FileHandling{
    public static void main(String[] args){
        File obj=new File("myFile.txt");
        System.out.println("File created! with name "+obj.getName());
    }
}
