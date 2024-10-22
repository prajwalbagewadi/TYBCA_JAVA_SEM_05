
package com;

/**
 * calculator app
 * @author Prajwal Bagewadi
 */

import java.lang.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class Main extends JFrame{
    private JTextField screen;
    private JPanel btn;
    private JButton[] btns ;
    public Main(){
        this.setTitle("Calculator:");
        this.setBounds(500,90,400,600);
        screen=new JTextField();
        screen.setBounds(5,50,375,30);
        btn=new JPanel();
        // 4cols , 4rows , 5px gaps
        btn.setLayout(new GridLayout(4,4,5,5));
        btns=new JButton[16];
        String[] btnLabels={
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            ".","0","=","+"
        };
        for(String l : btnLabels){
            JButton button=new JButton(l);
            btn.add(button);
        }
     
        this.add(screen);
        btn.setBounds(100,100,200,300);
        this.add(btn);
        JButton clear=new JButton("clear");
        clear.setBounds(100,420,200,30);
        this.add(clear);
        this.setLayout(null);
        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Main();
    }
}
