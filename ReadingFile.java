import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileHandling{
    public static void main(String[] args){
        try{
            File obj=new File("myFile.txt");
            
            Scanner s=new Scanner(obj);
            while(s.hasNextLine()){
                String str=s.nextLine();
                System.out.println(str);
            }s.close();
            }
        catch(FileNotFoundException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
