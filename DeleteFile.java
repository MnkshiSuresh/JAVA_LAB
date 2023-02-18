import java.io.File;
public class FileHandling{
    public static void main(String[] args){
        File obj=new File("myFile.txt");
        if(obj.delete()){
            System.out.println("The file "+obj.getName()+" is successfully deleted" );
        }
        else{
            System.out.println("failed in deleting the file "+obj.getName());
        }
    }
}
