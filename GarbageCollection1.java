import java.util.Scanner;
public class garbage {
    public void finalize() {
        System.out.println("garbage collected..");
    }
    public static void main(String[] args) {
       new garbage();
       new garbage();
       new garbage();
       new garbage();
        System.gc();
    }
}
