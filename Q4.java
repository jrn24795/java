/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */


package assignments;

import java.io.*;
import java.awt.Component;
import javax.swing.*;
import java.util.Collections;
import java.util.ArrayList;
public class Q4 extends JFrame {
	private static ArrayList<Iteams> product = new ArrayList<>();
	JPanel inp = new JPanel(), 
	MPan = new JPanel(), 
	Span = new JPanel(), 
	searchPanel = new JPanel(),
	editPanel = new JPanel(),
	currentPanel = MPan;
	JLabel Lab[] = { new JLabel("Product Name: "),
	new JLabel("Product ID: "),
	new JLabel("Product Price: ")};
	JTextField inputFields[] = new JTextField[5],
	Nam = new JTextField("Enter Product ID.");
	JButton searchOption = new JButton("Find pproduct");
	JButton option = new JButton("Register new product"),
	searchReturn = new JButton("Back to main menu"),
	sortChoise = new JButton("Display all people"),
	inputSubmit = new JButton("Submit"),
	sortDisplay = new JButton("Back to main menu"); 
	JTextArea searchArea = new JTextArea(), 
	fields = new JTextArea();

	protected void init() {
		//set component sizes 
		setSize(900, 500);
		setComponent(MPan, this, 900, 500, 0, 0, true);
		setComponent(inp, this, 900, 500, 0, 0, false);
		setComponent(Span, this, 900, 500, 0, 0, false);
		setComponent(searchPanel, this, 900, 500, 0, 0, false);
		setComponent(new JLabel("Welcome to the Product Files"), MPan, 300, 30, 100, 30, true);
		setComponent(option, MPan, 300, 40, 100, 100, true);
		setComponent(sortChoise, MPan, 300, 40, 100, 170, true);
		setComponent(searchOption, MPan, 300, 40, 100, 240, true);
		setComponent(sortDisplay, Span, 200, 30, 300, 10, true);
		setComponent(searchReturn, searchPanel, 300, 40, 500, 10, true);
		setComponent(searchArea, searchPanel, 300, 400, 350, 100, true);
		sortDisplay.addActionListener(event -> displayPanel(MPan));
		searchReturn.addActionListener(event -> displayPanel(MPan));
		option.addActionListener(event -> displayPanel(inp));
		searchOption.addActionListener(event -> displayPanel(searchPanel));
		sortChoise.addActionListener(event -> {
			displayPanel(Span);
			Collections.sort(product);
			for (int i = 0; i < product.size(); i++) {
				fields.setText(fields.getText() + "Product Name: " + product.get(i).getN() + "\n " + "Phone: "
						+ product.get(i).getProductNmb() + "\n " + "Email: " + product.get(i).getId() + "\n ");
			}
		});
		for (int i = 0, j = 20; i < 3; i++, j += 50) {
			setComponent(Lab[i], inp, 100, 20, 50, j, true);
			setComponent(inputFields[i] = new JTextField(), inp, 100, 20, 200, j, true);
		}
		setComponent(fields, Span, 200, 500, 200, 70, true);
		setComponent(inputSubmit, inp, 80, 40, 450, 600, true);
		inputSubmit.addActionListener(event -> {
			product.add(new Iteams(inputFields[0].getText(), inputFields[1].getText(), inputFields[2].getText()));
			displayPanel(MPan);
		});
		setComponent(Nam, searchPanel, 200, 20, 350, 10, true);
		Nam.addActionListener(event -> {
			searchArea.removeAll();
			String input = Nam.getText();
			JTextArea searchArea = new JTextArea(200, 30);
			boolean byName = input.matches("[A-Za-z]||\\s+");
			for (Iteams p : product) {
				if (input.equals(byName ? p.getN() : p.getProductNmb()))
					searchArea.setText(searchArea.getText() + p.getN() + " " + p.getProductNmb());
			}
		});
		setVisible(true);
	}

	protected void setComponent(JComponent comp, Component place, int dm, int lh, int kk, int yy, boolean v) {
		comp.setSize(dm, lh);
		comp.setLocation(kk, yy);
		if (place == this)
			((JFrame) place).add(comp);
		else
			((JComponent) place).add(comp);
		comp.setLayout(null);
		comp.setVisible(v);
	}
	public void deserializeAll() {
		product.clear();
		Iteams p = null;
		try (FileInputStream fis = new FileInputStream("productSer.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (ois.available() > 0) {
				p = (Iteams) ois.readObject();
				product.add(p);
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	//creating variables for product information
	class Iteams implements Comparable<Iteams>, Serializable {
		private String name, productNmb, Id;

		Iteams(String N, String p, String i) {
			name = N;
			productNmb = p;
			Id = i;
			serializeAll();
		}

		public String getN() {
			return name;
		}

// setting and getting product information
public void serializeAll() {
		for (Iteams p : product)
			p.serializeAll();
	}
		public void setName(String name) {
			this.name = name;
		}

		public String getProductNmb() {
			return productNmb;
		}

		public void setProductNmb(String productNmb) {
			this.productNmb = productNmb;
		}

		public String getId() {
			return Id;
		}

		public void setId(String Id) {
			this.Id = Id;
		}
		public int compareTo(Iteams p) {
			return name.compareTo(p.getN());
		}

		protected Iteams deserialize() {
			Iteams p = null;
			try (FileInputStream fis = new FileInputStream("productSer.ser");
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				p = (Iteams) ois.readObject();
			} catch (IOException | ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			return p;
		}

		public int compareTo1(Iteams o) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	protected void displayPanel(JPanel jp) {
		if (jp != currentPanel) {
			currentPanel.setVisible(false);
			currentPanel = jp;
		}
		jp.setVisible(true);
	}

	public static void main(String args[]) {
		new Q4().init();
	}

}