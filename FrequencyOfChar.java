import java.util.Scanner;
public class Frequency{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("enter the string:");
        str=s.nextLine();
        System.out.println("Enter the character to be found:");
        char c;
        c=s.next().charAt(0);
        int i,count=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println("frequency of "+c+" "+count);
    }
}
