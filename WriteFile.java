import java.io.FileWriter;
import java.io.IOException;
public class FileHandling{
    public static void main(String[] args){
        try{
            FileWriter obj=new FileWriter("myFile.txt");
            obj.write("trying write to a file");
            obj.close();
            System.out.println("successfully written!");
            }
        catch(IOException e){
            System.out.println("Error occured\n");
            e.printStackTrace();
            
        }
    }
}
