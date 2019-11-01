import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Project2 {

	protected static final int rowToRemove = 0;
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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project2 window = new Project2();
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
	public Project2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 839, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "                          Student Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 343, 263);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setBounds(10, 24, 67, 14);
		panel.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(69, 21, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblName = new JLabel("First Name");
		lblName.setBounds(10, 55, 51, 14);
		panel.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(69, 52, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(10, 86, 46, 14);
		panel.add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(69, 83, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCourceCode = new JLabel("Coursecode");
		lblCourceCode.setBounds(10, 114, 67, 14);
		panel.add(lblCourceCode);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1101C", "1101E", "1102M", "1203E", "1032C"}));
		comboBox.setBounds(79, 111, 76, 20);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 139, 167, 2);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("Total_Score");
		lblNewLabel.setBounds(10, 167, 67, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Average");
		lblNewLabel_1.setBounds(10, 192, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ranking");
		lblNewLabel_2.setBounds(10, 220, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(69, 164, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(69, 189, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(69, 217, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(175, 11, 46, 14);
		panel.add(lblMaths);
		
		JLabel lblNewLabel_3 = new JLabel("English");
		lblNewLabel_3.setBounds(175, 36, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setBounds(175, 72, 46, 14);
		panel.add(lblBiology);
		
		JLabel lblNewLabel_4 = new JLabel("Computer");
		lblNewLabel_4.setBounds(175, 97, 59, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setBounds(175, 127, 59, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhisics = new JLabel("Physics");
		lblPhisics.setBounds(178, 167, 46, 14);
		panel.add(lblPhisics);
		
		JLabel lblNewLabel_5 = new JLabel("Thamil");
		lblNewLabel_5.setBounds(178, 192, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setBounds(175, 220, 59, 14);
		panel.add(lblMalayalam);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_6.setBounds(247, 8, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_7.setBounds(247, 36, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_8.setBounds(247, 69, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_9.setBounds(247, 94, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_10.setBounds(247, 124, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(257, 161, 46, -5);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_12.setBounds(247, 161, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_13.setBounds(247, 186, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            }
		});
		textField_14.setBounds(247, 217, 86, 20);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBorder(new TitledBorder(null, "          Student Report", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("");
		panel_1.setBounds(353, 0, 396, 327);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 376, 261);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnClear.setBounds(128, 293, 89, 23);
		btnClear.setForeground(Color.MAGENTA);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBackground(new Color(64, 64, 64));
		panel_1.add(btnClear);
		
		JLabel lblStudentRecord = new JLabel("Student Record");
		lblStudentRecord.setBounds(10, 26, 46, 14);
		panel_1.add(lblStudentRecord);
		
		JLabel lblStudentRecord_1 = new JLabel("Student Record");
		lblStudentRecord_1.setBounds(32, 26, 46, 14);
		panel_1.add(lblStudentRecord_1);
		
		JLabel lblNewLabel_6 = new JLabel("Student Report");
		lblNewLabel_6.setBounds(10, 26, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Add Report");
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				int math=Integer.parseInt(textField_6.getText());
				int eng=Integer.parseInt(textField_7.getText());
				int bio=Integer.parseInt(textField_8.getText());
				int com=Integer.parseInt(textField_9.getText());
				int che=Integer.parseInt(textField_10.getText());
				int phy=Integer.parseInt(textField_12.getText());
				int tha=Integer.parseInt(textField_13.getText());
				int mal=Integer.parseInt(textField_14.getText());
				double total=math+eng+bio+com+che+phy+tha+mal;
				double avg=total/8;	
				String st=String.format("%.2f",total);
				textField_3.setText(st);
				String avge=String.format("%.2f",avg);
				textField_4.setText(avge);
				if(total>=700)
				{
					textField_5.setText("1");
				}
				if(total>=600&&total<700)
				{
					textField_5.setText("2");
				}
				if(total>=500&&total<600)
				{
					textField_5.setText("3");
				}
				if(total>=400&&total<500)
				{
					textField_5.setText("4");
				}
				if(total>=300&&total>400)
				{
					textField_5.setText("5");
				}
				if(total>=200&&total>300)
				{
					textField_5.setText("6");
				}
				if(total>=100&&total>200)
				{
					textField_5.setText("7");
				}
				else
				{
					textField_5.setText("faild");
				}
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			{
				model.addRow(new String[] { 
					textField.getText(),
					(String)comboBox.getSelectedItem(),
					textField_6.getText(),
					textField_7.getText(),
					textField_8.getText(),
					textField_9.getText(),
					textField_10.getText(),
					textField_12.getText(),
					textField_13.getText(),
					textField_14.getText(),
					textField_3.getText(),
					textField_4.getText(),
					textField_5.getText(),
				});
			}
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(28, 461, 110, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(row);
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(160, 461, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show Report");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
				+"Student Name :\t\t"+textField_1.getText()+textField_2.getText()
				+"\n=============================\n"
				+"Maths:\t\t"+textField_6.getText()
				+"\nEnglish:\t\t"+textField_7.getText()
				+"\nBiology:\t\t"+textField_8.getText()
				+"\nComputer:\t\t"+textField_9.getText()
				+"\nChemistry:\t\t"+textField_10.getText()
				+"\nPhysics:\t\t"+textField_12.getText()
				+"\nThamil:\t\t"+textField_13.getText()
				+"\nMalayalam:\t\t"+textField_14.getText()
				+"\n=============================\n"
				+"\nTotal:\t\t"+textField_3.getText()
				+"\nAverage:\t\t"+textField_4.getText()
				+"\nRanking:\t\t"+textField_5.getText()
				);
			}
		});
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(264, 461, 105, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setForeground(Color.MAGENTA);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
				}
			}
		});
		btnNewButton_3.setBounds(405, 461, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.setForeground(Color.CYAN);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				comboBox.setSelectedItem(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				
			}
		});
		btnNewButton_4.setBounds(531, 461, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Thamil", "Malayalam", "Total_Score", "Average", "Ranking"},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 338, 739, 101);
		frame.getContentPane().add(table);
	}
}
