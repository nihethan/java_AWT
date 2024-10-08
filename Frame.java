package AWT;
//import java.util.*;
import java.awt.*;
//class Simple extends Frame{
class Simple{
    Simple(){
        Frame frame=new Frame();
        Button b=new Button("Push me");
        frame.add(b);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("Simple App");
    }
    public static void main(String[] args) {
        new Simple();
    }
}

