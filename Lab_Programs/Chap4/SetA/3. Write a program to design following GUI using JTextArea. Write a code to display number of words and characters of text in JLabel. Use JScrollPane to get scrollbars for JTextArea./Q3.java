/*
3. Write a program to design following GUI using JTextArea. Write a code to display
number of words and characters of text in JLabel. Use JScrollPane to get scrollbars for
JTextArea.
*/
package gui;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame extends JFrame implements ActionListener{
    JTextArea ta;
    JScrollPane v;
    JLabel l1,l1v,l2,l2v;
    JButton submit,reset;
    public MyFrame(String var){
        this.setTitle(var);
        l1=new JLabel("Words:");
        l1.setBounds(20,20,100,30);
        l1v=new JLabel();
        l1v.setBounds(70,20,100,30);
        l2=new JLabel("Char:");
        l2.setBounds(100,20,100,30);
        l2v=new JLabel();
        l2v.setBounds(150,20,100,30);
        ta=new JTextArea();
        ta.setBounds(60,60,300,300);
        v=new JScrollPane(ta);
        //h=new JScrollPane(ta);
        v.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        v.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //h.setBounds(50,50,300,300);
        v.setBounds(50,50,300,300);
        submit=new JButton("Submit");
        submit.setBounds(60,400,100,30);
        submit.addActionListener(this);
        reset=new JButton("Reset");
        reset.setBounds(200,400,100,30);
        reset.addActionListener(this);
        this.add(v);
        this.add(l1);
        this.add(l2);
        this.add(submit);
        this.add(reset);
        this.add(l1v);
        this.add(l2v);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==submit){
            int wc=1,cc=1;
            String var=ta.getText();
            for(int i=0;i<var.length();i++){
                char c=var.charAt(i);
                if(c!=' ' && c!='\n'){
                    cc++;
                }
                if(c==' ' || c=='\n'){
                    wc++;
                }
            }
            l1v.setText(String.valueOf(wc));
            l2v.setText(String.valueOf(cc));
        }
        else{
            l1v.setText("");
            l2v.setText("");
            ta.setText("");
        }
    }
}
public class Q3{
    public static void main(String[] args){
        MyFrame f=new MyFrame("Count Words And Characters.");
        f.setSize(400,800);
        f.setLocation(30,30);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
