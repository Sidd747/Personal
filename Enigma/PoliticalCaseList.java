import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PoliticalCaseList extends JFrame {
	public PoliticalCaseList() {
		
	}
	
	public void CreateList() {
		this.setTitle("Enigma");
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		
		JPanel panelNorth = new JPanel(new FlowLayout());
		JPanel panelCenter = new JPanel(new FlowLayout());
		JPanel panelSouth = new JPanel(new FlowLayout());
		JLabel labelCase1 = new JLabel("Case 1: The Mystery of Vladimir Dmitry, Russian President. ");
		JLabel labelCase2 = new JLabel("Case 2: The Mystery of Siddhant Devaru, United States President. ");
		JLabel labelCase3 = new JLabel("Case 3: The Mystery of Naren Anandh, Indian Prime Minister. ");
		JButton btnCase1info = new JButton("Info");
		JButton btnCase1select = new JButton("Next");
		JButton btnCase2info = new JButton("Info");
		JButton btnCase2select = new JButton("Next");
		JButton btnCase3info = new JButton("Info");
		JButton btnCase3select = new JButton("Next");
		JButton btnBack = new JButton("Return");
		btnBack.setPreferredSize(new Dimension(300,50));
		
		/*labelCase1.setSize(10, 70);
		panelNorth.add(labelCase1);
		panelNorth.add(btnCase1info, null);
		panelNorth.add(btnCase1select,null);
		this.add(panelNorth, BorderLayout.NORTH);
		*/
		
		
		labelCase1.setSize(10, 70);
		panelCenter.add(labelCase1);
		panelCenter.add(btnCase1info, null);
		panelCenter.add(btnCase1select,null);
		panelCenter.add(labelCase2);
		panelCenter.add(btnCase2info, null);
		panelCenter.add(btnCase2select);
		panelCenter.add(labelCase3);
		panelCenter.add(btnCase3info, null);
		panelCenter.add(btnCase3select);
		panelCenter.add(btnBack);
		this.add(panelCenter, BorderLayout.CENTER);
		
		
		btnCase1info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Vladimir Dmitry" + System.lineSeparator() + 
						"On September 25, 2015, Russian President Vladimir Dmitry was on his tour of Murmansk, gaining support for his election the following month." + System.lineSeparator() + 
						"At 2000 hours, President Dmitry was in his hotel room when a fiery explosion blew the entire penthouse suite, along with the floor below, into oblivion." + System.lineSeparator() + 
						"There were 100 FSO agents killed on the floor below and 60 FSB agents on the floor above, along with the president." + System.lineSeparator() + 
						"The body was never recovered, most of the items were disintegrated." + System.lineSeparator() + 
						"Your mission, should you choose to accept it, is to recover the body if possible as well as find out who murdered Dmitry and why they did it." + System.lineSeparator() + 
						"Thanks," + System.lineSeparator() + 
						"Sergei  Sogu" + System.lineSeparator() + 
						"Minister of Defense, Head of FSB" );
			}			
		});
		
		btnCase2info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Blah blah blah");
			}			
		});
		
		btnCase3info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Blah blah blah");
			}			
		});
		
		btnCase1select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CMainP polcase1 = new CMainP("Option A: Which hotel did this take place in? ", "Option B: Did Dmitry have any enemies? ", "Option C: No, I'll go home to do research. ", "Option D: Yes, when do I start? ");
				polcase1.ScreenBuild();
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StartGameScreen sgs = new StartGameScreen("Enigma");
				sgs.BuildFirst();
			}
		});
		
		
		
		
		
		
	}
	
	
	
}
