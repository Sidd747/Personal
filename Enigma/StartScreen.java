
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class StartScreen extends JFrame {
	
	public JFrame f;
	private JPanel p;
	private JButton btn;
	private JButton btn2;
	private JButton btn3;
	private JPanel p1;
	private JLabel title;
	private JLabel subtitle;
	
	
	public StartScreen() {
		display();
		
	}
	
	public  void display()  {
		///frame set up
		f = new JFrame("Enigma");
		
		
		//setting the background image
		//try {
			//f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:/Users/Siddhant/Documents/Programming/Background.png")))));
		//} catch(IOException e) {
		//	System.out.println("Error occurred. Revise code and start again. Must be direct path to photo");
		//}
		
		
		f.setSize(500,500);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setResizable(false);
		
		
		
		
		
		///panel set up
		p = new JPanel(new GridBagLayout());
		p.setBackground(Color.BLACK);
		p1 = new JPanel(new GridBagLayout());
		p1.setBackground(Color.GRAY);
		//p.setSize(545, 1080);
		///p.setBackground(Color.BLACK);
		
		
		////SET IMAGEICON	
		//ImageIcon background = new ImageIcon("C:/Users/Siddhant/Documents/Programming/Background.png");
		
		
		
		//BackImage = new JLabel(background);
		//BackImage.setBounds(0, 0, WIDTH, HEIGHT);
		//p.add(BackImage);
		//jlbackground = new JLabel(background);
		//jlbackground.setBounds(0, 0, 1080, 1800);
		//f.add(jlbackground);
		
		
		
		
		
		
		///button set up	
		btn = new JButton("Start Game");
		btn.setSize(150, 20);
		btn2 = new JButton("Instructions");
		btn2.setSize(150, 20);
		btn3 = new JButton("Cancel");
		btn3.setSize(150, 20);
		title = new JLabel("WELCOME TO ENIGMA");
		subtitle = new JLabel("Programmed by students at Skyline High School");
		
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.insets = new Insets(15,15,15,15);
		
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		p.add(btn,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		p.add(btn2,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		p1.add(title, gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		p1.add(subtitle, gc);
		
		
		gc.gridx = 0;
		gc.gridy = 2;
		p.add(btn3,gc);
		
		f.add(p, BorderLayout.SOUTH);
		f.add(p1, BorderLayout.CENTER);
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "To work on a mystery, you will receive an email. In the email, it will offer you a random mystery to" + System.lineSeparator() + "complete.  To accept this, hit the accept button on the email and then you will be allowed to do the" + System.lineSeparator() + "mission.  If you do not want to do that mystery, then you can click the reject and you will receive a new" + System.lineSeparator() +  "email that gives you the next assignment.  In the game, there is a story line that you have to go through," + System.lineSeparator() + "there will be multiple paths that you can take to go around the mystery, and you will eventually solve" + System.lineSeparator() + "the mystery.  The game is very self-explanatory once you start playing it, so it should not be difficult to" + System.lineSeparator() + " complete.", "Instructions", JOptionPane.INFORMATION_MESSAGE, null);
			}
		});
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				StartGameScreen s = new StartGameScreen("Enigma");
				s.BuildFirst();
				
			}
		});
	}
	
	
	
	public static void main(String[] args) {
		new StartScreen();
	}
	
}	
	
