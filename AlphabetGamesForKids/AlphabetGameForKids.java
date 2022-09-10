package Alpha3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class AlphabetGameForKids extends JFrame implements ActionListener {

        
		JLabel titleLabel = new JLabel("Alphabet Quiz");
		JLabel subTitle1Label = new JLabel("=================");
		JLabel questionLabel = new JLabel();
		JLabel answerLabel = new JLabel("Answer: ");   
		
		JButton exitButton = new JButton ("Exit");
		JButton AButton = new JButton ("A");
		JButton BButton = new JButton ("B");
		JButton CButton = new JButton ("C");
		JButton DButton = new JButton ("D");
		JButton EButton = new JButton ("E");
		JButton FButton = new JButton ("F");
		JButton GButton = new JButton ("G");
		JButton HButton = new JButton ("H");
		JButton IButton = new JButton ("I");
		JButton JButton = new JButton ("J");
		JButton KButton = new JButton ("K");
		JButton LButton = new JButton ("L");
		JButton MButton = new JButton ("M");
		JButton NButton = new JButton ("N");
		JButton OButton = new JButton ("O");
		JButton PButton = new JButton ("P");
		JButton QButton = new JButton ("Q");
		JButton RButton = new JButton ("R");
		JButton SButton = new JButton ("S");
		JButton TButton = new JButton ("T");
		JButton UButton = new JButton ("U");
		JButton VButton = new JButton ("V");
		JButton WButton = new JButton ("W");
		JButton XButton = new JButton ("X");
		JButton YButton = new JButton ("Y");
		JButton ZButton = new JButton ("Z");
		
		JTextField answerField = new JTextField(10);
		JTextField remarksField = new JTextField(15);
		JTextField rightCounterField = new JTextField(3);
		JTextField wrongCounterField = new JTextField(3);
		public int righCount=0, wrongCount = 0, queCount = 0;
		
		Font titleFont = new Font("Tahoma",Font.BOLD, 30);
		Font questionFont = new Font("Tahoma",Font.BOLD, 48);
		Font answerFont = new Font("Tahoma",Font.BOLD, 38);
		private final JLabel subTitle1Label_1 = new JLabel("=================");
		private JTextField textField = new JTextField();
		
		public AlphabetGameForKids() {
			textField.setForeground(new Color(139, 0, 139));
			textField.setEditable(false);
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
			textField.setColumns(10);
			
			textField.setText(Question.getQue(queCount));
			
			getContentPane().setLayout(new FlowLayout());
			getContentPane().add(titleLabel);
			getContentPane().add(subTitle1Label);
			getContentPane().add(questionLabel);
			
			getContentPane().add(textField);
			subTitle1Label_1.setFont(new Font("Tahoma", Font.BOLD, 36));
			
			getContentPane().add(subTitle1Label_1);
			getContentPane().add(answerLabel);
			getContentPane().add(answerField);
			wrongCounterField.setBackground(Color.RED);
			wrongCounterField.setEditable(false);
			getContentPane().add(wrongCounterField);
			rightCounterField.setBackground(Color.GREEN);
			rightCounterField.setEditable(false);
			getContentPane().add(rightCounterField);
			rightCounterField.setFont(answerFont);
			remarksField.setEditable(false);
			getContentPane().add(remarksField);
			getContentPane().add(AButton);
			getContentPane().add(BButton);
			getContentPane().add(CButton);
			getContentPane().add(DButton);
			getContentPane().add(EButton);
			getContentPane().add(FButton);
			getContentPane().add(GButton);
			getContentPane().add(HButton);
			getContentPane().add(IButton);
			getContentPane().add(JButton);
			getContentPane().add(KButton);
			getContentPane().add(LButton);
			getContentPane().add(MButton);
			getContentPane().add(NButton);
			getContentPane().add(OButton);
			getContentPane().add(PButton);
			getContentPane().add(QButton);
			getContentPane().add(RButton);
			getContentPane().add(SButton);
			getContentPane().add(TButton);
			getContentPane().add(UButton);
			getContentPane().add(VButton);
			getContentPane().add(WButton);
			getContentPane().add(XButton);
			getContentPane().add(YButton);
			getContentPane().add(ZButton);
			exitButton.setBackground(Color.YELLOW);
			getContentPane().add(exitButton);
			titleLabel.setFont(titleFont);
			subTitle1Label.setFont(new Font("Tahoma", Font.BOLD, 36));
			questionLabel.setFont(questionFont);
			answerLabel.setFont(answerFont);
			answerField.setFont(answerFont);
			remarksField.setFont(answerFont);
			wrongCounterField.setFont(answerFont);
			exitButton.setFont(answerFont);
			exitButton.addActionListener(this);
			AButton.setFont(titleFont);
			AButton.addActionListener(this); // to pass A as action
			
			BButton.setFont(titleFont);
			BButton.addActionListener(this); // to pass B as action
			CButton.setFont(titleFont);
			CButton.addActionListener(this); // to pass C as action
			DButton.setFont(titleFont);
			DButton.addActionListener(this); // to pass D as action
			EButton.setFont(titleFont);
			EButton.addActionListener(this); // to pass E as action
			FButton.setFont(titleFont);
			FButton.addActionListener(this); // to pass F as action
			GButton.setFont(titleFont);
			GButton.addActionListener(this); // to pass G as action
			HButton.setFont(titleFont);
			HButton.addActionListener(this); // to pass H as action
			IButton.setFont(titleFont);
			IButton.addActionListener(this); // to pass I as action
			JButton.setFont(titleFont);
			JButton.addActionListener(this); // to pass J as action
			KButton.setFont(titleFont);
			KButton.addActionListener(this); // to pass K as action
			LButton.setFont(titleFont);
			LButton.addActionListener(this); // to pass L as action
			MButton.setFont(titleFont);
			MButton.addActionListener(this); // to pass M as action
			NButton.setFont(titleFont);
			NButton.addActionListener(this); // to pass N as action
			OButton.setFont(titleFont);
			OButton.addActionListener(this); // to pass O as action
			PButton.setFont(titleFont);
			PButton.addActionListener(this); // to pass P as action
			QButton.setFont(titleFont);
			QButton.addActionListener(this); // to pass Q as action
			RButton.setFont(titleFont);
			RButton.addActionListener(this); // to pass R as action
			SButton.setFont(titleFont);
			SButton.addActionListener(this); // to pass S as action
			TButton.setFont(titleFont);
			TButton.addActionListener(this); // to pass T as action
			UButton.setFont(titleFont);
			UButton.addActionListener(this); // to pass U as action
			VButton.setFont(titleFont);
			VButton.addActionListener(this); // to pass V as action
			WButton.setFont(titleFont);
			WButton.addActionListener(this); // to pass W as action
			XButton.setFont(titleFont);
			XButton.addActionListener(this); // to pass X as action
			YButton.setFont(titleFont);
			YButton.addActionListener(this); // to pass Y as action
			ZButton.setFont(titleFont);
			ZButton.addActionListener(this); // to pass Z as action
			
			
			setTitle("Alphabet Game For Kids"); //title of the game in window bar
			setSize(498,691); //window size
			setLocation(900,100); //sets location on the screen
			setResizable(false); //now max or minimum sizable 
			setVisible(true); //will be shown on screen
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing the window method
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==AButton) {
			  answerField.setText("A");
		  }
		  if(e.getSource()==BButton) {
			  answerField.setText("B");
		  }
		  if(e.getSource()==CButton) {
			  answerField.setText("C");
		  }
		  if(e.getSource()==DButton) {
			  answerField.setText("D");
		  }
		  if(e.getSource()==EButton) {
			  answerField.setText("E");
		  }
		  if(e.getSource()==FButton) {
			  answerField.setText("F");
		  }
		  if(e.getSource()==GButton) {
			  answerField.setText("G");
		  }
		  if(e.getSource()==HButton) {
			  answerField.setText("H");
		  }
		  if(e.getSource()==IButton) {
			  answerField.setText("I");
		  }
		  if(e.getSource()==JButton) {
			  answerField.setText("J");
		  }
		  if(e.getSource()==KButton) {
			  answerField.setText("K");
		  }
		  if(e.getSource()==LButton) {
			  answerField.setText("L");
		  }
		  if(e.getSource()==MButton) {
			  answerField.setText("M");
		  }
		  if(e.getSource()==NButton) {
			  answerField.setText("N");
		  }
		  if(e.getSource()==OButton) {
			  answerField.setText("O");
		  }
		  if(e.getSource()==PButton) {
			  answerField.setText("P");
		  }
		  if(e.getSource()==QButton) {
			  answerField.setText("Q");
		  }
		  if(e.getSource()==RButton) {
			  answerField.setText("R");
		  }
		  if(e.getSource()==SButton) {
			  answerField.setText("S");
		  }
		  if(e.getSource()==TButton) {
			  answerField.setText("T");
		  }
		  if(e.getSource()==UButton) {
			  answerField.setText("U");
		  }
		  if(e.getSource()==VButton) {
			  answerField.setText("V");
		  }
		  if(e.getSource()==WButton) {
			  answerField.setText("W");
		  }
		  if(e.getSource()==XButton) {
			  answerField.setText("X");
		  }
		  if(e.getSource()==YButton) {
			  answerField.setText("Y");
		  }
		  if(e.getSource()==ZButton) {
			  answerField.setText("Z");
		  }
		  if(e.getSource()==exitButton) {
			  setVisible(false);
			   new menu();
		  }
		  
		  // -----
		  if(queCount==9) {
			  new ScoreCard(righCount);
			  dispose();
			  return;
		  }
		  if(Question.getAns(queCount).equals(answerField.getText())){
			  righCount++;
			  remarksField.setText("     Right!!");
			  
		  }
		  else {
			  wrongCount++;
			  remarksField.setText("   Wrong!Right answer is "+Question.getAns(queCount));
			  
		  }
		  String w = Integer.toString(wrongCount);
		  wrongCounterField.setText(w);
		  w = Integer.toString(righCount);
		  rightCounterField.setText(w);
		  queCount++;
		  textField.setText(Question.getQue(queCount));
		}
		
		public static void main(String[] args) {
			new AlphabetGameForKids();

		}


	

	}