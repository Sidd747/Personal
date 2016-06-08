import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;






public class FinalSubmission extends JFrame {
	private JComboBox cb1;
	private JComboBox cb2;
	private JComboBox cb3;
	private JComboBox cb4;
	private JComboBox cb5;
	private JComboBox cb6;
	private JComboBox cb7;
	
	///////
	private String[] a1;
	private String[] a2;
	private String[] a3;
	private String[] a4;
	private String[] a5;
	private String[] a6;
	private String[] a7;
	
	
	
	private JButton btnSubmit;
	
	
	
	///////
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4; 
	private JLabel lb5;
	private JLabel lb6;
	private JLabel lb7;
	
	
	
	
	
	private JPanel pc;
	
	private boolean b1;
	private boolean b2;
	private boolean b3;
	private boolean b4;
	private boolean b5;
	private boolean b6;
	private boolean b7;
	
	
	
	public FinalSubmission() {
		this.setTitle("Enigma");
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		////label set up
		lb1 = new JLabel("Who orchestrated the explosion?");
		lb2 = new JLabel("What was the motive?");
		lb3 = new JLabel("Who supplied the bomb?");
		lb4 = new JLabel("Who provided funding?");
		lb5 = new JLabel("Who organized the bombing?");
		lb6 = new JLabel("Who hired the men to bomb Dmitry?");
		lb7 = new JLabel("How did the bomb get in the hotel?");
		
		
		pc = new JPanel(new GridBagLayout());
		
		
		////string array setting
		a1 = new String[]{"John Johnson and Carl Sanders", "A GRU Agent", "Sergei Barchev", "The Molotov Brothers"};
		a2 = new String[]{"Patriotism", "Corruption and foreign influence", "Personal interests", "Hired work"};
		a3 = new String[]{"The CIA", "Mossad", "The Molotov Brothers", "A weapons dealer in Murmansk"};
		a4 = new String[]{
				"Zhukov", "Sergei Barchev", "A Swiss hedgefund", "Ivanovich"
		};
		a5 = new String[] {
				"The CIA", "Mossad", "Anarchists", "Opponenets of Dmitry in next election"
		};
		a6 = new String[]{"Mossad", "The CIA", "FSB", "Vasilly"};
		a7 = new String[]{"Dropped by the Molotov Brothers", "Dropped by the CIA agents", "Dropped by Sergei Barchev", "By the man who orchestrated the bombing"};
		
	
		
		btnSubmit = new JButton("Submit Answers");
		
		
		///Combo box set up
		cb1 = new JComboBox(a1);
		cb2 = new JComboBox(a2);
		cb3 = new JComboBox(a3);
		cb4 = new JComboBox(a4);
		cb5 = new JComboBox(a5);
		cb6 = new JComboBox(a6);
		cb7 = new JComboBox(a7);
		
		
		
		
	}
	
	
	public void ScreenSetup() {
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5,5,5,5);
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		pc.add(lb1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		pc.add(cb1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		pc.add(lb2, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		pc.add(cb2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		pc.add(lb3, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		pc.add(cb3, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		pc.add(lb4, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		pc.add(cb4, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		pc.add(lb5, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		pc.add(cb5, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		pc.add(lb6, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		pc.add(cb6, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		pc.add(lb7, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 6;
		pc.add(cb7, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 7;
		pc.add(btnSubmit, gbc);
		
		
		
		
		this.add(pc, BorderLayout.CENTER);
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Solve(cb1.getSelectedItem(), cb2.getSelectedItem(), cb3.getSelectedItem(), cb4.getSelectedItem(), cb5.getSelectedItem(), cb6.getSelectedItem(), cb7.getSelectedItem());
				findResult();
			}
		});
		
		
	
	}
	
	
	public void Solve(Object e1, Object e2, Object e3, Object e4, Object e5, Object e6, Object e7) {
		if(e1.equals("A GRU Agent")) {
			b1 = true;
			
		}if(e2.equals("Corruption and foreign influence")) {
			b2 = true;
			
		}if(e3.equals("The CIA")) {
			b3 = true;
		}if(e4.equals("Zhukov")) {
			b4 = true;
		}if(e5.equals("The CIA")) {
			b5 = true;
		}if(e6.equals("Mossad")) {
			b6 = true;
		}if(e7.equals("Dropped by the CIA agents")) {
			b7 = true;
		}
		
		
		
		
		
	}
	
	
	public void findResult() {
		if(b1==true && b2==true && b3==true && b4==true && b5==true && b6==true && b7==true ) {
			JOptionPane.showMessageDialog(null, "Congratulations! You have solved the Mystery of Vladimir Dmitry");
			dispose();
			PoliticalCaseList pl = new PoliticalCaseList();
			pl.CreateList();
		} else {
			JOptionPane.showMessageDialog(null, "NO. JUST NO.");
		}
	}
	
	
	
	
	
	
}
