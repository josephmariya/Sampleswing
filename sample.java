import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class sample {

	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
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
	public sample() {
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
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(62, 38, 100, 23);
		frame.getContentPane().add(lblUsername);
		JLabel l1 = new JLabel("");
		l1.setBounds(62, 197, 224, 14);
		frame.getContentPane().add(l1);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 38, 86, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(62, 72, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Submitt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname=textField_1.getText();
				String passwd=""+new String(pwd.getPassword());
				if(uname.equals("mariya")&&passwd.equals("123"))
				{
					l1.setText("Login successfully");
				}
				else
				{
					l1.setText("Login not successfully");
				}
			}
		});
		btnNewButton.setBounds(126, 141, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		pwd = new JPasswordField();
		pwd.setBounds(200, 72, 86, 20);
		frame.getContentPane().add(pwd);
	}
}
