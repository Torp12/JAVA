package Alpha3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class register extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	
	public register() {
		setSize(500,500);
		setVisible(true);
		setResizable(true);
		getContentPane().setLayout(null);
		
		JLabel regisname = new JLabel("Name:");
		regisname.setFont(new Font("Tahoma", Font.BOLD, 25));
		regisname.setBounds(38, 134, 123, 35);
		getContentPane().add(regisname);
		
		JLabel regisAge = new JLabel("Age:");
		regisAge.setFont(new Font("Tahoma", Font.BOLD, 25));
		regisAge.setBounds(38, 193, 123, 71);
		getContentPane().add(regisAge);
		
		textField = new JTextField();
		textField.setBounds(171, 140, 178, 35);
		getContentPane().add(textField);
		
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 216, 178, 35);
		getContentPane().add(textField_1);
		
		
		
		JButton OK = new JButton("OK");
		OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setName(textField.getText());
				int a=Integer.parseInt(textField_1.getText());
				User.setAge(a);
				
				new menu();
				dispose();
			}
		});
		OK.setBounds(109, 295, 114, 35);
		getContentPane().add(OK);
		
		JButton CloseButton = new JButton("Close");
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		CloseButton.setBounds(283, 295, 114, 35);
		getContentPane().add(CloseButton);
		
		
	}
}
