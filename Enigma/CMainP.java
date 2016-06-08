import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class CMainP extends JFrame{

	
	///Buttons
	public  JButton btn1;
	public  JButton btn2;
	public  JButton btn3;
	public  JButton btn4;
	public  JButton btnReturn;
	private JButton btnSolved;
	
	///Panels
	private JPanel pn,ps;
	private JTextArea ta;
	
	///calling up class
	Display dp = new Display();
	
	///stage crap
	private int btn1stage, btn2stage, btn3stage, btn4stage;
	
	///Generic String sets
	private String optA;
	private String optB;
	private String optC;
	private String optD;
	
	
	///arrays to text area
	private String[] p1;
	private String[] p2;
	private String[] p3;
	private String[] p4;
	
	private boolean b1 = false;
	private boolean b2 = false;
	
	
	
	public CMainP(String b1, String b2, String b3, String b4) {
		super("Enigma");
		
		///Button setup
		
		
		btn1 = new JButton(b1);
		btn1.setPreferredSize(new Dimension(300,50));
		btn2 = new JButton(b2);
		btn2.setPreferredSize(new Dimension(300,50));
		btn3 = new JButton(b3);
		btn3.setPreferredSize(new Dimension(300,50));
		btn4 = new JButton(b4);
		btn4.setPreferredSize(new Dimension(300,50));
		btnReturn = new JButton("Return to Missions");
		btnReturn.setPreferredSize(new Dimension(300,50));
		btnSolved = new JButton("I have solved the case");
		btnSolved.setPreferredSize(new Dimension(300,50));
		
		
		
		///Panels setup
		
		
		pn = new JPanel(new BorderLayout());
		ps = new JPanel(new GridBagLayout());
		
		
		
		
		
		
		
		
		///text area setting up
		ta = new JTextArea("Minister Sogu: " + System.lineSeparator() + 
		"Thank you for joining the investigation.  "
		+ "I have assembled a crew to work with you on this mission. " + System.lineSeparator()
		+ "Devin Mitnick is world-renowned for his hacking skills in hacking the US Department of Defense and the British Parliament; he can get into any server or phone in the world. " + System.lineSeparator()
		+ "Do you have any questions?");
		ta.setEditable(false);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		ta.setPreferredSize(new Dimension(1000,700));
		
		
		////Make the generic options
		optA = "Option A:";
		optB = "Option B:";
		optC = "Option C:";
		optD = "Option D:";
		

	}
	
	public void ScreenBuild() {
		this.setTitle("Enigma");
		this.setSize(1000,1000);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,10,10);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		ps.add(btn1, gbc);
		
	
		gbc.gridx = 0;
		gbc.gridy = 2;
		ps.add(btn2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		ps.add(btn3, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		ps.add(btn4,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		ps.add(btnReturn, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 5;
		ps.add(btnSolved, gbc);
		
		
		
		
		
		
		pn.add(ta, BorderLayout.CENTER);
		
		
		this.add(pn, BorderLayout.NORTH);
		this.add(ps, BorderLayout.SOUTH);
		
		
		/////All the action listeners
		
		
		///Return button
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PoliticalCaseList pcl = new PoliticalCaseList();
				pcl.CreateList();
			}
		});
		
		
		/////First option button
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(null);
				path1();
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(null);
				path2();
			}
		});	
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(null);
				path3();
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(null);
				path4();
			}
		});
		
		btnSolved.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FinalSubmission fs = new FinalSubmission();
				fs.ScreenSetup();
			}
		});
		
		
		
	}	
	
	
	public void setBtnStage( int btnstage,int btnnumber) {
		if(btnnumber == 1) {
			btn1stage  = btnstage;
		} else if (btnnumber == 2) {
			btn2stage = btnstage;
		} else if (btnnumber ==3) {
			btn3stage = btnstage;
		} else {
			btn4stage = btnstage;
		}
		
	}
	
	public void setBtnText(int btnopt) {
		if(btnopt == 1){
				if (btn1stage == 1) {
					btn1.setText(optA + " Go talk to Sergei Barchev ");
				} else if (btn1stage == 0) {
					btn1.setText(optA + " Which hotel did this take place in? ");
				} 
				
		}else if (btnopt == 2) {
				if (btn2stage ==1) {
					btn2.setText(optB + " Talk to the enemies of Dmitry ");
				}else if (btn2stage == 0) {
					btn2.setText(optB + " Did Dmitry have any enemies? ");
				}else if(btn2stage ==2) {
					btn2.setText(optB + " Compare descriptions with the CIA ");
				}
				
		}else if (btnopt == 3) {
			if (btn3stage ==0) {
				btn3.setText(optC + " No, I'll go home to do research. ");
			} else {
			System.out.println("Error: This value in the button is non-changing ");
			}
		} if(b1 == true && b2 ==true) {
			btn2.setText(optB + " Compare descriptions with the CIA ");
		}
		else {
			if (btn4stage == 1) {
				btn4.setText(optD + " Go to the Hotel Metropol to investigate ");
			} else if (btn4stage == 2) {
				btn4.setText(optD + " Go to Molotov Brothers plumbing ");
			} else if (btn4stage == 0) {
				btn4.setText(optD + " Yes, when do I start? ");
			} 
			
		}
	}
	
	public void path1() {
		if (btn1stage == 0) {
			p1 = dp.getDisText(1,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			setBtnText(1);
		} else if (btn1stage == 1){
			p1 = dp.getDisText(1,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			setBtnStage(0,1);
			setBtnStage(1,2);
			setBtnText(1);
			setBtnText(2);
		} 
		
		for(int i = 0; i<p1.length; i++) {
			ta.append(p1[i] + System.lineSeparator());
		}
	}
	
	public void path2() {
		if(btn2stage ==0) {
			p1 = dp.getDisText(2,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			setBtnStage(1,2);
			setBtnText(2);
		} else if (btn2stage == 1) {
			p1 = dp.getDisText(2,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			
			setBtnText(1);
			
			
			b1 = true;
			setBtnText(2);
			
		} else if (btn2stage ==2){
			p1 = dp.getDisText(2,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			
		}
		
		for(int i = 0; i<p1.length; i++) {
			ta.append(p1[i] + System.lineSeparator());
		}
		
	}
	
	public void path3() {
		if (btn3stage==0) {
			p1 = dp.getDisText(3,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			setBtnStage(0,3);
			setBtnText(3);
		} else {
			System.out.println("Error");
		}
		
		for(int i = 0; i<p1.length; i++) {
			ta.append(p1[i] + System.lineSeparator());
		}
		
		
	}
	
	public void path4() {
		if(btn4stage==0) {
			p1 = dp.getDisText(4,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			setBtnStage(1,4);
			setBtnStage(1,2);
			setBtnText(2);
			setBtnText(4);
		} else if(btn4stage ==1) {
			p1 = dp.getDisText(4,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			setBtnStage(2,4);
			setBtnStage(1,1);
			setBtnText(1);
			setBtnText(4);
			
		} else if(btn4stage ==2) {
			p1 = dp.getDisText(4,btn1.getText(), btn2.getText(), btn3.getText(), btn4.getText());
			setBtnStage(1,2);
			setBtnText(2);
			setBtnStage(0,1);
			b2 = true;
			setBtnText(1);
		}  else {
			System.out.println("nullify");
		}
		
		for(int i = 0; i<p1.length; i++) {
			ta.append(p1[i] + System.lineSeparator());
		}
		
		
	}
	
	
	

	
	
}
