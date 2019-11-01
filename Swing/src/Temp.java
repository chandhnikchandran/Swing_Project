import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Temp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temp window = new Temp();
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
	public Temp() {
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
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setBounds(105, 32, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(165, 22, 86, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Input Scale");
		lblNewLabel_1.setBounds(10, 66, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Output Scale");
		lblNewLabel_2.setBounds(300, 66, 98, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Output");
		lblNewLabel_3.setBounds(118, 220, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(174, 220, 46, 14);
		frame.getContentPane().add(l4);
		
		JRadioButton f = new JRadioButton("Celcius");
	   
		double celsius = Integer.parseInt(textField.getText());
		
		//double fldCelsius.setText(celsius1.toString());
		f.setBounds(0, 87, 109, 23);
		frame.getContentPane().add(f);
		
		JRadioButton second = new JRadioButton("Farenheit");
		second.setBounds(0, 118, 109, 23);
		frame.getContentPane().add(second);
		double farenheit = Integer.parseInt(textField.getText());
		
		JRadioButton third = new JRadioButton("Kelvin");
		third.setBounds(0, 144, 109, 23);
		frame.getContentPane().add(third);
		double kelvin = Integer.parseInt(textField.getText());
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Celcius");
		rdbtnNewRadioButton_3.setBounds(300, 87, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setActionCommand("Celcius");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Farenheit");
		rdbtnNewRadioButton_4.setBounds(300, 118, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setActionCommand("Farenheit");
		rdbtnNewRadioButton_4.setSelected(true);
		double fahrenheit1 = celsius*(9/5)+32;
		String ans=String.format("%.2f",fahrenheit1); 
		l4.setText(ans);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Kelvin");
		rdbtnNewRadioButton_5.setBounds(300, 144, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setActionCommand("Kelvin");
		
	    
	     
		
	    }
	}
	

