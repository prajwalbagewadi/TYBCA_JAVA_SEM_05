/*
2. Write a java program to design a following GUI. Use appropriate Layout and Components.
author:prajwal
*/
package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
//import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame extends JFrame implements ActionListener{
    JLabel head,pname,adhar,dose,d1,d2,vac,namel,d1l,d2l,vacp,acp;
    JTextField pnamef,adharf,namet,d1t,d2t,act,vact;
    JCheckBox b1,b2;
    JRadioButtonMenuItem r1,r2,r3;
    ButtonGroup btngrp;
    JPanel JP;
    JButton sub,res;
    public MyFrame(String var){
        this.setTitle(var);
        
        head=new JLabel("Vaccination Details.");
        head.setBounds(370,0,200,40);
        
        pname=new JLabel("Patient Name:");
        pname.setBounds(50,100,100,30);
        pnamef=new JTextField();
        pnamef.setBounds(150,100,200,30);
        
        adhar=new JLabel("Aadhaar Card No:");
        adhar.setBounds(50,140,100,30);
        adharf=new JTextField();
        adharf.setBounds(170,140,200,30);
        
        dose=new JLabel("Dose:");
        dose.setBounds(50,200,200,30);
        
        b1=new JCheckBox();
        b1.setBounds(50,230,30,30);
        d1=new JLabel("Dose 1:");
        d1.setBounds(80,230,200,30);
        
        
        b2=new JCheckBox();
        b2.setBounds(50,260,30,30);
        d2=new JLabel("Dose 2:");
        d2.setBounds(80,260,100,30);
        
        vac=new JLabel("Vaccine:");
        vac.setBounds(300,200,200,30);
        r1=new JRadioButtonMenuItem("Covishield");
        r1.setBounds(300,225,200,30);
        r2=new JRadioButtonMenuItem("Covaxin");
        r2.setBounds(300,250,200,30);
        r3=new JRadioButtonMenuItem("Sputnik V");
        r3.setBounds(300,275,200,30);
        
        btngrp=new ButtonGroup();
        btngrp.add(r1);
        btngrp.add(r2);
        btngrp.add(r3);
        
        JP=new JPanel();
        JP.setLayout(null);
        JP.setBounds(50,315,600,150);
        Border lb=BorderFactory.createLineBorder(Color.black,2);
        JP.setBorder(lb);
        
        namel=new JLabel("Name:");
        namel.setBounds(5,10,50,30);
        namet=new JTextField();
        Border lb1=BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK);
        namet.setBorder(lb1);
        namet.setBounds(43,10,100,30);
        JP.add(namel);
        JP.add(namet);
        
        d1l=new JLabel("Dose_1:");
        d1l.setBounds(155,10,50,30);
        d1t=new JTextField();
        //Border lb2=BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK);
        d1t.setBorder(lb1);
        d1t.setBounds(200,10,100,30);
        JP.add(d1l);
        JP.add(d1t);
        
        d2l=new JLabel("Dose_2:");
        d2l.setBounds(300,10,50,30);
        d2t=new JTextField();
        //Border lb3=BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK);
        d2t.setBorder(lb1);
        d2t.setBounds(350,10,100,30);
        JP.add(d2l);
        JP.add(d2t);
        
        acp=new JLabel("Aadhar card:");
        acp.setBounds(5,50,70,30);
        act=new JTextField();
        act.setBorder(lb1);
        act.setBounds(80,50,100,30);
        JP.add(acp);
        JP.add(act);
        
        vacp=new JLabel("Vaccine:");
        vacp.setBounds(200,50,70,30);
        vact=new JTextField();
        vact.setBorder(lb1);
        vact.setBounds(250,50,100,30);
        JP.add(vacp);
        JP.add(vact);
        
        sub=new JButton("Submit");
        sub.setBounds(50,500,80,60);
        sub.addActionListener(this);
        res=new JButton("Reset");
        res.setBounds(150,500,80,60);
        res.addActionListener(this);
        
        this.add(head);
        this.add(pname);
        this.add(pnamef);
        this.add(adhar);
        this.add(adharf);
        this.add(dose);
        this.add(d1);
        this.add(b1);
        this.add(d2);
        this.add(b2);
        this.add(vac);
        this.add(r1);
        this.add(r2);
        this.add(r3);
        this.add(JP);
        this.add(sub);
        this.add(res);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==sub){
            String Pname=pnamef.getText();
            namet.setText(Pname);
            String ano=adharf.getText();
            act.setText(ano);
            if(b1.isSelected()){
                d1t.setText("Completed.");
            }
            else{
                 d1t.setText("Not Taken");
            }
            if(b2.isSelected()){
                d2t.setText("Completed.");
            }
            else{
                 d2t.setText("Not Taken");
            }
            if(r1.isSelected()){
                vact.setText(r1.getText());
            }
            else if(r2.isSelected()){
                vact.setText(r2.getText());
            }
            else{
                 vact.setText(r3.getText());
            }
        }
        else{
            pnamef.setText("");
            adharf.setText("");
            b1.setSelected(false);
            b2.setSelected(false);
            btngrp.clearSelection();
        }
    }
}
public class Q2{
    public static void main(String[] args){
        MyFrame f=new MyFrame("Vaccination Details.");
        f.setSize(800,800);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}
