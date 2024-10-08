package AWT;
//import java.util.*;
import java.awt.*;
//class Simple extends Frame{
class layout{
   layout(){
        Frame frame=new Frame();
        Button b=new Button("Push me");
        b.setBounds(100,100, 1000, 100);
        Label l=new Label("Hi ,Hello every one ,I am New for AWT");
        l.setBounds(100,20,900,90);
        TextField tf=new TextField("Enter ur id");
        TextArea ta=new TextArea("Enter ur details");
        Checkbox cb=new Checkbox("School");
        Checkbox cb1=new Checkbox("College");
        Choice c=new Choice();
        c.add("Male");
        c.add("Female");
        c.add("Not to say");
       frame.add(c);
        frame.add(cb);
        frame.add(cb1);
        frame.add(b);
       // frame.add(l);
        frame.add(l);
        frame.add(tf);
        frame.add(ta);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("Simple App");
    }
    public static void main(String[] args) {
        new layout();
    }}



