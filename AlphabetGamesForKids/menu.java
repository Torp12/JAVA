package Alpha3;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class menu implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label1= new JLabel("Alphabet Quiz Game");
	JButton PlayButton = new JButton("Play");
	JButton InstructionButton = new JButton("Instructions");
	JButton ScoreButton = new JButton("Score Board");
	JButton resetButton = new JButton("Reset Score");
	JButton ExitButton = new JButton("Exit");
	
	Font titleFont = new Font("Tahoma", Font.BOLD, 58);
	
	public menu() {
	
		frame.setTitle("Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(700,500);
		
		frame.setVisible(true);
		frame.add(label1);
		
		frame.setLayout(new FlowLayout()); //layout manager
		frame.add(label1);
		frame.add(PlayButton);
		frame.add(InstructionButton);
		frame.add(ScoreButton);
		frame.add(ExitButton);
		
		
		
		
		label1.setFont(titleFont);
		PlayButton.setFont(titleFont);
		InstructionButton.setFont(titleFont);
		ScoreButton.setFont(titleFont);
		ExitButton.setFont(titleFont);
		
		PlayButton.addActionListener(this);
		InstructionButton.addActionListener(this);
		ScoreButton.addActionListener(this);
		ExitButton.addActionListener(this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==PlayButton) {
			new AlphabetGameForKids();
			frame.dispose();
		}
		if(e.getSource()==InstructionButton) {
			new instruction();
			frame.dispose();
		}
		if(e.getSource()==ExitButton) {
		    frame.setVisible(false);
		   new register();
		   frame.dispose();
		}
		if(e.getSource()==ScoreButton) {
			new ScoreBoard();
			frame.dispose();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		menu menu = new menu();
	}
	
	
	
	

	


}
