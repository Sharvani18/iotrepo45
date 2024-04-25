package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setBounds(131, 11, 185, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NO");
		lblNewLabel_1.setBounds(88, 88, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH");
		lblNewLabel_2.setToolTipText("SELECT\r\nCSE\r\nECE\r\nIOT");
		lblNewLabel_2.setBounds(88, 113, 73, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(180, 47, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 88, 86, 14);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setBounds(88, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "IOT", "CSE", "ECE", "AIML"}));
		comboBox.setBounds(193, 113, 76, 14);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setBounds(88, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
		rdbtnNewRadioButton.setBounds(177, 134, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
		rdbtnNewRadioButton_1.setBounds(307, 134, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("PROGRAM");
		lblNewLabel_5.setBounds(88, 175, 57, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C");
		chckbxNewCheckBox.setBounds(172, 171, 46, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PYTHON");
		chckbxNewCheckBox_1.setBounds(235, 171, 65, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("JAVA");
		chckbxNewCheckBox_2.setBounds(323, 171, 65, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener( new ActionListener(){;
		public void actionPerformed(ActionEvent e) {
			String roll=tb1.getText();
			String name=tb2.getText();
			String branch=(String) cb1.getSelectedItem();
			String gender =" ";
			String langs =" ";
			if(r1.isSelected())
			{
				gender="MALE";
			}
				if(r2.isSelected())
				{
					gender="FEMALE";
			}
			if(c1.isSelected())
			{
				langs=langs+="C";
			}
			if(c2.isSelected())
			{
				langs=langs+="PYTHON";
			}
			if(c3.isSelected())
			{
				langs=langs+="JAVA";
			}
			JOptionPane.showMessageDialog(btnNewButton,"Roll:"+roll+"\nNAME :"+name+"\nBRANCH :"+branch+"\nGENDER :"+gender+"\nPROG LANGS:"+LANG)
		});
		
		btnNewButton.setFont("Tahoma",Font.BOLD,14));
		btnNewButton.setBounds(197, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
