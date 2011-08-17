import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JFrame{
    
    JTextField txtInput = new JTextField();
    JPanel cPanel = new JPanel();
    JPanel lPanel = new JPanel();
    

    public Calculator() {
        initComponent();
        add(txtInput,BorderLayout.NORTH);
        cPanel.setLayout(new GridLayout(4,5));
        
        
         setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton bMC,bMR;
    
    private void initComponent(){
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
        bMC = new JButton("MC");
        bMR = new JButton("MR");
        cPanel.add(b7);
        cPanel.add(b8);
        cPanel.add(b9);
        cPanel.add(b4);
        cPanel.add(b5);
        cPanel.add(b6);
        cPanel.add(b1);
        cPanel.add(b2);
        cPanel.add(b3);
        
  lPanel.add(bMC);
  lPanel.add(bMR);
        
        
        add(cPanel);
        add(lPanel,BorderLayout.WEST);
        lPanel.setBackground(Color.red);
        lPanel.setLayout(new GridLayout(0,1));
        
    }
    public static void main(String[] args) {
        new Calculator();
    }
           
    
}
