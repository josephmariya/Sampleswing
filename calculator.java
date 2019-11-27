import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class calculator {
	
    public String str1,str2;
    public int f=0;
    public int df;
    public int s;
    public static float sum=0;
	private JFrame frame;
	private JTextField rt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rt = new JTextField();
		rt.setBounds(27, 37, 652, 33);
		frame.getContentPane().add(rt);
		rt.setColumns(10);
		
		JButton sqrtb = new JButton("sqrt");
		sqrtb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                f++;
				str2=sqrtb.getText();
				str1=rt.getText();
				rt.setText("");	
				float a=Float.parseFloat(str1);
					float r=(float)Math.sqrt(a);
					String r2=String.valueOf(r);
					rt.setText(r2);
			}
		});
		sqrtb.setBounds(10, 117, 82, 23);
		frame.getContentPane().add(sqrtb);
		
		JButton divx = new JButton("1/x");
		divx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 f++;
					str2=sqrtb.getText();
					str1=rt.getText();
					rt.setText("");	
					float a=Float.parseFloat(str1);
						float r=(float)(1/a);
						String r2=String.valueOf(r);
						rt.setText(r2);
			}
		});
		divx.setBounds(102, 117, 82, 23);
		frame.getContentPane().add(divx);
		
		JButton percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=rt.getText();
				str2=percent.getText();
				rt.setText("");	
				df=0;
			}
		});
		percent.setBounds(10, 165, 82, 23);
		frame.getContentPane().add(percent);
		
		JButton exp = new JButton("Exp");
		exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				str1=rt.getText();
				str2=exp.getText();
				rt.setText("");	
				double a=Double.parseDouble(str1);	
					double r=Math.exp(a);
					String r2=String.valueOf(r);
					rt.setText(r2);
			}
		});
		exp.setBounds(102, 165, 82, 23);
		frame.getContentPane().add(exp);
		
		JButton xpowery = new JButton("x^y");
		xpowery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=rt.getText();
				str2=xpowery.getText();
				rt.setText("");		
			}
		});
		xpowery.setBounds(10, 210, 82, 23);
		frame.getContentPane().add(xpowery);
		
		JButton square = new JButton("x^2");
		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f++;
				str1=rt.getText();
				str2=square.getText();
				rt.setText("");	
				float a=Float.parseFloat(str1);
				if(str2.equals("x^2")) {
					
					float r=a*a;
					String r2=String.valueOf(r);
					rt.setText(r2);
				}
				
				
			}
		});
		square.setBounds(10, 258, 82, 23);
		frame.getContentPane().add(square);
		
		JButton lnb = new JButton("ln");
		lnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                f++;
				
				str2=lnb.getText();
				str1=rt.getText();
				rt.setText("");	
				float a=Float.parseFloat(str1);
					float ln=(float)Math.log(a);
					String r2=String.valueOf(ln);
					rt.setText(r2);	
				
			}
		});
		lnb.setBounds(102, 210, 82, 23);
		frame.getContentPane().add(lnb);
		
		JButton factb = new JButton("n!");
		factb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				
				str2=factb.getText();
				str1=rt.getText();
				rt.setText("");	
				int a=Integer.parseInt(str1);
					int p=1;
					for(int i=1;i<=a;i++)
					{
						 p=p*i;
					
					}
					
					String r2=String.valueOf(p);
					rt.setText(r2);
			}
		});
		factb.setBounds(102, 258, 82, 23);
		frame.getContentPane().add(factb);
		
		JButton sin = new JButton("sin");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 f++;
					
					str2=sin.getText();
					str1=rt.getText();
					rt.setText("");	
					float a=Float.parseFloat(str1);
						float sin=(float)Math.sin((a*Math.PI)/180);
						String r2=String.valueOf(sin);
						rt.setText(r2);	
			}
		});
		sin.setBounds(194, 117, 89, 23);
		frame.getContentPane().add(sin);
		
		JButton cosb = new JButton("cos");
		cosb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 f++;
					
					str2=cosb.getText();
					str1=rt.getText();
					rt.setText("");	
					float a=Float.parseFloat(str1);
						float cos=(float)Math.cos((a*Math.PI)/180);
						String r2=String.valueOf(cos);
						rt.setText(r2);	
				
			}
		});
		cosb.setBounds(194, 165, 89, 23);
		frame.getContentPane().add(cosb);
		
		JButton tanb = new JButton("tan");
		tanb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 f++;
					
					str2=tanb.getText();
					str1=rt.getText();
					rt.setText("");	
					float a=Float.parseFloat(str1);
						float tan=(float)Math.tan((a*Math.PI)/180);
						String r2=String.valueOf(tan);
						rt.setText(r2);	
				
			}
		});
		tanb.setBounds(194, 210, 89, 23);
		frame.getContentPane().add(tanb);
		
		JButton secb = new JButton("sec");
		secb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 f++;
					
					str2=secb.getText();
					str1=rt.getText();
					rt.setText("");	
					float a=Float.parseFloat(str1);
						float cos=(float)Math.cos((a*Math.PI)/180);
						float sec=(float)(1/cos);
						String r2=String.valueOf(sec);
						rt.setText(r2);	
			}
		});
		secb.setBounds(194, 258, 89, 23);
		frame.getContentPane().add(secb);
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt7.getText()));
			}
		});
		bt7.setBounds(327, 117, 89, 23);
		frame.getContentPane().add(bt7);
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt4.getText()));
			}
		});
		bt4.setBounds(327, 165, 89, 23);
		frame.getContentPane().add(bt4);
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt1.getText()));
				
			}
		});
		bt1.setBounds(327, 210, 89, 23);
		frame.getContentPane().add(bt1);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt0.getText()));
			}
		});
		bt0.setBounds(327, 258, 89, 23);
		frame.getContentPane().add(bt0);
		
		JButton bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt8.getText()));
			}
		});
		bt8.setBounds(424, 117, 89, 23);
		frame.getContentPane().add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt9.getText()));
			}
		});
		bt9.setBounds(523, 117, 89, 23);
		frame.getContentPane().add(bt9);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=rt.getText();
				str2=division.getText();
				rt.setText("");	
				df=0;
			}
		});
		division.setBounds(619, 117, 89, 23);
		frame.getContentPane().add(division);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt5.getText()));
			}
		});
		bt5.setBounds(426, 165, 89, 23);
		frame.getContentPane().add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt6.getText()));
			}
		});
		bt6.setBounds(523, 165, 89, 23);
		frame.getContentPane().add(bt6);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=rt.getText();
				str2=mul.getText();
				rt.setText("");
				df=0;
				
			}
		});
		mul.setBounds(619, 165, 89, 23);
		frame.getContentPane().add(mul);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt2.getText()));
			}
		});
		bt2.setBounds(424, 210, 89, 23);
		frame.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				rt.setText(rt.getText().concat(bt3.getText()));
			}
		});
		bt3.setBounds(523, 210, 89, 23);
		frame.getContentPane().add(bt3);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=rt.getText();
				str2=sub.getText();
				rt.setText("");
				df=0;
			}
		});
		sub.setBounds(619, 210, 89, 23);
		frame.getContentPane().add(sub);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					rt.setText("");
					f=0;
					df=0;
				}
				if(df==0)
				{
				rt.setText(rt.getText().concat(dot.getText()));	
				df++;
				}
			}
		});
		dot.setBounds(424, 258, 89, 23);
		frame.getContentPane().add(dot);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				String str3=rt.getText();
				rt.setText("");
				float a=Float.parseFloat(str1);
				float b=Float.parseFloat(str3);
				if(str2.equals("+")) {
					float r=a+b;
					String r2=String.valueOf(r);
					rt.setText(r2);
				}
                if(str2.equals("-")) {
					
					float r=a-b;
					String r2=String.valueOf(r);
					rt.setText(r2);
				}
                if(str2.equals("*")) {
					
					float r=a*b;
					String r2=String.valueOf(r);
					rt.setText(r2);
				}
                if(str2.equals("/")) {
					
					float r=a/b;
					String r2=String.valueOf(r);
					rt.setText(r2);
				}
                if(str2.equals("%")) {
					
					float r=a%b;
					String r2=String.valueOf(r);
					rt.setText(r2);
				}
                if(str2.equals("x^y")) {
                	float p=1;
					for(float i=0;i<b;i++)
					{
						p=p*a;
					}
					String r2=String.valueOf(p);
					rt.setText(r2);
				}
			}
		});
		equal.setBounds(523, 258, 89, 23);
		frame.getContentPane().add(equal);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s=1;
				str1=rt.getText();
				str2=add.getText();
				rt.setText("");
				df=0;
			}
		});
		add.setBounds(619, 258, 89, 23);
		frame.getContentPane().add(add);
		
		JMenuItem mntmEdit = new JMenuItem("Edit");
		mntmEdit.setBounds(10, 4, 69, 22);
		frame.getContentPane().add(mntmEdit);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("View");
		mntmNewMenuItem.setBounds(77, 4, 69, 22);
		frame.getContentPane().add(mntmNewMenuItem);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mntmHelp.setBounds(166, 4, 82, 22);
		frame.getContentPane().add(mntmHelp);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
