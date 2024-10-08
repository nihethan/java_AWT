package AWT;
//import java.util.*;
import java.awt.*;
//class Simple extends Frame{
class label{
    label(){
        Frame frame=new Frame();
        Button b=new Button("Push me");
        Label l=new Label("Hi ,Hello every one ,I am New for AWT");
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
        frame.add(l);
        frame.add(tf);
        frame.add(ta);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("Simple App");
    }
    public static void main(String[] args) {
        new label();
    }}

