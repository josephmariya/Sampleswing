import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import java.awt.PopupMenu;
import java.sql.PreparedStatement;
import javax.swing.JScrollBar;
import javax.swing.JOptionPane;

public class studentreport {

	private JFrame frame;
	private JTable table1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentreport window = new studentreport();
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
	public studentreport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.setBounds(100, 100, 767, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table1 = new JTable();
		table1.setBackground(new Color(176, 196, 222));
		table1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		table1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table1.setBounds(10, 335, 731, 76);
		frame.getContentPane().add(table1);
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(169, 169, 169));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 351, 252);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblStudentId.setBounds(10, 24, 67, 14);
		panel.add(lblStudentId);
		
		textField = new JTextField();
		textField.setBounds(76, 21, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 55, 67, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 49, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurName = new JLabel("Sur Name");
		lblSurName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSurName.setBounds(10, 85, 67, 14);
		panel.add(lblSurName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 80, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCourseCode.setBounds(10, 110, 74, 14);
		panel.add(lblCourseCode);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-select-", "111032B", "111032E"}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox.setBounds(94, 107, 68, 20);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(12, 142, 150, 2);
		panel.add(separator);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTotalScore.setBounds(10, 155, 67, 14);
		panel.add(lblTotalScore);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 152, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAverage.setBounds(10, 180, 46, 22);
		panel.add(lblAverage);
		
		textField_4 = new JTextField();
		textField_4.setBounds(76, 183, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblRanking.setBounds(10, 213, 46, 14);
		panel.add(lblRanking);
		
		textField_5 = new JTextField();
		textField_5.setBounds(76, 210, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMaths.setBounds(172, 24, 60, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEnglish.setBounds(172, 55, 60, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblBiology.setBounds(172, 85, 60, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblComputer.setBounds(172, 110, 60, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblChemistry.setBounds(172, 135, 56, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPhysics.setBounds(172, 166, 46, 14);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTamil.setBounds(172, 194, 46, 20);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMalayalam.setBounds(172, 225, 60, 16);
		panel.add(lblMalayalam);
		
		textField_6 = new JTextField();
		textField_6.setBounds(242, 21, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(242, 52, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(242, 80, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(242, 107, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(242, 132, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(242, 162, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(242, 193, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(242, 224, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(366, 10, 375, 314);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 355, 258);
		panel_1.add(textArea);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sdata1=textField.getText();
				String sdata2=(String)comboBox.getSelectedItem();
				String sdata3=textField_6.getText();
				String sdata4=textField_7.getText();
				String sdata5=textField_8.getText();
				String sdata6=textField_9.getText();
				String sdata7=textField_10.getText();
				String sdata8=textField_11.getText();
				String sdata9=textField_12.getText();
				String sdata10=textField_13.getText();
				float data3=Float.parseFloat(sdata3);
				float data4=Float.parseFloat(sdata4);
				float data5=Float.parseFloat(sdata5);
				float data6=Float.parseFloat(sdata6);
				float data7=Float.parseFloat(sdata7);
				float data8=Float.parseFloat(sdata8);
				float data9=Float.parseFloat(sdata9);
				float data10=Float.parseFloat(sdata10);
				float total=(float)(data3+data4+data5+data6+data7+data8+data9+data10);
				float avg=(float)(total/8);
				String sdata13;
				if(total>=700)
				{
					sdata13="1";
				}
				else if(total>=600&&total<700) {
					sdata13="2";
				}
				else if(total>=500&&total<600) {
					sdata13="3";
				}
				else if(total>=400&&total<500) {
				  sdata13="4";
				}
				else  {
					sdata13="Fail";
				}
				String sdata11=String.valueOf(total);
				String sdata12=String.valueOf(avg);
				
				String[] row = { sdata1, sdata2, sdata3, sdata4,sdata5, sdata6, sdata7, sdata8, sdata9, sdata10, sdata11, sdata12, sdata13};
				DefaultTableModel model = (DefaultTableModel) table1.getModel();
			    model.addRow(row);
			    textField_3.setText(sdata11);
			    textField_4.setText(sdata12);
			    textField_5.setText(sdata13);
			}
		});
		btnAddReport.setForeground(new Color(0, 128, 0));
		btnAddReport.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAddReport.setBounds(57, 423, 102, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table1.getSelectedRow();
				if(table1.getSelectedRow()==-1)
				{
				if(table1.getRowCount()>0)
				{
				JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
				JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
					DefaultTableModel model = (DefaultTableModel) table1.getModel();
				    model.removeRow(row);
				}
					
				
			}
		});
		btnDelete.setForeground(new Color(220, 20, 60));
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnDelete.setBounds(169, 423, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNewButton = new JButton("Show Report");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*int row = table1.getSelectedRow();
				String sdata1=(String)table1.getValueAt(row,0);
				String sdata2=(String)table1.getValueAt(row,1);
				String sdata3=(String)table1.getValueAt(row,2);
				String sdata4=(String)table1.getValueAt(row,3);
				String sdata5=(String)table1.getValueAt(row,4);
				String sdata6=(String)table1.getValueAt(row,5);
				String sdata7=(String)table1.getValueAt(row,6);
				String sdata8=(String)table1.getValueAt(row,7);
				String sdata9=(String)table1.getValueAt(row,8);
				String sdata10=(String)table1.getValueAt(row,9);
				String sdata11=(String)table1.getValueAt(row,10);
				String sdata12=(String)table1.getValueAt(row,11);
				String sdata13=(String)table1.getValueAt(row,12);*/
				textArea.append("Student Record\n"
						+ "Student Name :\t\t"+textField_1.getText()+" "+textField_2.getText()+"\n"
						+ "======================================\n"
						+ "Math:\t\t" + textField_6.getText()
						+ "\nEnglish:\t\t" + textField_7.getText()
						+ "\nBiology:\t\t" + textField_8.getText()
						+ "\nComputer:\t\t" + textField_9.getText()
						+ "\nChemistry:\t\t" + textField_10.getText()
						+ "\nPysics:\t\t" + textField_11.getText()
						+ "\nTamil:\t\t" + textField_12.getText()
						+ "\nMalayalam:\t\t" + textField_13.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + textField_3.getText()
						+ "\nAverage:\t\t" + textField_4.getText()
						+ "\nRanking:\t\t" + textField_5.getText() + "\n");
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 139));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(268, 423, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(220, 20, 60));
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnExit.setBounds(386, 423, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnClear.setForeground(new Color(0, 0, 139));
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnClear.setBounds(132, 280, 89, 23);
		panel_1.add(btnClear);
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			    textField_2.setText("");
			    comboBox.setSelectedIndex(0);
				textField_3.setText("");
			    textField_4.setText("");
			    textField_5.setText("");
			    textField_6.setText("");
			    textField_7.setText("");
			    textField_8.setText("");
				textField_9.setText("");
			    textField_10.setText("");
			    textField_11.setText("");
			    textField_12.setText("");
			    textField_13.setText("");
			}
		});
		btnReset.setForeground(new Color(0, 0, 205));
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnReset.setBounds(491, 423, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
