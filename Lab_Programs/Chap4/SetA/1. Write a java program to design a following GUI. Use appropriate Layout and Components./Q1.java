package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

class MyFrame extends JFrame implements ActionListener{
    JLabel uname,pass,result;
    JTextField un;
    JPasswordField pa;
    JButton login,reset;
    private String user,passwd;
    public MyFrame(String var){
        this.setTitle(var);
        
        uname=new JLabel();
        uname.setBounds(100,100,100,30);
        uname.setText("Username:");
        
        un=new JTextField("Enter Username.");
        un.setBounds(170,100,200,30);
        un.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e){
                if(un.getText().equals("Enter Username.")){
                    un.setText("");
                }  
            }
            @Override
            public void focusLost(FocusEvent e){
                if(un.getText().isEmpty()){
                    un.setText("Enter Username.");
                }  
            }
        });
        
        pass=new JLabel();
        pass.setBounds(100,150,100,30);
        pass.setText("Password:");
        
        pa=new JPasswordField();
        pa.setName("Enter password.");
        pa.setBounds(170,150,200,30);
        //pa.setText("Enter password.");
        pa.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e){
                if(pa.getText().equals("Enter password.")){
                    pa.setText("");
                }  
            }
            @Override
            public void focusLost(FocusEvent e){
                if(pa.getText().isEmpty()){
                    pa.setText("Enter password.");
                }  
            }
        });
        
        login=new JButton("Login");
        login.setBounds(100,200,100,30);
        login.addActionListener(this);
        
        reset=new JButton("Reset");
        reset.setBounds(270,200,100,30);
        reset.addActionListener(this);
       
        result=new JLabel("Result:");
        result.setBounds(100,250,300,30);
        result.setText("Result:");
        
        this.add(uname);
        this.add(un);
        this.add(pass);
        this.add(pa);
        this.add(login);
        this.add(reset);
        this.add(result);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){
            user=un.getText();
            char[] p=pa.getPassword();
            passwd=new String(p);
            //System.out.println(passwd);
            if(user.equals("kajal") && passwd.equals("210801")){
                result.setText("Hello Kajal. Welcome");
            }
            else{
                result.setText("Wrong Username or Password \n");
            }
        }
        else{
            un.setText("");
            pa.setText("");
        }
    }
}
public class Q1{
    public static void main(String[] args){
        MyFrame f=new MyFrame("Login");
        f.setLayout(null);
        f.setSize(800,800);
        f.setLocation(0,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
