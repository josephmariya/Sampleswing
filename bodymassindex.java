import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class bodymassindex {

	private JFrame frame;
	private JTextField ht;
	private JTextField wt;
	private JTextField rt;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bodymassindex window = new bodymassindex();
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
	public bodymassindex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 443, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 10, 414, 43);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("BODY  MASS  INDEX");
		lblBodyMassIndex.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblBodyMassIndex.setBounds(111, 11, 238, 21);
		panel.add(lblBodyMassIndex);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(10, 59, 414, 216);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel l1 = new JLabel("Height (m) :");
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		l1.setBounds(44, 19, 101, 27);
		panel_1.add(l1);
		
		JLabel lblWeightkg = new JLabel("Weight (kg) :");
		lblWeightkg.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblWeightkg.setBounds(44, 57, 101, 27);
		panel_1.add(lblWeightkg);
		
		ht = new JTextField();
		ht.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		ht.setBounds(163, 24, 176, 22);
		panel_1.add(ht);
		ht.setColumns(10);
		
		wt = new JTextField();
		wt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		wt.setBounds(163, 62, 176, 22);
		panel_1.add(wt);
		wt.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblBmi.setBounds(44, 112, 46, 30);
		panel_1.add(lblBmi);
		
		rt = new JTextField();
		rt.setFont(new Font("Times New Roman", Font.BOLD, 17));
		rt.setBackground(Color.YELLOW);
		rt.setBounds(121, 111, 86, 33);
		panel_1.add(rt);
		rt.setColumns(10);
		
		JLabel rlabel = new JLabel("");
		rlabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		rlabel.setBackground(Color.WHITE);
		rlabel.setBounds(246, 114, 137, 30);
		panel_1.add(rlabel);
		
		JButton bt1 = new JButton("Calculate");
		bt1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String h=ht.getText();
				String w=wt.getText();
				float h1=Float.parseFloat(h);
				float w1=Float.parseFloat(w);
				float bmi=(float)(w1/(h1*h1));
				if(bmi<18.5)
				{
					rlabel.setText("Under Weight");
				}
				else if((bmi>=18.5)&&(bmi<=24.9))
				{
					rlabel.setText("Normal Weight");
				}
				else if((bmi>=25)&&(bmi<=29.9))
				{
				    rlabel.setText("Over Weight");
				}
				else
				{
					rlabel.setText("Obese");
				}
				String r=String.valueOf(bmi);
				rt.setText(r);
				
			}
		});
		bt1.setBounds(137, 169, 101, 36);
		panel_1.add(bt1);
		
		JButton bt2 = new JButton("Clear");
		bt2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ht.setText("");
				wt.setText("");
				rlabel.setText("");
				rt.setText("");
			}
		});
		bt2.setBounds(248, 169, 73, 36);
		panel_1.add(bt2);
		
		JButton bt3 = new JButton("Exit");
		bt3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bt3.setBounds(331, 169, 73, 36);
		panel_1.add(bt3);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(10, 281, 414, 107);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setCellSelectionEnabled(true);
		table.setBounds(59, 79, 46, -33);
		panel_2.add(table);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normal Weight", "Over Weight", "Obese"},
				{"<18.5", "18.5 to 24.9", "25 to 29.9", "30"},
			},
			new String[] {
				"", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setBounds(10, 64, 394, 32);
		panel_2.add(table_1);
	}
}
