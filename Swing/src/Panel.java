import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel {

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
					Panel window = new Panel();
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
	public Panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(430, 7, -436, 38);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(147, 112, 219));
		panel_1.setBounds(4, 7, 430, 44);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Body Mass Index");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(137, 11, 158, 22);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(221, 160, 221));
		panel_2.setBounds(4, 53, 430, 165);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Height(m)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(69, 29, 60, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Weight(kg)");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(69, 54, 71, 14);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(151, 26, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 51, 86, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(255, 0, 0));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l2.setBounds(194, 96, 86, 14);
		panel_2.add(l2);

		JLabel l1 = new JLabel("");
		l1.setBackground(new Color(255, 255, 0));
		l1.setBounds(108, 86, 65, 23);
		panel_2.add(l1);
		
		JLabel lblNewLabel_3 = new JLabel("BMI");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(67, 92, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField.getText());
				double res=(num1/num2/num2)*10000;
				String ans=String.format("%.2f",res);
				l1.setText(ans);
				if(res<18.5)
				{
					l2.setText("Under Weight");
				}
				else if(res>18.5&&res<23.0) {
					l2.setText("Healthy Range");
				}
				else if(res>23.0)
				{
					l2.setText("Over Weight");
				}
				else
				{
					l2.setText("OBESE");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(87, 131, 86, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				l1.setText(null);
				l2.setText(null);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(183, 131, 71, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				return;
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(264, 131, 60, 23);
		panel_2.add(btnNewButton_2);
		
				
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(147, 112, 219));
		panel_3.setBounds(4, 218, 430, 165);
		frame.getContentPane().add(panel_3);
		
		JButton btnNewButton_3 = new JButton((new ImageIcon("C://Users/Public/Pictures/Sample Pictures/ww.jpg")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnNewButton_3);
	}
}
