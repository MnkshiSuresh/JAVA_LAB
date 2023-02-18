import java.io.File;
import java.io.IOException;
public class FileHandling{
    public static void main(String[] args){
        try{
            File obj=new File("myFile.txt");
        if(obj.createNewFile()){
            System.out.println("File created! with name "+obj.getName());
        }
        else{
            System.out.println("not created");
        }
        
    }
    catch(IOException e){
        System.out.println("error occured betw");
    }
}
}
