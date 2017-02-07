
package javaapplication1;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JPanel menu = new login();
        JPanel menu = new MainMenu();
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 400, 400);
        frame.add(menu);
        frame.setVisible(true);

    }
    
}
