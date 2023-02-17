import java.util.Scanner;
public class Palindrome2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str;
        str=s.nextLine();
        if(isPalindrome(str)){
            System.out.println("palindrome");}
            else{
             System.out.println(" not palindrome");}   
            
        }
        public static boolean isPalindrome(String input){
        int left=0,right=input.length()-1;
        
        while(left<right){
            if(input.charAt(left)!=input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        }
    }
