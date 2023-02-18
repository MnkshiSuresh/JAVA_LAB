import java.util.Scanner;
public class garbage {
    public void finalize() {
        System.out.println("garbage collected..");
    }
    public static void main(String[] args) {
         garbage obj1=new garbage();
         garbage obj2=new garbage();
         obj1=obj2;
         System.gc();
    }
}
