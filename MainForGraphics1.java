/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysmallsearchengine;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainForGraphics1 {

    public MainForGraphics1() {
        JFrame frame = new JFrame();

        frame.setSize(500, 650);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel00 panel = new Panel00();

        frame.add(panel);

        frame.setVisible(true);
    }

    
}
