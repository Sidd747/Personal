import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;



public class CMainM extends JFrame {
	public  JButton btn1;
	public  JButton btn2;
	public  JButton btn3;
	public  JButton btn4;
	public  JButton btnReturn;
	private JButton btnSolved;
	private int btn1stage = 0;
	private int btn2stage = 0;
	private int btn3stage = 0;
	private int btn4stage = 0;
	
	DisplayM1 m1 = new DisplayM1();
	
	private String optA;
	private String optB;
	private String optC;
	private String optD;
	
	
	///Panels
	private JPanel pn,ps;
	private JTextArea ta;
	
	
	public CMainM(String b1,String b2, String b3, String b4) {
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
		ta = new JTextArea("In the office: " + System.lineSeparator() + 
		"Victim: My husband was killed in our house yesterday! "
		+ "USER: Its going to be alright. We will find the killer....So that day who was in the house other than you. " + System.lineSeparator()
		+ "Victim: My son and his friend. " + System.lineSeparator()
		+ "USER: Did you know his friend?" + System.lineSeparator() 
		+ "Victim: Yes, for 3 years. " + System.lineSeparator() 
		+ "USER: I will pull a few strings and see what I can do. " + System.lineSeparator()
		+ "Victim: Thank you." + System.lineSeparator()
		+ "(The Victim leaves the office)" + System.lineSeparator()
		+ "USER: So, her husband is dead, in the house there was her son and his friend." + System.lineSeparator()
		+ "(USER calls his friend, Chief Detective Carlson)" + System.lineSeparator()		
		+ "USER: So, I need to know about the murder on Blake Avenue" + System.lineSeparator()		
		+ "Carl: Oh, yeah. That case is under process, son’s friend is one of suspects" + System.lineSeparator()		
		+ "USER: I am not so sure…" + System.lineSeparator()
		+ "Carl: Suit yourself. The husband name was Ravichandran Mohandas , age 41, worked in a company called D Tech and has a wife and a son." + System.lineSeparator()
		+ "USER: Thanks Carl." + System.lineSeparator()
		+ "(Disconnects call)" + System.lineSeparator()
		+ "USER: How can it be his friend? If he had know them for this long, what is his motives?" + System.lineSeparator()
		+ "(USER goes to the and finds a group of people around it. USER enters house)" + System.lineSeparator()
		+ "USER: There seems to be signs of struggle." + System.lineSeparator()
		+ "(USER sees a shining object in the drain)" + System.lineSeparator()
		+ "(It is a phone that is damaged)" + System.lineSeparator()
		+ "USER: I wonder if it is the murderers phone." + System.lineSeparator()
		);
		ta.setEditable(false);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		ta.setPreferredSize(new Dimension(1000,700));
		
		optA = "Option A: ";
		optB = "Option B: ";
		optC = "Option C: ";
		optD = "Option D: "; 
		
		
		
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
		
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MurderCaseList mcl = new MurderCaseList();
				mcl.CreateList();
			}
		});
		
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
		if(btnopt == 1) {
			if (btn1stage == 0) {
				btn1.setText(optA + "Get it to phone repair shop ");
			} else if(btn1stage == 1) {
				btn1.setText(optA + "Yes ");
			} else if(btn1stage == 2) {
				btn1.setText(optA + "Look at inside of cabinet ");
			} else if(btn1stage == 3) {
				btn1.setText(optA + "Fire back ");
			} else if (btn1stage == 4) {
				btn1.setText(optA + "Attack them ");
			}
		} else if (btnopt == 2) {
			if (btn2stage == 0) {
				btn2.setText(optB + null);
			} else if(btn2stage == 1) {
				btn2.setText(optB + "No ");
			} else if(btn2stage == 2) {
				btn2.setText(optB + "Look in drawer ");
			} else if(btn2stage == 3) {
				btn2.setText(optB + "Leave to Sweden ");
			} else if(btn2stage == 4) {
				btn2.setText(optB + "Run away ");
			} else if(btn2stage == 5) {
				btn2.setText(optB + "Do nothing ");
			} else if(btn2stage == 6) {
				btn2.setText(optB + "Attack them ");
			}
			
		} else if (btnopt == 3) {
			if (btn3stage == 0) {
				btn3.setText(optC + null);
			} else if (btn3stage == 1) {
				btn3.setText(optC + "Look in the shelf ");
			} else if (btn3stage == 2) {
				btn3.setText(optC + "Hack into the safe ");
			} else if (btn3stage == 3) {
				btn3.setText(optC + "Jump off the ledge ");
			}
		} else {
			if (btn4stage == 0) {
				btn4.setText(optD + null);
			} else if (btn4stage == 1) {
				btn4.setText(optD + "Research more ");
			} else if (btn4stage == 2) {
				btn4.setText(optD + "Confront Floda ");
			} else if (btn4stage == 3) {
				btn4.setText(optD + "Shoot Floda ");
			} else if (btn4stage == 4) {
				btn4.setText(optD + "Finish ");
			}
		}
	}
	
	
	
	
	public void path1() {
		if (btn1stage == 0) {
			
		} 
		
		
		
		
	}
	
	public void path2() {
		
	}
	
	public void path3() {
		
	}
	
	public void path4() {
		
	}
	
	
	
	
	
}
