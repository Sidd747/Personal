import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MurderCaseList extends JFrame {
	public MurderCaseList() {
		
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
		JLabel labelCase1 = new JLabel("Case 1: The Mystery of Ravichandran Mohandas, Manager of DTech.");
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
				JOptionPane.showMessageDialog(null,"Ravichandran Mohandas" + System.lineSeparator() + 
						"My husband was murdered in our house last night. The police are convinced that it was " + System.lineSeparator() + 
						"my friend’s son. But, I know it isn’t him. Someone is trying to cover this up. Please help me…." + System.lineSeparator() + 
						"" + System.lineSeparator() + 
						"" + System.lineSeparator() + 
						"" + System.lineSeparator() + 
						"Sincerely, " + System.lineSeparator() + 
						"Avanthi Mohandas" + System.lineSeparator() + 
						"" );
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
				
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StartGameScreen sgs = new StartGameScreen("Enigma");
				sgs.BuildFirst();
			}
		});
		
		btnCase1select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CMainM mcase1 = new CMainM("Option A: Get it to the Phone Repair Shop ", "Option B:  ", "Option C:  ", "Option D:  ");
				mcase1.ScreenBuild();
			}
		});
		
		
		
		
	}
}
