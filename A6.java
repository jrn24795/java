package assignments;
import javax.swing.*;

@SuppressWarnings("serial")
public class A6 extends JFrame {
	
	private JPanel panel;
	
	public A6(String title) {
		
		panel = new JPanel();
		
		//create drop down panel
		String font[]={"Serif","SanSerif","Monospace"};        
	    JComboBox<?> cb=new JComboBox<Object>(font);    
	    cb.setBounds(50, 50,90,20);    
	    panel.add(cb);
	    
	    //create selective check mark button
	    JCheckBox checkBox1 = new JCheckBox("Italic");  
        checkBox1.setBounds(100,100, 50,50);  
        JCheckBox checkBox2 = new JCheckBox("Bold");  
        checkBox2.setBounds(100,150, 50,50);  
        panel.add(checkBox1);  
        panel.add(checkBox2); 
        
        // creates radio button
        JRadioButton r1=new JRadioButton("Small");    
        JRadioButton r2=new JRadioButton("Medium");  
        JRadioButton r3=new JRadioButton("Large");
        r1.setBounds(75,50,100,30);    
        r2.setBounds(75,100,100,30); 
        r2.setBounds(75,150,100,30);
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);  
        panel.add(r1);
        panel.add(r2);
        panel.add(r3); 
		
		this.add(panel);		
		this.setTitle(title);
		this.setSize(600, 600); // Set the frame size
		this.setLayout(null);
		this.setLocationRelativeTo(null);// Center a frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); // Display the frame
		this.setResizable(false);
	}

	public static void main(String[] args) {
		Q6 myFrame = new Q6("FontViewer");
	}
}