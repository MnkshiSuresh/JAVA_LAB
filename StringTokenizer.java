//divide the string into tokens based on a particular element
//here we dividing based on wite space " "

import java.util.StringTokenizer;
public class ST{
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("My Name Is Meenakshi Suresh"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
