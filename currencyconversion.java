import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class currencyconversion {

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
					currencyconversion window = new currencyconversion();
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
	public currencyconversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 344, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("Input  :");
		l1.setBounds(40, 59, 69, 14);
		frame.getContentPane().add(l1);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"RUPEE", "DOLLAR", "AED"}));
		comboBox1.setBounds(166, 56, 127, 20);
		frame.getContentPane().add(comboBox1);
		
		JLabel l2 = new JLabel("Amount  :");
		l2.setBounds(40, 106, 46, 14);
		frame.getContentPane().add(l2);
		
		t1 = new JTextField();
		t1.setBounds(166, 103, 127, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l3 = new JLabel("Output  :");
		l3.setBounds(40, 153, 46, 14);
		frame.getContentPane().add(l3);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"RUPEE", "DOLLAR", "AED"}));
		comboBox2.setBounds(166, 150, 127, 20);
		frame.getContentPane().add(comboBox2);
		
		t2 = new JTextField();
		t2.setBounds(166, 222, 127, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String sin=t1.getText();
                float in=Float.parseFloat(sin);
                if(comboBox1.getSelectedItem()=="RUPEE")
                {
                	 if(comboBox2.getSelectedItem()=="RUPEE")
                     {
                         t2.setText(sin);             
                     }
                     else if(comboBox2.getSelectedItem()=="DOLLAR")
                     {
                    	 float a=(float)(in*0.014);
                    	 String out=String.valueOf(a);
                    	 t2.setText(out); 
                     }
                     else
                     {
                     if(comboBox2.getSelectedItem()=="AED")
                     {
                    	 float a=(float)(in*0.051);
                    	 String out=String.valueOf(a);
                    	 t2.setText(out); 
                         
                     }
                     }
                                 
                }
                else if(comboBox1.getSelectedItem()=="DOLLAR")
                {
                	 if(comboBox2.getSelectedItem()=="RUPEE")
                     {
                		 float a=(float)(in*71.78);
                    	 String out=String.valueOf(a);
                    	 t2.setText(out);             
                     }
                     else if(comboBox2.getSelectedItem()=="DOLLAR")
                     {
                    	 t2.setText(sin); 
                     }
                     else
                     {
                     if(comboBox2.getSelectedItem()=="AED")
                     {
                    	 float a=(float)(in*3.67);
                    	 String out=String.valueOf(a);
                    	 t2.setText(out); 
                         
                     }
                     }
                }
                else
                {
                if(comboBox1.getSelectedItem()=="AED")
                {
                	 if(comboBox2.getSelectedItem()=="RUPEE")
                     {
                		 float a=(float)(in*19.53);
                    	 String out=String.valueOf(a);
                    	 t2.setText(out);             
                     }
                     else if(comboBox2.getSelectedItem()=="DOLLAR")
                     {
                    	 float a=(float)(in*0.27);
                    	 String out=String.valueOf(a);
                    	 t2.setText(out); 
                         
                    	  
                     }
                     else
                     {
                     if(comboBox2.getSelectedItem()=="AED")
                     {
                    	 t2.setText(sin);
                    	 
                     }
                     }
                }
                }
                
               
            }
		});
		btnConvert.setBounds(47, 221, 89, 23);
		frame.getContentPane().add(btnConvert);
		
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(97, 279, 89, 23);
		frame.getContentPane().add(btnExit);
	}
	

}
