
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class StartGameScreen extends JFrame {
	
	private String title;
	
	
	
	public StartGameScreen(String temptitle) {
		
		title = temptitle;

		
		
	}



	public void BuildFirst() {
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		JPanel main = new JPanel(new GridBagLayout());
		JButton btnPolitical = new JButton("Political");
		JButton btnMurder = new JButton("Murder");
		JButton btnTheft = new JButton("Theft (coming soon) ");
		JButton btnCancel = new JButton("Cancel");
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15,15,15,15);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		main.add(btnPolitical, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		main.add(btnMurder, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		main.add(btnTheft, gbc);
		
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		main.add(btnCancel, gbc);
		
		
		
		main.setBackground(Color.DARK_GRAY);
		this.add(main, BorderLayout.CENTER);
		
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new StartScreen();
			}
		});
		
		btnPolitical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PoliticalCaseList pcl = new PoliticalCaseList();
				pcl.CreateList();
			}
		});
		
		
		btnMurder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MurderCaseList mcl = new MurderCaseList();
				mcl.CreateList();
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
	}
	



}
