import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class test2 {
	
	
	String[] items = {"Steve","Simon","Chris", "Matt"};
	JComboBox c = new JComboBox(items);
	JButton b = new JButton("Print");
	JLabel l = new JLabel("Display Combo items");
	
	
	
	public test2() {
		frame();
	}
	
	public void frame() {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.add(c);
		p.add(b);
		p.add(l);
		
		
		f.add(p);
		
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = c.getSelectedItem().toString();
				l.setText(s);
				
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new test2();

	}

}
