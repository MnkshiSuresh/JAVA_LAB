import javax.swing.*;
public class Main{
    Main(){
        JFrame f=new JFrame();
        JButton b=new JButton("Click");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        Main m=new Main();
    }
}

//using constructors and defining all method calls,codes,creation of jframe,jbutton etc inside the constructor.
