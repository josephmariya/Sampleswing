import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Celciusfarenheit {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Celciusfarenheit window = new Celciusfarenheit();
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
	public Celciusfarenheit() {
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
		
		JLabel l1 = new JLabel("Degrees");
		l1.setBounds(47, 45, 79, 20);
		frame.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(169, 45, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("Result =");
		l2.setBounds(47, 122, 46, 14);
		frame.getContentPane().add(l2);
		
		t2 = new JTextField();
		t2.setBounds(119, 119, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton b1 = new JButton("To Kelvin");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String f1=t1.getText();
				float f2=Float.parseFloat(f1);
				float c=(float)((f2+273.15));
				String str1=String.valueOf(c);
				t2.setText(str1);
			}
		});
		b1.setBounds(57, 190, 89, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("To Farenheit");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c1=t1.getText();
				float c2=Float.parseFloat(c1);
				float f=(float)((1.8)*c2+32);
				String str=String.valueOf(f);
				t2.setText(str);
			}
		});
		b2.setBounds(166, 190, 89, 23);
		frame.getContentPane().add(b2);
	}

}
