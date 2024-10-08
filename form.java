package AWT;
//import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//class Simple extends Frame{
class form{
    form(){
        Frame frame=new Frame();
        // Button b=new Button("Push me");
        // frame.add(b);
        Label email=new Label("Email:");
        email.setBounds(50,130,100,30);

        TextField emailio=new TextField("Enter Your email:");
        emailio.setBounds(170,130,100,30);

        Label password=new Label("Password:");
        password.setBounds(50,170,100,30);

        TextField passwordio=new TextField("Enter your password");
      passwordio.setBounds(170,170,100,30);

        Label age=new Label("Age:");
        age.setBounds(50,220,100,30);

        TextField ageio=new TextField("Enter your age");
        ageio.setBounds(170,220,100,30);
        Button submit=new Button("Submit");
        submit.setBounds(200,280,100,30);
        ActionListener submitActionListener=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
               System.out.println(emailio.getText());
               System.out.println(passwordio.getText());
               System.out.println(ageio.getText());
            }
            
        };
        submit.addActionListener(submitActionListener);
        frame.add(email);
        frame.add(password);
        frame.add(emailio);
        frame.add(passwordio);
        frame.add(ageio);
        frame.add(age); 
        frame.add(submit);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("Form");
    }
    public static void main(String[] args) {
        new form();
    }
}
