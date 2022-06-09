/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */


package assignments;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class Q1{
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350,300);
		frame.setTitle("Seneca Registration online form");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Seneca Course Registration");
		title.setBounds(10,10,170,25);
		panel.add(title);
		
		//Make Label for ID
		JLabel id = new JLabel("Student Id:");
		id.setBounds(10, 50, 80, 25);
		panel.add(id);
		
		//Make Text Field
		JTextField num = new JTextField(20);
		num.setBounds(100, 50, 165, 25);
		panel.add(num);
		
		//Make Label for First Name
		JLabel first = new JLabel("First Name:");
		first.setBounds(10, 80, 80, 25);
		panel.add(first);
		
		//Make Text Field
		JTextField fName = new JTextField(20);
		fName.setBounds(100,80,165,25);
		panel.add(fName);
		
		//Make Label for Last Name
		JLabel last = new JLabel("Last Name:");
		last.setBounds(10, 110, 80, 25);
		panel.add(last);
		
		//Make Text Field
		JTextField lName = new JTextField(20);
		lName.setBounds(100,110,165,25);
		panel.add(lName);
		
		//Make Label for Email
		JLabel email = new JLabel("Email:");
		email.setBounds(10, 140, 80, 25);
		panel.add(email);
		
		//Make Text Field
		JTextField mail = new JTextField(20);
		mail.setBounds(100,140,165,25);
		panel.add(mail);
		
		//Create buttons
		JButton login = new JButton("Create new Student");
		login.setBounds(10,180,150,25);
		panel.add(login);
		
		JButton clear = new JButton("View/Edit Student");
		clear.setBounds(190,180,150,25);
		panel.add(clear);
	}
}