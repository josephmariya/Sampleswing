import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class hotelmgmntsystem {
	public String str1,str2;
    public int f=0;
    public float n1,n2,n3,n4;
    public int df;
	private JFrame frame;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelmgmntsystem window = new hotelmgmntsystem();
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
	public hotelmgmntsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 774, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(226, 11, 257, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBounds(10, 58, 228, 180);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblChickenBurger.setBounds(10, 22, 132, 14);
		panel.add(lblChickenBurger);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(147, 19, 71, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblChickenBurgerMeal.setBounds(10, 47, 132, 14);
		panel.add(lblChickenBurgerMeal);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBounds(147, 44, 71, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cheese Burger");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 72, 132, 14);
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(147, 72, 71, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 97, 208, 2);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDrink.setBounds(10, 103, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblQty.setBounds(147, 103, 46, 14);
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-select-", "Coffee", "Tea", "Fresh Lime"}));
		comboBox.setBounds(10, 123, 86, 20);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(143, 123, 75, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home Delivery");
		rdbtnHomeDelivery.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtnHomeDelivery.setBounds(6, 150, 109, 23);
		panel.add(rdbtnHomeDelivery);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnTax.setBounds(147, 150, 71, 23);
		panel.add(rdbtnTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK, 2));
		panel_1.setBounds(10, 249, 228, 128);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCostOfDrink = new JLabel("Cost of Drinks");
		lblCostOfDrink.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCostOfDrink.setBounds(10, 36, 99, 14);
		panel_1.add(lblCostOfDrink);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCostOfMeal.setBounds(10, 61, 99, 14);
		panel_1.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCostOfDelivery.setBounds(10, 86, 99, 14);
		panel_1.add(lblCostOfDelivery);
		
		textField_4 = new JTextField();
		textField_4.setBounds(132, 33, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(132, 58, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(130, 83, 88, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.BLACK, 2));
		panel_2.setBounds(248, 58, 167, 180);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCurrencyConverter.setBounds(10, 11, 154, 24);
		panel_2.add(lblCurrencyConverter);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-select-", "INDIA", "USA", "UAE", " "}));
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		comboBox_1.setBounds(20, 46, 125, 20);
		panel_2.add(comboBox_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(20, 90, 125, 20);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.BLACK, 2));
		panel_3.setBounds(248, 249, 167, 128);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTax.setBounds(10, 27, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSubtotal.setBounds(10, 52, 56, 14);
		panel_3.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTotal.setBounds(10, 77, 46, 14);
		panel_3.add(lblTotal);
		
		textField_7 = new JTextField();
		textField_7.setBounds(76, 24, 81, 20);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(76, 49, 81, 20);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(75, 74, 82, 20);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(417, 58, 331, 319);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 311, 297);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
		textArea.setBounds(10, 11, 286, 247);
		panel_7.add(textArea);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_6, null);
		panel_6.setLayout(null);
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 22, 177, 34);
		panel_6.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField_10.getText();
				int l=s.length();
				String s2=s.substring(0,l-1);
				textField_10.setText(s2);
			}
		});
		btnB.setBounds(10, 74, 45, 34);
		panel_6.add(btnB);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_10.setText("");
			}
		});
		btnNewButton.setBounds(54, 74, 45, 34);
		panel_6.add(btnNewButton);
		
		JButton button = new JButton("...");
		button.setBounds(98, 74, 45, 34);
		panel_6.add(button);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				str1=textField_10.getText();
				str2=button_1.getText();
				textField_10.setText("");
				df=0;
			}
		});
		button_1.setBounds(142, 76, 45, 32);
		panel_6.add(button_1);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat(btnNewButton_1.getText()));
			}
		});
		btnNewButton_1.setBounds(10, 110, 45, 34);
		panel_6.add(btnNewButton_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat( button_2.getText()));
			}
		});
		button_2.setBounds(54, 110, 45, 34);
		panel_6.add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat( button_2.getText()));
			}
		});
		button_3.setBounds(98, 110, 45, 34);
		panel_6.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				str1=textField_10.getText();
				str2=button_4.getText();
				textField_10.setText("");
				df=0;
			}
		});
		button_4.setBounds(142, 110, 45, 34);
		panel_6.add(button_4);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat(button_6.getText()));
			}
		});
		button_6.setBounds(54, 144, 45, 34);
		panel_6.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat(button_7.getText()));
			}
		});
		button_7.setBounds(98, 144, 45, 34);
		panel_6.add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				str1=textField_10.getText();
				str2=button_8.getText();
				textField_10.setText("");
				df=0;
			}
		});
		button_8.setBounds(142, 144, 45, 34);
		panel_6.add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat(button_9.getText()));
			}
		});
		button_9.setBounds(10, 178, 45, 34);
		panel_6.add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat(button_10.getText()));
			}
		});
		button_10.setBounds(54, 178, 45, 34);
		panel_6.add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat(button_11.getText()));
			}
		});
		button_11.setBounds(98, 178, 45, 34);
		panel_6.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				str1=textField_10.getText();
				str2=button_12.getText();
				textField_10.setText("");
				df=0;
			}
		});
		button_12.setBounds(142, 178, 45, 34);
		panel_6.add(button_12);
		
		JButton button_13 = new JButton("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat(button_13.getText()));
				
			}
		});
		button_13.setBounds(10, 212, 45, 34);
		panel_6.add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				if(df==0)
				{
					textField_10.setText(textField_10.getText().concat(button_14.getText()));
				    df++;
				}
			}
		});
		button_14.setBounds(54, 212, 45, 34);
		panel_6.add(button_14);
		
		JButton button_15 = new JButton("...");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_15.setBounds(98, 212, 45, 34);
		panel_6.add(button_15);
		
		JButton button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				String str3=textField_10.getText();
				textField_10.setText("");
				float a=Float.parseFloat(str1);
				float b=Float.parseFloat(str3);
				if(str2.equals("+")) {
					float r=a+b;
					String r2=String.valueOf(r);
					textField_10.setText(r2);
				}
                if(str2.equals("-")) {
					
					float r=a-b;
					String r2=String.valueOf(r);
					textField_10.setText(r2);
				}
                if(str2.equals("*")) {
					
					float r=a*b;
					String r2=String.valueOf(r);
					textField_10.setText(r2);
				}
                if(str2.equals("/")) {
					
					float r=a/b;
					String r2=String.valueOf(r);
					textField_10.setText(r2);
				}
			}
		});
		button_16.setBounds(142, 212, 45, 34);
		panel_6.add(button_16);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText("");
					f=0;
					df=0;
				}
				textField_10.setText(textField_10.getText().concat(button_5.getText()));
			}
		});
		button_5.setBounds(10, 144, 45, 34);
		panel_6.add(button_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.BLACK, 2));
		panel_5.setBounds(10, 388, 738, 61);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String chick_burger=textField.getText();
				String chick_burgermeal=textField_1.getText();
				String cheese_burger=textField_2.getText();
				String drink=(String)comboBox.getSelectedItem();
				String ndrink=textField_2.getText();
				float n1=Float.parseFloat(chick_burger);
				float n2=Float.parseFloat(chick_burgermeal);
				float n3=Float.parseFloat(cheese_burger);
				float n4=Float.parseFloat(ndrink);
				float price=0;
				float cost_delivery;
				if((drink.equals("Tea")))
				{
					     price=8;
				}
				else if((drink.equals("Coffee")))
				{
				     price=10;
			   }
				else if((drink.equals("Fresh Lime")))
				{
		          price=15;
		     	}
				
				float cost_drink=(float)(price*n4);
				float cost_meal=(float)((50*n1)+(80*n2)+(120*n3));
				if(rdbtnHomeDelivery.isSelected())
				{
				    cost_delivery=30;
				}
				else
				{
					 cost_delivery=0;
				}
				float tax=(float)((cost_drink*.03)+(cost_meal*0.1)+(cost_delivery*0.1));
				float stotal=(float)(cost_drink+cost_meal+cost_delivery);
				float total=(float)(tax+stotal);
				String cd1=String.valueOf(cost_drink);
				String cm=String.valueOf(cost_meal);
				String cd2=String.valueOf(cost_delivery);
				String tax1=String.valueOf(tax);
				String stot1=String.valueOf( stotal);
				String tot1=String.valueOf(total);
				textField_4.setText(cd1);
				textField_5.setText(cm);
				textField_6.setText(cd2);
				textField_7.setText(tax1);
				textField_8.setText(stot1);
				textField_9.setText(tot1);
				
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTotal.setBounds(106, 11, 89, 27);
		panel_5.add(btnTotal);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				textField_1.setText("0");
				textField_2.setText("0");
				textField_3.setText("0");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				rdbtnHomeDelivery.setSelected(false);
				rdbtnTax.setSelected(false);
				textArea.setText("");
			}
		
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(379, 13, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rupee=textField_9.getText();
				float rup=Float.parseFloat(rupee);
				if(comboBox_1.getSelectedItem()=="INDIA")
                {
                	   textField_11.setText(rupee);             
                }
                else if(comboBox_1.getSelectedItem()=="USA")
                {
                    	 float a=(float)(rup*0.014);
                    	 String out=String.valueOf(a);
                    	 textField_11.setText(out); 
                }
                else
                {
                     if(comboBox_1.getSelectedItem()=="UAE")
                     {
                    	 float a=(float)(rup*0.051);
                    	 String out=String.valueOf(a);
                    	 textField_11.setText(out); 
                         
                     }
                }
				
			}
		});
		btnConvert.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnConvert.setBounds(10, 146, 75, 23);
		panel_2.add(btnConvert);
		
		
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnClose.setBounds(88, 146, 63, 23);
		panel_2.add(btnClose);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.setBounds(528, 13, 89, 23);
		panel_5.add(btnExit);
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d=(String)comboBox.getSelectedItem();
				float drate=0;
				if(d.equals("Tea"))
				{
					drate=8;
				}
				else if(d.equals("Coffee"))
				{
					drate=10;
				}
				else
			    {
					 if(d.equals("Fresh Lime"))
				     {
				     	drate=15;
				     }
			    }
				textArea.setText("");
				textArea.append(
						"Item :\t\t"+"Qty :\t"+" "+"UPrice :\t"+"Price:\t"+"\n"
						+ "===============================================\n"
						 +"ChickenBurger:\t" + textField.getText()+"\t"+"50\t\t"+(Float.parseFloat(textField.getText())*50)+"\n"
						+"ChickenMeal:\t" + textField_1.getText()+"\t"+"80\t\t"+(Float.parseFloat(textField_1.getText())*80)+"\n"
						 +"CheeseBurger:\t" + textField_2.getText()+"\t"+"120\t\t"+(Float.parseFloat(textField_2.getText())*120)
						+"\n"+ comboBox.getSelectedItem()+"\t"+ textField_3.getText()+"\t"+drate+"\t\t"+(Float.parseFloat(textField_3.getText())*drate)+"\n"
						+"\n=============================================="
					
						+ "\nSub Total:\t\t" + textField_8.getText() 
				        + "\nTax      :\t\t" + textField_7.getText() 
				        + "\nTotal    :\t\t" + textField_9.getText()+"\n"
				        );
				
			}
			
		});
		btnReceipt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReceipt.setBounds(245, 13, 89, 23);
		panel_5.add(btnReceipt);
	}
}
