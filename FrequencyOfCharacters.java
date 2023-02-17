import java.util.Scanner;
public class Frequency{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string");
    String str=s.nextLine();
    int[] freq=new int[str.length()];
    char string[]=str.toCharArray();
    int i=0,j=0;
    for(i=0;i<str.length();i++){
        freq[i]=1;
        for(j=i+1;j<str.length();j++){
            if(string[i]==string[j]){
                freq[i]++;
                string[j]='0';
            }
        }
        
    }
    System.out.println("characters and corrosponding frequencies:");
    for(i=0;i<freq.length;i++){
        if(string[i]!='0')
            System.out.println(string[i]+":"+freq[i]);
        }
    }
    }
