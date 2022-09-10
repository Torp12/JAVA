package CourseManagement;


import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WelcomePage extends sumtotal implements ActionListener {

	private JFrame frame = new JFrame(); 
	private JLabel welcomeLabel ;
    private	JButton add , remove , seeinfo, back , clear;
	
    Container con;
    private JTable table;
    private JTextField no;
    private JTextField n;
    private JLabel credits;
    private JLabel label;
    private JTextField c;
    private JTextField l;
    private JScrollPane scrollPane;
	
    private String str;
    DefaultTableModel model;
    private JButton mycourses;
    
   private int s , a;
   private JButton cost;
    
public int sum(int a, int b) {
		s=0;
		for(int i=1;i<=b;i++) 
		{
			if(a==3) 
			{
			s+=a*6500;
			}
		}
		return s;
	}

    
    
    WelcomePage(){
		frame.getContentPane().setForeground(new Color(0, 120, 215));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(777, 587);
		
		frame.setTitle("Home Page");
		
		
		con = frame.getContentPane();
		con.setLayout(null);
				
		welcomeLabel = new JLabel("Hello Student");
		welcomeLabel.setForeground(new Color(0, 0, 0));
		welcomeLabel.setBackground(new Color(240, 240, 240));
		welcomeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		welcomeLabel.setBounds(296,0,154,35);
		welcomeLabel.setFont(new Font("Ebrima", Font.BOLD, 23));
		
		table = new JTable();
		model = new DefaultTableModel();
		Object[] column = {"Priority No","Name: ","Credits: ","Course No: "} ;
		Object[] row = new Object[4];
		
		add = new JButton("Add Course");
		add.setFont(new Font("Tahoma", Font.BOLD, 11));
		add.setForeground(Color.BLACK);
		add.setBackground(Color.GRAY);
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				if(no.getText().equals("")||n.getText().equals("")||c.getText().equals("")||l.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please complete filling up the information");
				}
				else if((n.getText().equals("CSE")||n.getText().equals("CSEL")||n.getText().equals("MGT")||n.getText().equals("PHY")||n.getText().equals("MAT")||n.getText().equals("ENG")||n.getText().equals("POL")||n.getText().equals("CHE")||n.getText().equals("PHY")||n.getText().equals("EEE"))) {
					
					row[0] = no.getText();
					row[1] = n.getText();
					row[2] = c.getText();
					row[3] = l.getText();
					str = c.getText();
					model.addRow(row);
					
					no.setText("");
					n.setText("");
					c.setText("");
					l.setText("");
					JOptionPane.showMessageDialog(null, "Saved!");
				}
				else if (c.getText()!="3") {
					JOptionPane.showMessageDialog(null, "Must be a course of 3 credits",null, JOptionPane.ERROR_MESSAGE);
				}
				else
					
				JOptionPane.showMessageDialog(null, "Course is not available in course list",null, JOptionPane.ERROR_MESSAGE);
				
				}
			}
				
		);
		add.setBounds(73,451,100,25);
		//add.addActionListener (this);
		
		
		remove = new JButton("Remove Course");
		remove.setFont(new Font("Tahoma", Font.BOLD, 11));
		remove.setBackground(Color.GRAY);
		remove.setBounds(213,451,140,25);
		remove.addActionListener (this);
		
		
		seeinfo = new JButton("See Courses");
		seeinfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		seeinfo.setBackground(Color.GRAY);
		seeinfo.setBounds(567,451,120,25);
		seeinfo.addActionListener (this);
		
		
	    back=new JButton("Back");
	    back.setFocusable(false);
	    back.setFont(new Font("Tahoma", Font.BOLD, 11));
	    back.setForeground(Color.BLACK);
	    back.setBackground(Color.GRAY);
		back.setBounds(610, 499, 89, 25);
		back.addActionListener(this);
		
		frame.getContentPane().add(back);
		frame.setVisible(true);
		
		
		con.add(add);
		con.add(welcomeLabel);
		con.add(remove);
		con.add(seeinfo);
		con.add(back);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(89, 68, 574, 208);
		frame.getContentPane().add(scrollPane);
		
		
		
		
		
		
		
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JLabel number = new JLabel("Priority No :");
		number.setFont(new Font("Tahoma", Font.BOLD, 11));
		number.setBounds(57, 320, 68, 14);
		frame.getContentPane().add(number);
		
		JLabel name = new JLabel("Name: ");
		name.setFont(new Font("Tahoma", Font.BOLD, 11));
		name.setForeground(Color.BLACK);
		name.setBackground(Color.BLACK);
		name.setBounds(57, 364, 68, 14);
		frame.getContentPane().add(name);
		
		clear = new JButton("Clear");
		clear.setFont(new Font("Tahoma", Font.BOLD, 11));
		clear.setBackground(Color.GRAY);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                no.setText("");
                n.setText("");
                c.setText("");;
                l.setText("");
            }
        });
        clear.setBounds(393, 451, 120, 25);
        frame.getContentPane().add(clear);
		
		no = new JTextField();
		no.setBackground(Color.WHITE);
		no.setBounds(129, 317, 105, 20);
		frame.getContentPane().add(no);
		no.setColumns(10);
		
		n = new JTextField();
		n.setBounds(129, 361, 105, 20);
		frame.getContentPane().add(n);
		n.setColumns(10);
		
		credits = new JLabel("Credits: ");
		credits.setFont(new Font("Tahoma", Font.BOLD, 11));
		credits.setBounds(365, 320, 67, 14);
		frame.getContentPane().add(credits);
		
		label = new JLabel("Course No: ");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(364, 364, 68, 14);
		frame.getContentPane().add(label);
		label.setVisible(true);
		
		c = new JTextField();
		c.setBounds(437, 317, 100, 20);
		frame.getContentPane().add(c);
		c.setColumns(10);
		
		l = new JTextField();
		l.setBounds(437, 361, 100, 20);
		frame.getContentPane().add(l);
		l.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Tahoma", Font.BOLD, 11));
		submit.setBackground(Color.GRAY);
        submit.setBounds(390, 500, 89, 23);
        frame.getContentPane().add(submit);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File newfile = new File("C:\\\\Users\\\\Maher\\\\eclipse-workspace\\\\CourseManagement\\\\src\\\\CourseManagement\\\\saved.txt");
                    if(!newfile.exists()) {
                        newfile.createNewFile();
                    }
                    FileWriter write=new FileWriter(newfile.getAbsoluteFile());
                    BufferedWriter buffer = new BufferedWriter(write);

                    for(int i=0;i<table.getRowCount();i++) {
                        for(int j=0;j<table.getColumnCount();j++) {
                            buffer.write((String)table.getModel().getValueAt(i, j)+" ");
                        }
                        buffer.write("\n");
                    }
                    buffer.close();
                    write.close();
                    JOptionPane.showMessageDialog(null,"Saved to Database");

                }
                catch(Exception ex) {
                    System.out.println("An error occurred");
                       ex.printStackTrace();
                   }

                }

        });
		
		mycourses = new JButton("My Courses");
		mycourses.setFont(new Font("Tahoma", Font.BOLD, 11));
		mycourses.setBackground(Color.GRAY);
		 mycourses.addActionListener(new ActionListener() {
	        	@Override
	            public void actionPerformed(ActionEvent e){
	        	try{
	                //the file path
	               File file = new File("C:\\\\Users\\\\Maher\\\\eclipse-workspace\\\\CourseManagement\\\\src\\\\CourseManagement\\\\saved.txt");
	               Desktop desktop = Desktop.getDesktop();  
	               if(file.exists())         //checks file exists or not  
	               desktop.open(file);              //opens the specified file  
	               } 
	        	catch(Exception ep) {
	        		ep.printStackTrace();  
	        	}
	        	}
	        });
		mycourses.setBounds(73, 500, 111, 23);
		frame.getContentPane().add(mycourses);
		
		cost = new JButton("Cost");
		cost.setFont(new Font("Tahoma", Font.BOLD, 11));
		cost.setBackground(Color.GRAY);
		cost.addActionListener(this);
		cost.setBounds(234, 500, 89, 23);
		frame.getContentPane().add(cost);
		
	
	}
    
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==remove) {
			int i=table.getSelectedRow();
			if(i>=0) {
				model.removeRow(i);
				JOptionPane.showMessageDialog(null,"Deletion Successful");
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Please select a row first");
			}
		}
		 if(e.getSource()==cost)
			 {
			   
              sum(Integer.parseInt(str) , table.getRowCount());
				new Total(s);
				//frame.dispose();
			}
		
		if(e.getSource()==seeinfo) {
			new Info();
			
			 
		}
		if(e.getSource()==back) {
			new Login();
			frame.dispose();
		}
		
	}


}