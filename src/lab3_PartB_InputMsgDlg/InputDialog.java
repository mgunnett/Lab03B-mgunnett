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
		String prompt1 = "Enter an integer.";
		String prompt2 = "Enter a floating-point value.";
		String intValue = JOptionPane.showInputDialog(null, prompt1);
		String numValue = JOptionPane.showInputDialog(null, prompt2);
		int addend =Integer.parseInt(intValue);
		double augend = Double.parseDouble(numValue);
		double sum = addend + augend;
		JOptionPane.showMessageDialog(null, "" + sum);
		
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
