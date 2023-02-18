import java.lang.Thread;
import java.util.Scanner;
class thread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            Scanner s=new Scanner(System.in);
            int rn=s.nextInt();
            System.out.println("Random number generated: "+rn);
            if(rn%2==0){
                thread2 objs=new thread2(rn);
                objs.start();
            }
            else{
                thread3 objc=new thread3(rn);
                objc.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}


class thread2 extends Thread{
    int num;
    thread2(int rn){
        num=rn;
    }
    public void run(){
        System.out.println(num*num);
    }
}

class thread3 extends Thread{
    int num;
    thread3(int rn){
        num=rn;
    }
    public void run(){
        System.out.println(num*num*num);
    }
}
class MultiThreading{
public static void main(String[] args){
    thread1 obj=new thread1();
    obj.start();
}
}
