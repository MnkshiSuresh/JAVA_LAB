import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int i;
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements:");
        for(i=0; i<n; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("enter the element to be searched:");
        int key=s.nextInt();
        int u=0;
        for(i=0; i<5; i++) {
            if(a[i]==key) {
                u=1;
            }
        }


        if(u==1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
