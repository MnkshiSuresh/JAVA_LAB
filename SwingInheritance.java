import javax.swing.*;
public class Main extends JFrame{
    Main(){
        JFrame f=new JFrame();
        JButton b=new JButton("Click");
        b.setBounds(130,100,100,40);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
   
   
   
    public static void main(String[] args){
        Main m=new Main();
    }
}


//using inheritance button created in the frame.
