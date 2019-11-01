import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Converter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
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
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight Converter");
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Help ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Height");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(98, 83, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Weight");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(98, 121, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(167, 80, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 118, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel l1 = new JLabel();
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		l1.setBounds(282, 83, 46, 14);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		l2.setBounds(282, 121, 46, 14);
		frame.getContentPane().add(l2);
		
		JButton b1 = new JButton("OK");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField.getText());				
				double res2=num2/2.205;
				double res1=num1/3.281;
				String ans=String.format("%.2f m",res1);
				l1.setText(ans);
				
				String ans1=String.format("%.2f kg",res2);
				l2.setText(ans1);
				
				
				
				
			}
		});
		b1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		b1.setBounds(167, 168, 89, 23);
		frame.getContentPane().add(b1);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(266, 168, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("US Mesurement");
		lblNewLabel_3.setBounds(143, 39, 99, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Metric");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(282, 39, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		
		
		JLabel lblNewLabel_7 = new JLabel("About");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(46, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
