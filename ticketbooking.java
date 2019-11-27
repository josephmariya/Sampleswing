import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

public class ticketbooking {
	static int id=4020;
    public String r1,r2,r3;
	private JFrame frame;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_12;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(100, 100, 769, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setBounds(356, 64, 374, 267);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(10, 24, 46, 14);
		panel2.add(lblName);
		
		textField_12 = new JTextField();
		textField_12.setBounds(89, 22, 254, 20);
		panel2.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblFrom.setBounds(20, 66, 46, 14);
		panel2.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTo.setBounds(20, 102, 46, 14);
		panel2.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDate.setBounds(20, 140, 46, 14);
		panel2.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTime.setBounds(20, 181, 46, 14);
		panel2.add(lblTime);
		
		textField_5 = new JTextField();
		textField_5.setBounds(65, 63, 86, 20);
		panel2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(65, 99, 86, 20);
		panel2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(65, 137, 86, 20);
		panel2.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(65, 178, 86, 20);
		panel2.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(203, 71, 120, 20);
		panel2.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(203, 118, 120, 20);
		panel2.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(203, 167, 120, 20);
		panel2.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTicketNo.setBounds(241, 53, 68, 14);
		panel2.add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPrice.setBounds(241, 102, 46, 14);
		panel2.add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblRoute.setBounds(241, 153, 46, 14);
		panel2.add(lblRoute);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(179, 0, 366, 53);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setBounds(82, 11, 224, 31);
		lblTicketBooking.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel.add(lblTicketBooking);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(0, 0, 205));
		panel3.setBounds(10, 342, 733, 101);
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking no", "From", "To", "No of seats", "Time ", "Date", "A/C or  Non A/C", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(7).setPreferredWidth(87);
		table.setBounds(10, 11, 713, 79);
		panel3.add(table);
		
		JLabel labelname = new JLabel("Name");
		labelname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		labelname.setBounds(10, 66, 88, 25);
		frame.getContentPane().add(labelname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 69, 207, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(10, 106, 357, -4);
		frame.getContentPane().add(separator);
		
		
		JRadioButton rdbtnfirstclass = new JRadioButton("First Class");
		rdbtnfirstclass.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnfirstclass.setBounds(6, 136, 88, 23);
		frame.getContentPane().add(rdbtnfirstclass);
		
		JRadioButton rdbtnac = new JRadioButton("AC");
		rdbtnac.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnac.setBounds(104, 136, 43, 23);
		frame.getContentPane().add(rdbtnac);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnSleeper.setBounds(166, 136, 80, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		ButtonGroup G1 = new ButtonGroup();
		G1.add(rdbtnfirstclass);
		G1.add(rdbtnac);
		G1.add(rdbtnSleeper);
		
		JRadioButton rdbtnStandara = new JRadioButton("Standard");
		rdbtnStandara.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnStandara.setBounds(6, 110, 80, 23);
		frame.getContentPane().add(rdbtnStandara);
		
		JRadioButton rdbtnsingle = new JRadioButton("Single Ticket");
		rdbtnsingle.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnsingle.setBounds(108, 109, 109, 23);
		frame.getContentPane().add(rdbtnsingle);
		
		JRadioButton rdbtnadult = new JRadioButton("Adult");
		rdbtnadult.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnadult.setBounds(230, 110, 68, 23);
		frame.getContentPane().add(rdbtnadult);
		
		
		JRadioButton rdbtnchild = new JRadioButton("Child");
		rdbtnchild.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnchild.setBounds(248, 136, 67, 23);
		frame.getContentPane().add(rdbtnchild);
		
		ButtonGroup G2 = new ButtonGroup();
		G2.add(rdbtnStandara);
		G2.add(rdbtnsingle);
		G2.add(rdbtnadult);
		G2.add(rdbtnchild);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-from-", "Kollam", "Chalakudy", "Thrissur"}));
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox_1.setBounds(10, 166, 88, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-to-", "Kollam", "Chalakudy", "Thrissur"}));
		comboBox_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox_2.setBounds(114, 166, 88, 20);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"-No of seats-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox_3.setBounds(218, 166, 97, 20);
		frame.getContentPane().add(comboBox_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(10, 197, 326, 3);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBounds(10, 102, 326, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTax.setBounds(10, 213, 80, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSubTotal.setBounds(10, 243, 68, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblToal = new JLabel("Total");
		lblToal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblToal.setBounds(10, 270, 68, 14);
		frame.getContentPane().add(lblToal);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 211, 183, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(108, 241, 183, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 268, 183, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBounds(344, 102, 2, 229);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(0, 0, 0));
		separator_4.setBounds(10, 301, 326, 3);
		frame.getContentPane().add(separator_4);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fr=(String)comboBox_1.getSelectedItem();
				String to=(String)comboBox_2.getSelectedItem();
				
				float stotal=0,total=0,tax=0,t_rate,t_tax,price=0;
				String name=textField_1.getText();
				String nseat=(String)comboBox_3.getSelectedItem();
				float n=Float.parseFloat(nseat);
				if((fr.equals("Kollam")&&to.equals("Chalakudy")))
				{
					     price=80;
				}
				else if((fr.equals("Kollam")&&to.equals("Thrissur")))
				{
				     price=100;
			   }
				else if((fr.equals("Chalakudy")&&to.equals("Kollam")))
				{
		          price=80;
		     	}
				else if((fr.equals("Chalakudy")&&to.equals("Thrissur")))
				{
		          price=100;
		    	}
				else if((fr.equals("Thrissur")&&to.equals("Kollam")))
				{
		          price=80;
		     	}
				else if((fr.equals("Thrissur")&&to.equals("Chalakudy")))
				{
		          price=100;
		    	}
				else
				{
					if((fr.equals("Thrissur")&&to.equals("Thrissur")))
					{
						JOptionPane.showMessageDialog(null, "Please enter valid destination",
								"Ticket Details",JOptionPane.OK_OPTION);
			    	}
					if((fr.equals("Chalakudy")&&to.equals("Chalakudy")))
					{
						JOptionPane.showMessageDialog(null, "Please enter valid destination",
								"Ticket Details",JOptionPane.OK_OPTION);
			    	}
					if((fr.equals("Kollam")&&to.equals("Kollam")))
					{
						JOptionPane.showMessageDialog(null, "Please enter valid destination",
								"Ticket Details",JOptionPane.OK_OPTION);
			    	}
				}
				 if(rdbtnfirstclass.isSelected())
	              {
	            	 t_rate=(float)(price+(price*0.3));
	            	 t_tax=(float)(t_rate*0.3);
	            	 tax=(float)(t_tax*n);
	            	 stotal=(float)(t_rate*n);
	            	 total=(float)(tax+stotal);
	            	
	              }
	              else if(rdbtnac.isSelected())
	              {
	            	  t_rate=(float)(price+(price*0.2));
		            	 t_tax=(float)(t_rate*0.2);
		            	tax=(float)(t_tax*n);
		            	 stotal=(float)(t_rate*n);
		            	 total=(float)(tax+stotal);
		            	
	              } 	 
	              else 
	              {
	             if(rdbtnSleeper.isSelected())
	              {
	            	 t_rate=(float)(price);
	            	 t_tax=(float)(t_rate*0.1);
	            	  tax=(float)(t_tax*n);
	            	 stotal=(float)(t_rate*n);
	            	  total=(float)(tax+stotal);
	            	 
	              }
	              }
				 String r1=String.valueOf(tax);
            	 String r2=String.valueOf(stotal);
            	 String r3=String.valueOf(total);
            	 id++;
            	 String r4=String.valueOf(id);
				textField_2.setText(r1);
				textField_3.setText(r2);
				textField_4.setText(r3);
				textField_12.setText(name);
				textField_10.setText(r3);	
				textField_5.setText((String)comboBox_1.getSelectedItem());
				textField_6.setText((String)comboBox_2.getSelectedItem());	
				textField_11.setText("-Any-");
				LocalTime  m=java.time.LocalTime.now();
				String q=String.valueOf(m);
				textField_7.setText(q);
				LocalDate  m1=java.time.LocalDate.now();
				String q1=String.valueOf(m1);
				textField_8.setText(q1);
				textField_9.setText(r4);
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTotal.setBounds(10, 308, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
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
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				G1.clearSelection();
				G2.clearSelection();
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(114, 308, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.setBounds(218, 308, 89, 23);
		frame.getContentPane().add(btnExit);
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField_1.getText();
				String book_no=textField_9.getText();
				String fr=(String)comboBox_1.getSelectedItem();
				String to=(String)comboBox_2.getSelectedItem();
				String nseat=(String)comboBox_3.getSelectedItem();
				String time=textField_8.getText();
				String date=textField_7.getText();
				String price=textField_10.getText();
				String ac="";
				if(rdbtnfirstclass.isSelected())
	              {
	            	
					ac="AC";
	              }
	              else if(rdbtnac.isSelected())
	              {
	            	 ac="AC"; 
		            	
	              } 	 
	              else 
	              {
	             if(rdbtnSleeper.isSelected())
	              {
	            	ac="Non AC";
	            	 
	              }
	              }
				String[] row = { name,book_no,fr,to,nseat,time,date,ac,price};
				DefaultTableModel model = (DefaultTableModel) table.getModel();
			    model.addRow(row);
				
			}
		});
		btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnConfirm.setBounds(136, 220, 89, 23);
		panel2.add(btnConfirm);
		
	}
}
