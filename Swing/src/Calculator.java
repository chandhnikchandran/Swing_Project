import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	
		{
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setFont(new Font("Aharoni", Font.PLAIN, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(143, 22, 160, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b1.getText();
				textField.setText(Number);
			}
		});
		b1.setBounds(132, 72, 48, 45);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b2.getText();
				textField.setText(Number);
			}
		});
		b2.setBounds(173, 72, 48, 45);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b3.getText();
				textField.setText(Number);
			}
		});
		b3.setBounds(219, 72, 48, 45);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b4.getText();
				textField.setText(Number);
			}
		});
		b4.setBounds(132, 118, 48, 45);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b5.getText();
				textField.setText(Number);
			}
		});
		b5.setBounds(173, 118, 48, 45);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b6.getText();
				textField.setText(Number);
			}
			
		});
		b6.setBounds(217, 118, 50, 45);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b7.getText();
				textField.setText(Number);
			}
		});
		b7.setBounds(132, 159, 48, 37);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b8.getText();
				textField.setText(Number);
			}
		});
		b8.setBounds(173, 155, 48, 45);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b9.getText();
				textField.setText(Number);
			}
		});
		b9.setBounds(217, 155, 50, 45);
		frame.getContentPane().add(b9);
		
		JButton button_8 = new JButton("-");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_8.setBounds(268, 118, 48, 45);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			num1=Double.parseDouble(textField.getText());
			textField.setText("");
			op="*";
			});
		button_9.setBounds(268, 159, 48, 37);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_10.setBounds(268, 72, 48, 45);
		frame.getContentPane().add(button_10);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b0.getText();
				textField.setText(Number);
			}
		});
		b0.setBounds(132, 197, 48, 44);
		frame.getContentPane().add(b0);
		
		JButton button_12 = new JButton(".");
		button_12.setBounds(183, 197, 38, 31);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				
			}
		});
		button_13.setBounds(217, 198, 50, 31);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.setBounds(268, 197, 48, 31);
		frame.getContentPane().add(button_14);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC.setBounds(122, 239, 72, 25);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnB.setBounds(193, 227, 63, 37);
		frame.getContentPane().add(btnB);
		
		JButton button_17 = new JButton("%");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_17.setBounds(255, 227, 61, 37);
		frame.getContentPane().add(button_17);
	}
	

