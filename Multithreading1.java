import java.lang.Thread;
class demo extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running\n");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}
public class MultiThreading{
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<n;i++){
            demo obj=new demo();
            obj.start();
        }
    }
}
