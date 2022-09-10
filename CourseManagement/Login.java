package CourseManagement;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login implements ActionListener{
	
	JFrame frame;
	JButton login;
	JPanel panel;
	private JTextArea username,pass;
	JLabel label1, label2;
	JLabel error = new JLabel("Wrong Input.Try Again");
	
	
	public Login() {
		frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,400);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.GRAY);
		
		username = new JTextArea();
		pass = new JTextArea();
		
		label1 = new JLabel("Username: ");
		label1.setFont(new Font("Batang",Font.PLAIN,20));
		label1.setHorizontalAlignment(JLabel.CENTER);
		label2 = new JLabel("Password: ");
		label2.setFont(new Font("Batang",Font.PLAIN,20));
		label2.setHorizontalAlignment(JLabel.CENTER);
		
		login = new JButton("Log In");
		login.setFont(new Font("Batang",Font.PLAIN,20));
		login.addActionListener(this);
		
		panel = new JPanel();
		panel.setBounds(50,50,300,150);
		panel.setLayout(new GridLayout(4,4,5,5));
		
		panel.add(label1);
		panel.add(username);
		panel.add(label2);
		panel.add(pass);
		panel.add(login);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			if(username.getText().equals("CFA") && pass.getText().equals("1234")) {
			new WelcomePage();
			frame.dispose();
			}
			else {
				new LoginError("s");
				frame.dispose();
			}
		}
		
	}

}