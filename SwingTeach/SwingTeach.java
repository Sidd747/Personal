import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SwingTeach {
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JButton b2;
	
	
	
	public SwingTeach() {
		gui();
	}
	
	public void gui(){
		f = new JFrame("Creativity");
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel(new GridBagLayout());
		p.setBackground(Color.BLACK);
		
		b1 = new JButton("Action Listener");
		//lab = new JLabel("This is test label");
		b2 = new JButton("Button 2");
		
		GridBagConstraints c = new GridBagConstraints();
		
		
		c.insets = new Insets(10,10,10,10);
		c.gridx=0;
		c.gridy=1;
		
		p.add(b1,c);
		c.gridx=0;
		c.gridy=2;
		p.add(b2,c);
		
		f.add(p,BorderLayout.WEST);
		
		
		
	}
	
	public static void main(String[] args) {
		new SwingTeach();
		

	}

}
