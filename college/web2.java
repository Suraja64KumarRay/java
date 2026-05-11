import javax.swing.*;

public class web2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing example");

        JLabel l = new JLabel("Enter Name:");
        JTextField t = new JTextField();

        JButton b = new JButton("Submit");

        l.setBounds(50,50,100,30); 
        t.setBounds(150,50,120,30);
        b.setBounds(100,100,100,30);

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);


    }
}
