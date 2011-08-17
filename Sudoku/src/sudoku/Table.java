
package sudoku;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Table {
    public static void main(String[] args) {
        // TODO code application logic here
    JFrame frame = new JFrame("Sudoku");
  
    frame.setSize(400, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.getImage("Image/grin.gif");
    frame.setIconImage(img);
     //cPanel.setLayout(new GridLayout(4,5));
    
}
}
