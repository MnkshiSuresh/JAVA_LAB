import java.util.StringTokenizer;
import java.util.Scanner;
public class ST{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=s.nextLine();
        System.out.println("Enter the particular element:");
        String ele=s.nextLine();
        StringTokenizer st=new StringTokenizer(str,ele);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
