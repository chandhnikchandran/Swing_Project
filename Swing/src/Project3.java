import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Project3 {

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
	private JTable table;
	int i=203;
	int j=9076;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project3 window = new Project3();
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
	public Project3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 876, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBackground(new Color(240, 240, 240));
		lblName.setBounds(107, 122, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(184, 119, 109, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(500, 112, 350, 351);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(31, 55, 46, 14);
		panel.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(87, 53, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(22, 122, 46, 14);
		panel.add(lblFrom);
		
		textField_5 = new JTextField();
		textField_5.setBounds(87, 119, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("To");
		lblNewLabel_4.setBounds(22, 147, 46, 14);
		panel.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(87, 150, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(22, 203, 46, 14);
		panel.add(lblDate);
		
		textField_7 = new JTextField();
		textField_7.setBounds(87, 200, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(22, 228, 46, 14);
		panel.add(lblTime);
		
		textField_8 = new JTextField();
		textField_8.setBounds(87, 225, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setBounds(223, 122, 75, 14);
		panel.add(lblTicketNo);
		
		textField_9 = new JTextField();
		textField_9.setBounds(212, 144, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(235, 163, 46, 14);
		panel.add(lblPrice);
		
		textField_10 = new JTextField();
		textField_10.setBounds(212, 178, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRout = new JLabel("Rout");
		lblRout.setBounds(235, 203, 46, 14);
		panel.add(lblRout);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Ac");
		rdbtnNewRadioButton_4.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_4.setBounds(124, 217, 75, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);

		textField_11 = new JTextField();
		textField_11.setBounds(212, 225, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String v="";
				if(rdbtnNewRadioButton_4.isSelected())
				{
					v="AC";
				}
				else
				{
					v="NonAc";
				}
				String num=String.format("%d",j);
				
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				{
					model.addRow(new String[] { 
						textField_4.getText(),
						num,
						textField_5.getText(),
						textField_6.getText(),
						textField_9.getText(),
						textField_8.getText(),
						textField_7.getText(),
						v,
						textField_10.getText(),
					});
				}
				j++;
			}
		});
		btnConfirm.setBounds(145, 303, 89, 23);
		panel.add(btnConfirm);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 163, 440, -14);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(464, 158, -14, 206);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(454, 158, 0, 161);
		frame.getContentPane().add(separator_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setBounds(6, 176, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Single Ticket");
		rdbtnNewRadioButton_1.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_1.setBounds(141, 176, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Adult");
		rdbtnNewRadioButton_2.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_2.setBounds(292, 176, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("First Class");
		rdbtnNewRadioButton_3.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_3.setBounds(6, 217, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
				
		
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Child");
		rdbtnNewRadioButton_5.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_5.setBounds(320, 217, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"To", "Tvm", "Kollam", "Kottayam", "Alappuzha", "Ernakulam", "Thrissur", "Malappuram", "Calicut", "Kannur"}));
		comboBox.setBounds(124, 247, 109, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"From", "Tvm", "Kollam", "Kottayam", "Alappuzha", "Ernakulam", "Thrissur", "Malappuram", "Calicut", "Kannur"}));
		comboBox_1.setBounds(16, 247, 99, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(256, 247, 99, 20);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 283, 435, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setBounds(10, 308, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 305, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Subtotal");
		lblNewLabel_1.setBounds(10, 350, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 347, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setBounds(10, 395, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(88, 392, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 447, 419, 2);
		frame.getContentPane().add(separator_4);
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Sleeper");
		rdbtnNewRadioButton_6.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_6.setBounds(209, 217, 86, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=String.format("%d",i);
				textField_9.setText(num);
				i++;
				String name=textField.getText();
				textField_4.setText(name);
				String from=(String)comboBox_1.getSelectedItem();
				textField_5.setText(from);
				String to=(String)comboBox.getSelectedItem();
				textField_6.setText(to);
				textField_11.setText("Any");
				double t=0, tax=0;
				double no=Double.parseDouble((String)comboBox_2.getSelectedItem());
								
				if(rdbtnNewRadioButton_4.isSelected())
				{
					
					t=t+(no*500);
					
					
				}
				else
				{
					t=t+(no*700);
					
				}
				if(rdbtnNewRadioButton_6.isSelected())
				{
					
					t=t+(no*500);
					
				}
				else
				{
					t=t+(no*300);
					
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					
					t=t+(no*500);
					tax=t+200;
					textField_1.setText("200");
					
					
				}
				else
				{
					t=t+(no*300);
					tax=t+100;
					textField_1.setText("100");
					
				}
				
				
				String ts=String.format("%.2f",t);
				textField_2.setText(ts);
				String st=String.format("%.2f",tax);
				textField_3.setText(st);
				
				String price=textField_3.getText();
				textField_10.setText(price);
				
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_8.setText(tTime.format(timer.getTime()));
           
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_7.setText(tdate.format(timer.getTime()));
				
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(26, 460, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				rdbtnNewRadioButton.setSelectedIcon(null);
				rdbtnNewRadioButton_1.setSelectedIcon(null);
				rdbtnNewRadioButton_2.setSelectedIcon(null);
				rdbtnNewRadioButton_3.setSelectedIcon(null);
				rdbtnNewRadioButton_4.setSelectedIcon(null);
				rdbtnNewRadioButton_5.setSelectedIcon(null);
				
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				comboBox_2.setSelectedItem(null);
			}
		});
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(120, 460, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
				}
			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(221, 460, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(209, 11, 313, 45);
		frame.getContentPane().add(panel_1);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		panel_1.add(lblTicketBooking);
		lblTicketBooking.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(10, 531, 840, 131);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking_No", "From", "To", "No.of.Seats", "Time", "Date", "Ac/NonAc", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 820, 109);
		panel_2.add(table);
		
		
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(20, 163, 350, -14);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(20, 163, 409, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(454, 307, -1, -145);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(449, 163, 1, 2);
		frame.getContentPane().add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(453, 163, 1, 297);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.WHITE);
		separator_10.setBounds(449, 139, 0, 341);
		frame.getContentPane().add(separator_10);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setForeground(Color.WHITE);
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setBounds(454, 283, 0, -135);
		frame.getContentPane().add(separator_12);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(449, 163, 1, 284);
		frame.getContentPane().add(separator_11);
	}
}
