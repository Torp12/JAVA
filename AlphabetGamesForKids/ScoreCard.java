package Alpha3;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;

public class ScoreCard extends JFrame {
	
	
	
	ScoreCard(int righCount){
		
	
		
	setSize(529,618); //window size
	setLocation(900,100); //sets location on the screen
	setResizable(false); //now max or minimum sizable 
	setVisible(true); //will be shown on screen
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	JLabel scorelabel = new JLabel("Your Score:");
	scorelabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
	scorelabel.setBounds(21, 312, 241, 46);
	getContentPane().add(scorelabel);
	
	JLabel scorewelcometext = new JLabel("Score Board");
	scorewelcometext.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 41));
	scorewelcometext.setBounds(100, 11, 279, 67);
	getContentPane().add(scorewelcometext);
	
	JLabel namelabel = new JLabel("Name:");
	namelabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
	namelabel.setBounds(22, 186, 131, 58);
	getContentPane().add(namelabel);
	
	JLabel agelabel = new JLabel("Age:");
	agelabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
	agelabel.setBounds(22, 233, 131, 86);
	getContentPane().add(agelabel);
	
	JLabel lblNewLabel = new JLabel(User.getName());
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
	lblNewLabel.setBounds(282, 198, 188, 46);
	getContentPane().add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel(Integer.toString(User.getAge()));
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
	lblNewLabel_1.setBounds(282, 262, 69, 35);
	getContentPane().add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel(Integer.toString(righCount));
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_2.setBounds(282, 322, 72, 35);
	getContentPane().add(lblNewLabel_2);
	
	JButton btnNewButton = new JButton("OK");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			 File f = new File("Score.dat");

             try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true))){
                 dos.writeUTF(User.getName());
                 dos.writeInt(User.getAge());
                 dos.writeInt(righCount);
             }
             catch(Exception ex) {
                 JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
             }
			
			new menu();
			dispose();
			
		}
	});
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton.setBounds(199, 434, 131, 46);
	getContentPane().add(btnNewButton);
	}
}

