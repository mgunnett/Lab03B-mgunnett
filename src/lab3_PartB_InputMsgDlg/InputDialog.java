package lab3_PartB_InputMsgDlg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Demonstration of Swing's JOptionPane's showInputDIalog method
 * 
 * @author Megan E.Gunnett
 * @version 1.0 - 4 February 2025
 * */

public class InputDialog {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputDialog window = new InputDialog();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InputDialog() {
		initialize();
		String prompt = "Enter your name.";
		String name = JOptionPane.showInputDialog(null, prompt);
		JOptionPane.showMessageDialog(null,  "Hi, " + name + "!");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
