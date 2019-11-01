
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Project1calculator {

private JFrame frame;
private JTextField textField;
double n1,n2,result;
String op,ans;
private JTextField textField_1;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Project1calculator window = new Project1calculator();
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
public Project1calculator() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBackground(new Color(240, 240, 240));
frame.setBounds(100, 100, 879, 401);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JMenuBar menuBar = new JMenuBar();
menuBar.setBounds(10, 0, 545, 21);
frame.getContentPane().add(menuBar);

JMenu mnFile = new JMenu("File");
menuBar.add(mnFile);
JButton btnNewButton = new JButton("<-");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String b=null;
if(textField.getText().length()>0)
{
StringBuilder str=new StringBuilder(textField.getText());
str.deleteCharAt(textField.getText().length()-1);
b=str.toString();
textField.setText(b);
}
}

});
btnNewButton.setBounds(10, 83, 54, 40);
frame.getContentPane().add(btnNewButton);

JButton btnCe = new JButton("CE");
btnCe.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField.setText(null);
}
});
btnCe.setBounds(74, 83, 54, 40);
frame.getContentPane().add(btnCe);

JButton btnC = new JButton("C");
btnC.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField.setText(null);
}
});
btnC.setBounds(133, 83, 54, 40);
frame.getContentPane().add(btnC);

JButton button_2 = new JButton("+/-\r\n");
button_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
button_2.setBounds(196, 83, 54, 40);
frame.getContentPane().add(button_2);

JButton button_8 = new JButton("7");
button_8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_8.getText();
textField.setText(Number);
}

});
button_8.setBounds(10, 134, 54, 40);
frame.getContentPane().add(button_8);

JButton button_9 = new JButton("8");
button_9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_9.getText();
textField.setText(Number);
}
});
button_9.setBounds(74, 134, 54, 40);
frame.getContentPane().add(button_9);

JButton button_11 = new JButton("/");
button_11.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
textField.setText("");
op="/";
}
});
button_11.setBounds(196, 134, 54, 40);
frame.getContentPane().add(button_11);

JButton button_12 = new JButton("%");
button_12.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=n1/100;
                textField.setText(String.valueOf(n1));
}
});
button_12.setBounds(259, 134, 54, 40);
frame.getContentPane().add(button_12);

JButton button_17 = new JButton("4");
button_17.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_17.getText();
textField.setText(Number);
}
});
button_17.setBounds(10, 185, 54, 40);
frame.getContentPane().add(button_17);

JButton button_18 = new JButton("5");
button_18.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_18.getText();
textField.setText(Number);
}
});
button_18.setBounds(74, 185, 54, 40);
frame.getContentPane().add(button_18);

JButton button_19 = new JButton("6");
button_19.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_19.getText();
textField.setText(Number);
}
});
button_19.setBounds(133, 185, 54, 40);
frame.getContentPane().add(button_19);

JButton button_20 = new JButton("*");
button_20.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
textField.setText("");
op="*";
}
});
button_20.setBounds(196, 185, 54, 40);
frame.getContentPane().add(button_20);

JButton button_26 = new JButton("1");
button_26.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_26.getText();
textField.setText(Number);
}
});
button_26.setBounds(10, 230, 54, 40);
frame.getContentPane().add(button_26);

JButton button_27 = new JButton("2");
button_27.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_27.getText();
textField.setText(Number);
}
});
button_27.setBounds(74, 230, 54, 40);
frame.getContentPane().add(button_27);

JButton button_28 = new JButton("3");
button_28.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_28.getText();
textField.setText(Number);
}
});
button_28.setBounds(133, 230, 54, 40);
frame.getContentPane().add(button_28);

JButton button_29 = new JButton("-");
button_29.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
textField.setText("");
op="-";
}
});
button_29.setBounds(196, 230, 54, 40);
frame.getContentPane().add(button_29);

JButton button_30 = new JButton("=");
button_30.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n2=Double.parseDouble(textField.getText());
if(op=="+")
{
result=n1+n2;
ans=String.format("%.2f",result);
textField.setText(ans);
}
if(op=="-")
{
result=n1-n2;
ans=String.format("%.2f",result);
textField.setText(ans);
}
if(op=="*")
{
result=n1*n2;
ans=String.format("%.2f",result);
textField.setText(ans);
}
if(op=="/")
{
result=n1/n2;
ans=String.format("%.2f",result);
textField.setText(ans);
}
if(op=="mod")
{
result=n1%n2;
ans=String.format("%.2f",result);
textField.setText(ans);
}
if(op=="x^y")
{
n1=Double.parseDouble(textField.getText());
               n1=Math.pow(n1,n2);
               textField.setText(String.valueOf(n1));
}


if(op=="cbr")
{
n1=Double.parseDouble(textField.getText());
               n1=(n1/n2)*100;
               textField.setText(String.valueOf(n1));
}
}
});
button_30.setBounds(259, 230, 63, 91);
frame.getContentPane().add(button_30);

JButton button_35 = new JButton("0");
button_35.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_35.getText();
textField.setText(Number);
}
});
button_35.setBounds(10, 270, 114, 51);
frame.getContentPane().add(button_35);

JButton button_37 = new JButton(".");
button_37.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_37.getText();
textField.setText(Number);
}
});
button_37.setBounds(133, 270, 54, 51);
frame.getContentPane().add(button_37);

JButton button_38 = new JButton("+");
button_38.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
textField.setText("");
op="+";
}
});
button_38.setBounds(196, 270, 54, 51);
frame.getContentPane().add(button_38);

JButton btnSinh = new JButton("Sinh");
btnSinh.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.sinh(n1);
                textField.setText(String.valueOf(n1));
}
});
btnSinh.setBounds(451, 83, 63, 40);
frame.getContentPane().add(btnSinh);

JButton btnMod = new JButton("Mod");
btnMod.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
textField.setText("");
op="mod";
}
});
btnMod.setBounds(515, 83, 63, 40);
frame.getContentPane().add(btnMod);

JButton btnSqrt = new JButton("sqrt");
btnSqrt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.sqrt(n1);
                textField.setText(String.valueOf(n1));
}
});
btnSqrt.setBounds(259, 83, 63, 40);
frame.getContentPane().add(btnSqrt);

JButton btnL = new JButton("L");
btnL.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.log(n1);
                textField.setText(String.valueOf(n1));

}
});
btnL.setBounds(323, 83, 63, 40);
frame.getContentPane().add(btnL);

JButton btnSin = new JButton("Sin");
btnSin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.sin(n1);
                textField.setText(String.valueOf(n1));
}
});
btnSin.setBounds(387, 83, 63, 40);
frame.getContentPane().add(btnSin);

JButton button_10 = new JButton("9");
button_10.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_10.getText();
textField.setText(Number);
}
});
button_10.setBounds(133, 134, 54, 40);
frame.getContentPane().add(button_10);

JButton btnPi = new JButton("pi");
btnPi.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+button_10.getText();
textField.setText("3.14");
}
});
btnPi.setBounds(323, 134, 63, 40);
frame.getContentPane().add(btnPi);

JButton btnCos = new JButton("Cos");
btnCos.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.cos(n1);
                textField.setText(String.valueOf(n1));
}
});
btnCos.setBounds(387, 134, 63, 40);
frame.getContentPane().add(btnCos);

JButton btnCosh = new JButton("Cosh");
btnCosh.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.cosh(n1);
                textField.setText(String.valueOf(n1));
}
});
btnCosh.setBounds(451, 134, 63, 40);
frame.getContentPane().add(btnCosh);

JButton btnLnx = new JButton("lnx");
btnLnx.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.log(n1);
                textField.setText(String.valueOf(n1));
}
});
btnLnx.setBounds(515, 134, 63, 40);
frame.getContentPane().add(btnLnx);

JButton btnx = new JButton("1/x");
btnx.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
n1=Double.parseDouble(textField.getText());
                n1=1/n1;
                textField.setText(String.valueOf(n1));
}
});
btnx.setBounds(259, 185, 54, 40);
frame.getContentPane().add(btnx);

JButton btnXy = new JButton("x^y");
btnXy.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

n1=Double.parseDouble(textField.getText());
textField.setText("");
op="x^y";

}
});
btnXy.setBounds(323, 185, 63, 40);
frame.getContentPane().add(btnXy);

JButton btnTan = new JButton("Tan");
btnTan.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.tan(n1);
                textField.setText(String.valueOf(n1));
}
});
btnTan.setBounds(387, 185, 63, 40);
frame.getContentPane().add(btnTan);

JButton btnTanh = new JButton("Tanh");
btnTanh.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.tanh(n1);
                textField.setText(String.valueOf(n1));
}

});
btnTanh.setBounds(451, 185, 63, 40);
frame.getContentPane().add(btnTanh);

JButton btnC_1 = new JButton("C");
btnC_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField.setText(null);
}
});
btnC_1.setBounds(515, 185, 63, 40);
frame.getContentPane().add(btnC_1);

JButton btnX = new JButton("x^2");
btnX.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
               n1=Math.pow(n1,2);
               textField.setText(String.valueOf(n1));

}
});
btnX.setBounds(323, 230, 63, 40);
frame.getContentPane().add(btnX);

JButton btnCbr = new JButton("Cbr");
btnCbr.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
textField.setText("");
op="cbr";
}
});
btnCbr.setBounds(387, 230, 63, 40);
frame.getContentPane().add(btnCbr);

JButton btnRund = new JButton("Rund");
btnRund.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.round(n1);
                textField.setText(String.valueOf(n1));
}
});
btnRund.setBounds(451, 230, 63, 40);
frame.getContentPane().add(btnRund);

JButton btnpi = new JButton("2pi");
btnpi.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
                n1=2*3.14;
                textField.setText(String.valueOf(n1));
}
});
btnpi.setBounds(515, 230, 63, 40);
frame.getContentPane().add(btnpi);

JButton btnX_1 = new JButton("x^3");
btnX_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
n1=Double.parseDouble(textField.getText());
                n1=Math.pow(n1,2);
                textField.setText(String.valueOf(n1));

}
});
btnX_1.setBounds(323, 281, 63, 40);
frame.getContentPane().add(btnX_1);

JButton btnBin = new JButton("Bin");
btnBin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int a=Integer.parseInt(textField.getText());
textField.setText(Integer.toBinaryString(a));
}
});
btnBin.setBounds(387, 281, 63, 40);
frame.getContentPane().add(btnBin);

JButton btnHex = new JButton("Hex");
btnHex.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int a=Integer.parseInt(textField.getText());
textField.setText(Integer.toHexString(a));
}
});
btnHex.setBounds(451, 281, 63, 40);
frame.getContentPane().add(btnHex);

JButton btnOct = new JButton("Oct");
btnOct.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int a=Integer.parseInt(textField.getText());
textField.setText(Integer.toOctalString(a));
}
});
btnOct.setBounds(515, 281, 63, 40);
frame.getContentPane().add(btnOct);

JMenuItem mntmStandard = new JMenuItem("Standard");
mntmStandard.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
frame.setBounds(100, 100, 330, 361);
textField.setBounds(10, 32, 303, 40);

}
});
mnFile.add(mntmStandard);

JMenuItem mntmSceintific = new JMenuItem("Sceintific");
mntmSceintific.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
frame.setBounds(100, 100, 596, 362);
textField.setBounds(10, 32, 568, 40);
}
});
mnFile.add(mntmSceintific);

JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
mntmUnitConversion.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
frame.setBounds(100, 100, 873, 361);
textField.setBounds(10, 32, 568, 40);
}
});
mnFile.add(mntmUnitConversion);

JMenuItem mntmExit = new JMenuItem("Exit");
mntmExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
{
System.exit(0);
}
}
});
mnFile.add(mntmExit);
textField = new JTextField();
textField.setBounds(10, 21, 569, 60);
frame.getContentPane().add(textField);
textField.setColumns(10);

JPanel panel = new JPanel();
panel.setBackground(Color.MAGENTA);
panel.setBounds(588, 32, 262, 284);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblConverter = new JLabel("Converter");
lblConverter.setFont(new Font("Times New Roman", Font.BOLD, 24));
lblConverter.setBounds(67, 11, 111, 36);
panel.add(lblConverter);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"India", "USA", "UK"}));
comboBox.setBounds(77, 58, 116, 36);
panel.add(comboBox);

textField_1 = new JTextField();
textField_1.setBounds(30, 115, 199, 36);
panel.add(textField_1);
textField_1.setColumns(10);

JLabel lblNewLabel = new JLabel();
lblNewLabel.setBounds(43, 178, 163, 23);
panel.add(lblNewLabel);

JButton btnConvert = new JButton("Convert");
Double india=30.0,usa=24.0,china=32.0;
btnConvert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
double db=Double.parseDouble(textField_1.getText());
if(comboBox.getSelectedItem().equals("India"))
{
String c=String.format("Rs. %.2f", db*india);
lblNewLabel.setText(c);
}
if(comboBox.getSelectedItem().equals("USA"))
{
String c=String.format("Doller. %.2f", db*usa);
lblNewLabel.setText(c);
}
if(comboBox.getSelectedItem().equals("UK"))
{
String c=String.format("Pound. %.2f", db*china);
lblNewLabel.setText(c);
}
}
});
btnConvert.setBounds(27, 235, 89, 38);
panel.add(btnConvert);

JButton btnClear = new JButton("Clear");
btnClear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_1.setText(null);
comboBox.setSelectedItem(null);
}
});
btnClear.setBounds(147, 235, 89, 38);
panel.add(btnClear);

}
}
