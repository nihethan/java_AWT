package AWT;
//import java.util.*;
import java.awt.*;
class Simple extends Frame{
    Simple(){
        Button b=new Button("Push me");
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
    }
    public static void main(String[] args) {
        new Simple();
    }
}
