package CourseManagement;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Info extends JFrame implements ActionListener{
     JTable table;
     
     JButton button;
     JButton button2;
     
    
    
     public Info(){


         super("Course Info");
         super.setVisible(true);
         

         
         Object row[][] = { {"CSE","215","2","3"},{"CSEL","215","2","1"},{"MGT","212","2","3"},{"PHY","107","1","3"},{"MAT","120","1","3"},{"ENG","102","1","3"},{"POL","101","1","3"},{"CHE","102","1","3"},{"PHY","108","1","3"},{"EEE","154","1","1"}};
         Object column[] = {"Course","Number","Level","Credit"};
         //Bind Data In JTable
         table = new JTable(row, column);
         table.setBackground(Color.RED);
         table.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));




         JScrollPane js = new JScrollPane(table);
         js.setBounds(20,20,440,350);
         
         button = new JButton("Export to Text File");
         button.setBounds(120, 380, 250, 30);
          button2 = new JButton("Back");
         
         
        button.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               try{
                //the file path
               File file = new File("C:\\Users\\Maher\\eclipse-workspace\\CourseManagement\\src\\CourseManagement\\text.txt");
               //if the file not exist create one
               if(!file.exists()){
                   file.createNewFile();
               }
               
               FileWriter fw = new FileWriter(file.getAbsoluteFile());
               BufferedWriter bwrite = new BufferedWriter(fw);
               
               //loop for the table rows
               for(int i = 0; i < table.getRowCount(); i++){
                   //loop for the table columns
               for(int j = 0; j < table.getColumnCount(); j++){
                       bwrite.write(table.getModel().getValueAt(i, j)+" ");
                   }
                   //break line at the begin 
                   //break line at the end 
                   bwrite.write("\n");
               }
               //close BufferedWriter
               bwrite.close();
               //close FileWriter 
               fw.close();
               
               
               }catch(Exception ex){
            	   System.out.println("An error occurred");
                   ex.printStackTrace();
               }
               table.setBackground(Color.LIGHT_GRAY);
               
           }
        });

         getContentPane().add(button);
         getContentPane().add(js);
         getContentPane().setLayout(null);
         setSize(500, 500);
         getContentPane().setBackground(Color.GRAY);
         button2.setBounds(201, 421, 89, 23);
         getContentPane().add(button2);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
         
         

		
					
				
			
        	 
         
     button2.addActionListener(new ActionListener() { 
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button2) {
		
		setVisible(false);
		
		
	}
}
});
}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}