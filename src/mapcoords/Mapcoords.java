package mapcoords;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Mapcoords {

    public static void main(String[] args) {
        JFrame f = new JFrame("image");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000, 1000);
        JButton btn = new JButton("кнопка");
        btn.setBorderPainted(true);
        btn.setSize(10, 10);
        f.add(btn);
   
        
        f.setVisible(true);
        
      
    }
}
