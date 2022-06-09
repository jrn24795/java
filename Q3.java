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

public abstract class Q3 implements ActionListener{
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(390,230);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Welcome to the ATM");
		title.setBounds(50,10,120,25);
		title.setForeground(Color.red);
		panel.add(title);
		
		//Make Label for Card Number
		JLabel CardNum = new JLabel("Card Number:");
		CardNum.setBounds(10, 50, 80, 25);
		panel.add(CardNum);
		
		//Make Text Field
		JTextField cNum = new JTextField(20);
		cNum.setBounds(100, 50, 165, 25);
		panel.add(cNum);
		
		//Make Label for Password
		JLabel Pass = new JLabel("Password:");
		Pass.setBounds(10, 80, 80, 25);
		panel.add(Pass);
		
		//Make Password Field
		JPasswordField pWord = new JPasswordField();
		pWord.setBounds(100,80,165,25);
		panel.add(pWord);
		
		//Make button
		JButton login = new JButton("Login");
		login.setBounds(10,130,80,25);
		panel.add(login);
		
		JButton clear = new JButton("Clear");
		clear.setBounds(150,130,80,25);
		panel.add(clear);
		clear.addActionListener(new ActionListener() {

			//Action listener for button
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cNum.setText(null);
				pWord.setText(null);
			}
			
		});
	}
}