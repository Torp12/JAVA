package CourseManagement;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Total extends JFrame {
	private static int z;
	
	public int getZ() {
		return z;
	}
	public static void setA(int s) {
		s = z;
	}
	Container cont;
	
   public Total(int a)
  {
	    cont = getContentPane();
		cont.setLayout(null);
				
	   getContentPane().setForeground(new Color(0, 120, 215));
	   getContentPane().setBackground(Color.LIGHT_GRAY);
	   
	   
	   JLabel total = new JLabel("Total Tuition fee for the Courses: "+a);
	   total.setHorizontalAlignment(SwingConstants.CENTER);
	   total.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
	   total.setBounds(10,64,394,200);
	   
	   cont.add(total);
	   
	   
	   
	   setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	   setSize(430, 390);
	   setTitle("Total Amount");
	   setVisible(true);
	   
	  
	  
  }
	
	
   	
}