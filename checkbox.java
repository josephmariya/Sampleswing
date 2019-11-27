import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;

public class checkbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox window = new checkbox();
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
	public checkbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(48, 161, 327, 14);
		frame.getContentPane().add(label);
	
		
		JCheckBox chckbxC = new JCheckBox("C++");
		chckbxC.setBounds(122, 49, 97, 23);
		frame.getContentPane().add(chckbxC);
		chckbxC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("C++ "+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(122, 89, 97, 23);
		frame.getContentPane().add(chckbxJava);
		chckbxJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("Java "+(e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		
	}	
}
