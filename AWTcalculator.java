package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AWTcalculator extends JFrame{
    AWTcalculator(){
        Frame f1=new Frame();
        
        JLabel l1=new JLabel("Calculator");
        l1.setBounds(190,100,100,50);

        JLabel l2=new JLabel("Input 1");
        l2.setBounds(150,150,50,30);

        JTextField tf1=new JTextField(5);
        tf1.setBounds(210,155,150,20);

        JLabel l3=new JLabel("Input 2");
        l3.setBounds(150,200,50,30);

        JTextField tf2=new JTextField(5);
        tf2.setBounds(210,205,150,20);

        JLabel l4=new JLabel("Output");
        l4.setBounds(150,300,50,30);

        JTextField tf3=new JTextField(6);
        tf3.setBounds(210,305,150,20);


        JButton b1=new JButton("+");
        b1.setBounds(165,250,30,30);

        JButton b2=new JButton("-");
        b2.setBounds(215,250,30,30);

        JButton b3=new JButton("*");
        b3.setBounds(265,250,30,30);

        JButton b4=new JButton("/");
        b4.setBounds(315,250,30,30);


        ActionListener s=new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int n1=Integer.parseInt(tf1.getText());
                int n2=Integer.parseInt(tf2.getText());
                int c=0;
                if(e.getSource()==b1){
                   c=(n1+n2);
                   tf3.setText(String.valueOf(c));
                }
                if(e.getSource()==b2){
                    c=(n1-n2);
                    tf3.setText(String.valueOf(c));
                 }
                 if(e.getSource()==b3){
                    c=(n1*n2);
                    tf3.setText(String.valueOf(c));
                 }
                 if(e.getSource()==b4){
                    c=(n1/n2); 
                    tf3.setText(String.valueOf(c));
                 }

            }
        };




        b1.addActionListener(s);
        b2.addActionListener(s);
        b3.addActionListener(s);
        b4.addActionListener(s);
        
        f1.add(l1);
        f1.add(l2);
        f1.add(tf1);
        f1.add(l3);
        f1.add(tf2);
        f1.add(l4);
        f1.add(tf3);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);

        f1.setSize(500,400);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setBackground(Color.cyan);
        b1.setBackground(Color.gray);
        b2.setBackground(Color.blue);
        b3.setBackground(Color.red);
        b4.setBackground(Color.magenta);
        tf1.setBackground(Color.orange);
        tf2.setBackground(Color.pink);
        tf3.setBackground(Color.yellow);
        


    }
    public static void main(String[]args){
        new AWTcalculator();
    }
    
}
