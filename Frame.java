/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */

package assignments;

import java.awt.*;
import javax.swing.*;

public class Frame {
	JFrame panel;
	JLabel text;
	public Frame(String title){
	panel=new JFrame();  
	
	text = new JLabel("JAC444 MIDTERM");
	text.setFont(new Font("Serif", Font.PLAIN, 36));
	panel.add(text);
	
	//create drop down panel
	String font[]={"Serif","SanSerif","Monospace"};        
	JComboBox<?> cb=new JComboBox<Object>(font);    
	cb.setBounds(225,100,150,20);    
	panel.add(cb);

	//create selective check mark button
	JCheckBox checkBox1 = new JCheckBox("Italic");  
	checkBox1.setBounds(225,175, 75,20);  
	JCheckBox checkBox2 = new JCheckBox("Bold");  
	checkBox2.setBounds(300,175, 50,20);  
	panel.add(checkBox1);  
	panel.add(checkBox2); 

	// creates radio button
	JRadioButton r1=new JRadioButton("Small");    
	JRadioButton r2=new JRadioButton("Medium");  
	JRadioButton r3=new JRadioButton("Large", true);
	r1.setBounds(175,250,75,20);    
	r2.setBounds(250,250,75,20); 
	r3.setBounds(325,250,75,20);
	ButtonGroup bg=new ButtonGroup();    
	bg.add(r1);
	bg.add(r2);
	bg.add(r3);  
	panel.add(r1);
	panel.add(r2);
	panel.add(r3); 
	
	panel.setTitle(title);
	panel.setSize(600,600); //sizes frame   
	panel.setLayout(null);
	panel.setLocationRelativeTo(null);// Center a frame
	panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.setVisible(true);
}
}
