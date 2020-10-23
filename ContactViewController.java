package GuestBook;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ContactViewController {
	JFrame frame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel inputPanel = new JPanel();
	JPanel textPanel = new JPanel();
	JPanel submitPanel = new JPanel();
	JLabel firstNameLabel = new JLabel("First Name: ");
	JLabel lastNameLabel = new JLabel("Last Name: ");
	JLabel addressLabel = new JLabel("Address: ");
	JLabel phoneNumberLabel = new JLabel("Phone Number: ");
	JTextField firstNameField = new JTextField();
	JTextField lastNameField = new JTextField();
	JTextField addressField = new JTextField();
	JTextField phoneField = new JTextField();
	JTextArea contactBook = new JTextArea();
	JScrollPane scrollpane = new JScrollPane(contactBook);
	JButton submitButton = new JButton("Submit");
	ArrayList<Contact> book = new ArrayList<Contact>();
	
	public void createContactBook() {
		frame.setVisible(true);
		frame.setLayout(new GridLayout(0, 2));
		frame.add(mainPanel, 0, 0);
		mainPanel.setLayout(new GridLayout(2, 2));
		mainPanel.add(textPanel, 0, 0);
		mainPanel.add(submitPanel, 0, 1);
		mainPanel.add(inputPanel, 1, 1);
		inputPanel.setLayout(new GridLayout(4, 0));
		inputPanel.add(phoneField, 0, 0);
		inputPanel.add(addressField, 1, 0);
		inputPanel.add(lastNameField, 2, 0);
		inputPanel.add(firstNameField, 3, 0);
		textPanel.setLayout(new GridLayout(4, 0));
		textPanel.add(phoneNumberLabel, 0, 0);
		textPanel.add(addressLabel, 1, 0);
		textPanel.add(lastNameLabel, 2, 0);
		textPanel.add(firstNameLabel, 3, 0);
		submitPanel.add(submitButton);
		frame.add(scrollpane, 0, 1);
		frame.pack();
		
		submitButton.addActionListener((ActionListener) this);
		}
	
		public void actionPerformed(ActionEvent e) {
			String a = firstNameField.getText();
			String b = lastNameField.getText();
			String c = addressField.getText();
			String d = phoneField.getText();
			firstNameField.setText("");
			lastNameField.setText("");
			addressField.setText("");
			phoneField.setText("");
			Contact entry = new Contact(a, b, c, d);
			book.add(entry);
			
			for (int i = 0; i < book.size(); i++) {
				for (int j = i + 1; j < book.size(); j++ ) {
					if (book.get(i).compareTo(book.get(j))>0) {
						Contact temp = book.get(i);
						book.set(i, book.get(j));
						book.set(j, temp);
						
					}
					if (book.get(i).compareTo(book.get(j)) == 0) {
									book.remove(j);
						
					}
					
							}
							
						}
			for (int i = 0; i < book.size(); i++) {
				contactBook.append(book.get(i).toString());
			}
					}
				
			
			
			
			


}
