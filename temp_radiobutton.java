import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
public class temp_radiobutton {
    
	private JFrame frame;
	private JTextField rt1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp_radiobutton window = new temp_radiobutton();
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
	public temp_radiobutton() {
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
		
		JLabel l1 = new JLabel("Input ");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l1.setBounds(128, 21, 54, 18);
		frame.getContentPane().add(l1);
		
		rt1 = new JTextField();
		rt1.setBounds(192, 21, 86, 20);
		frame.getContentPane().add(rt1);
		rt1.setColumns(10);
		
		JLabel l2 = new JLabel("Input  Scale");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l2.setBounds(24, 79, 101, 14);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("Output  Scale");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l3.setBounds(272, 80, 101, 14);
		frame.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("Output");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l4.setBounds(128, 226, 54, 14);
		frame.getContentPane().add(l4);
		
		t2 = new JTextField();
		t2.setBounds(192, 224, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JRadioButton rdbtnCelcius1 = new JRadioButton("Celcius");
		rdbtnCelcius1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnCelcius1.setBounds(16, 119, 109, 23);
		frame.getContentPane().add(rdbtnCelcius1);
		
		JRadioButton rdbtnFarenheit1 = new JRadioButton("Farenheit");
		rdbtnFarenheit1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnFarenheit1.setBounds(16, 156, 109, 23);
		frame.getContentPane().add(rdbtnFarenheit1);
		
		JRadioButton rdbtnKelvin1 = new JRadioButton("Kelvin");
		rdbtnKelvin1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnKelvin1.setBounds(16, 189, 109, 23);
		frame.getContentPane().add(rdbtnKelvin1);
		
		ButtonGroup G1 = new ButtonGroup();
		G1.add(rdbtnCelcius1);
		G1.add(rdbtnFarenheit1);
		G1.add(rdbtnKelvin1);
		
		JRadioButton rdbtnCelcius2 = new JRadioButton("Celcius");
		rdbtnCelcius2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnCelcius2.setBounds(251, 120, 109, 23);
		frame.getContentPane().add(rdbtnCelcius2);
		
		JRadioButton rdbtnFarenheit2 = new JRadioButton("Farenheit");
		rdbtnFarenheit2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnFarenheit2.setBounds(251, 157, 109, 23);
		frame.getContentPane().add(rdbtnFarenheit2);
		
		JRadioButton rdbtnKelvin2 = new JRadioButton("Kelvin");
		rdbtnKelvin2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnKelvin2.setBounds(251, 190, 109, 23);
		frame.getContentPane().add(rdbtnKelvin2);
		
		ButtonGroup G2 = new ButtonGroup();
		G2.add(rdbtnCelcius2);
		G2.add(rdbtnFarenheit2);
		G2.add(rdbtnKelvin2);
		 
		rdbtnCelcius1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              String in=rt1.getText();
              float a=Float.parseFloat(in);
              if(rdbtnCelcius2.isSelected())
              {
            	 t2.setText(in);   
              }
              else if(rdbtnFarenheit2.isSelected())
              {
            	  float f=(float)((1.8*a)+32);
            	  String res=String.valueOf(f);
            	  t2.setText(res);
              }
              else 
              {
             if(rdbtnKelvin2.isSelected())
              {
            	  float f=(float)(a+273.15);
            	  String res=String.valueOf(f);
            	  t2.setText(res);
              }
              }
				
			}
		});
		rdbtnFarenheit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String in=rt1.getText();
				  float a=Float.parseFloat(in);
	              if(rdbtnCelcius2.isSelected())
	              {
	            	  float c=(float)((a-32)*5)/9;
	            	  String res=String.valueOf(c);
	            	  t2.setText(res);  
	              }
	              else if(rdbtnFarenheit2.isSelected())
	              {
	            	  t2.setText(in);
	              }
	              else 
	              {
	            	  if(rdbtnKelvin2.isSelected())
	            	  {
	            	  float k=(float)((((a-32)*5)/9)+273.15);
	            	  String res=String.valueOf(k);
	            	  t2.setText(res);
	            	  }
	              }
					
				
			}
		});
		rdbtnKelvin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String in=rt1.getText();
				  float a=Float.parseFloat(in);
	              if(rdbtnCelcius2.isSelected())
	              {
	            	  float c=(float)(a-273.15);
	            	  String res=String.valueOf(c);
	            	  t2.setText(res);  
	              }
	              else if(rdbtnFarenheit2.isSelected())
	              {
	            	  float c=(float)(((a-273.15)*9)/5)+32;
	            	  String res=String.valueOf(c);
	            	  t2.setText(res);
	              }
	              else 
	              {
	            	  if(rdbtnKelvin2.isSelected())
	            	  {
	            	  t2.setText(in);
	            	  }
	              }
				
			}
		});
		rdbtnCelcius2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String in=rt1.getText();
	              float a=Float.parseFloat(in);
	              if(rdbtnCelcius1.isSelected())
	              {
	            	 t2.setText(in);   
	              }
	              else if(rdbtnFarenheit1.isSelected())
	              {
	            	  float c=(float)((a-32)*5)/9;
	            	  String res=String.valueOf(c);
	            	  t2.setText(res);  
	              }
	              else 
	              {
	             if(rdbtnKelvin1.isSelected())
	              {
	            	 float c=(float)(a-273.15);
	            	  String res=String.valueOf(c);
	            	  t2.setText(res);  
	              }
	              }
					
				
				
			}
		});
		rdbtnFarenheit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String in=rt1.getText();
				  float a=Float.parseFloat(in);
	              if(rdbtnCelcius1.isSelected())
	              {
	            	  float f=(float)((1.8*a)+32);
	            	  String res=String.valueOf(f);
	            	  t2.setText(res); 
	              }
	              else if(rdbtnFarenheit1.isSelected())
	              {
	            	  t2.setText(in);
	              }
	              else 
	              {
	            	  if(rdbtnKelvin1.isSelected())
	            	  {
	            		  float c=(float)(((a-273.15)*9)/5)+32;
		            	  String res=String.valueOf(c);
		            	  t2.setText(res);
	            	  }
	              }
				
			}
		});
		rdbtnKelvin2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String in=rt1.getText();
				  float a=Float.parseFloat(in);
	              if(rdbtnCelcius1.isSelected())
	              {
	            	  float f=(float)(a+273.15);
	            	  String res=String.valueOf(f);
	            	  t2.setText(res);  
	              }
	              else if(rdbtnFarenheit1.isSelected())
	              {
	            	  float k=(float)((((a-32)*5)/9)+273.15);
	            	  String res=String.valueOf(k);
	            	  t2.setText(res);
	              }
	              else 
	              {
	            	  if(rdbtnKelvin1.isSelected())
	            	  {
	            		  t2.setText(in);
	            	  }
	              }
				
			}
		});
		
	
	}
}
