import java.awt.*;
import javax.swing.*;

class web1 {
    public static void main(String[] args) {

        JFrame f = new JFrame("User Form");

        Label l1 = new Label("Name");  
        Label l2 = new Label("Age");

        TextField t1 = new TextField();
        TextField t2 = new TextField();

        Button b1 = new Button("Button");
        Button b2 = new Button("Cancel");

        l1.setBounds(50,50,80,30);
        l2.setBounds(50,100,80,30);
        t1.setBounds(150,50,120,30);
        t2.setBounds(150,100,120,30);
        b1.setBounds(70,160,80,30);
        b2.setBounds(170,160,80,30);

        f.add(l1);
        f.add(l2);
        f.add(b1);
        f.add(b2);
        f.add(t1);
        f.add(t2);

        f.setSize(350,250);
        f.setLayout(null);
        f.setVisible(true);
    }    
}
