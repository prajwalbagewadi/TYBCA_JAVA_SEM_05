package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.lang.*;
//import java.awt.Event
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

class MyFrame extends JFrame implements ActionListener{
    JButton btn,btn1,btn2;
    JLabel jl,jl1,jl2;
    int cntr=0,cntb=0;
    MyFrame(String var){
        this.setTitle(var);
        btn=new JButton("Red Button");
        btn.setBackground(Color.red);
        btn.setForeground(Color.white);
        btn.setBounds(100,100,100,30);
        this.add(btn);
        btn.addActionListener(this);
        
        btn1=new JButton("Blue Button");
        btn1.setBackground(Color.blue);
        btn1.setForeground(Color.white);
        btn1.setBounds(450,100,100,30);
        this.add(btn1);
        btn1.addActionListener(this);
        
        btn2=new JButton("Reset");
        btn2.setBackground(Color.magenta);
        btn2.setForeground(Color.white);
        btn2.setBounds(250,150,100,30);
        this.add(btn2);
        btn2.addActionListener(this);
        
        jl=new JLabel("Action:");
        jl.setBounds(250,200,300,100);
        this.add(jl);
        
        jl1=new JLabel("Count:");
        jl1.setBounds(250,300,300,100);
        this.add(jl1);
        
        jl2=new JLabel("Count:");
        jl2.setBounds(250,400,300,100);
        this.add(jl2);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            cntr++; 
            jl.setForeground(Color.red);
            jl.setText("RED Button");
        }
        if(e.getSource()==btn1){
            cntb++;
            jl.setForeground(Color.blue);
            jl.setText("Blue Button");  
        }
        if(e.getSource()==btn2){
            cntr=0;
            cntb=0;
            jl.setForeground(Color.magenta);
            jl.setText("Reset");  
        }
        jl1.setForeground(Color.red);
        jl1.setText("Red Button Count:"+cntr);
        jl2.setForeground(Color.blue);
        jl2.setText("Blue Button Count:"+cntb);
    }
    
}
public class SwingExample{
    public static void main(String[] agrs){
        MyFrame f=new MyFrame("Container");
        f.setSize(700,800);
        f.setLocation(100,100);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

   
