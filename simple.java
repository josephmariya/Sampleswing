import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class simple {

	private JFrame frame;
	private JTextField rt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simple window = new simple();
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
	public simple() {
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
		
		rt = new JTextField();
		rt.setBounds(25, 33, 182, 20);
		frame.getContentPane().add(rt);
		rt.setColumns(10);
		
		JButton bt1 = new JButton("SUBMITT");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bt1.setBounds(270, 32, 89, 23);
		frame.getContentPane().add(bt1);
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(116, 126, 166, 35);
		frame.getContentPane().add(l1);
	}
}
