import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;
class add2 extends JFrame implements ActionListener
{
    JLabel j1;
    JTextField f1;
    JLabel j2;
    JTextField f2;
    JButton b1;
    JLabel l1;
    JTextField t1;


add2()
    {
         j1=new JLabel("First number");
         f1=new JTextField(20);
         j2=new JLabel("Second number");
         f2=new JTextField(20);
         b1=new JButton("Add");
         l1=new JLabel("Result");
         t1=new JTextField(40);
        add(j1);
        add(f1);
        add(j2);
        add(f2);
        add(b1);
        add(l1);
        add(t1);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(200, 200);
        b1.addActionListener(this);
    }
       public void actionPerformed(ActionEvent ae)
        {
            int n1=Integer.parseInt(f1.getText());
            int n2=Integer.parseInt(f2.getText());
            int sum=n1+n2;
            t1.setText(""+sum);
        }
    
    public static void main(String args[])
    {
        new add2();
    }
}