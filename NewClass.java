
package mysmallsearchengine;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class NewClass {
    public NewClass(){
    try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Create and show main window at startup
					My_Currency_Converter cc = new My_Currency_Converter();
					cc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
}
