import java.util.Scanner;
public class garbage {
    public void finalize() {
        System.out.println("garbage collected..");
    }
    public static void main(String[] args) {
         garbage obj1=new garbage();
         garbage obj2=new garbage();
         garbage obj3=new garbage();
         garbage obj4=new garbage();
         obj1=null;
         obj2=null;
         obj3=null;
         obj4=null;
         System.gc();
    }
}
