
package mysmallsearchengine;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pinball {

    public Pinball() {
        JFrame frame = new JFrame();

        frame.setSize(500, 650);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel00 panel = new Panel00();

        frame.add(panel);

        frame.setVisible(true);
    }

    
}
