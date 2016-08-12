
package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Frame extends JFrame {
    
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bEqual,bPlus,bMinus,bMulti,bDiv, bc, bsqrt; //кнопки от 0 до 9 . и =
    JPanel panel, p1, p2;
    JTextField textField = new JTextField(25); 
    JFrame frame = new JFrame("myCalculator");
    BorderLayout bl = new BorderLayout();
    
    Frame() {
        panel = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        
        panel.setLayout(bl);
        panel.add("North", textField);
        
        GridLayout gl1 = new GridLayout(4,3);
        p1.setLayout(gl1);
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton(".");
        bEqual = new JButton ("=");
        bPlus = new JButton ("+");
        bMinus = new JButton ("-");
        bMulti = new JButton ("*");
        bDiv = new JButton ("/");
        bc = new JButton ("C");
        bsqrt = new JButton("sqrt");
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b0);
        p1.add(b10);
        p1.add(bEqual);
        panel.add("Center", p1);
        
        GridLayout gl2 = new GridLayout(3,3);
        p2.setLayout(gl2);
        p2.add(bPlus);
        p2.add(bMinus);
        p2.add(bMulti);
        p2.add(bDiv);
        p2.add(bc);
        p2.add(bsqrt);
        panel.add("East", p2);
        
        Lisener ls = new Lisener(this);
        b0.addActionListener(ls);
        b1.addActionListener(ls);
        b2.addActionListener(ls);
        b3.addActionListener(ls);
        b4.addActionListener(ls);
        b5.addActionListener(ls);
        b6.addActionListener(ls);
        b7.addActionListener(ls);
        b8.addActionListener(ls);
        b9.addActionListener(ls);
        b10.addActionListener(ls);
        bPlus.addActionListener(ls);
        bMinus.addActionListener(ls);
        bMulti.addActionListener(ls);
        bDiv.addActionListener(ls);
        bEqual.addActionListener(ls);
        bc.addActionListener(ls);
        bsqrt.addActionListener(ls);
        
        
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    } 
}
