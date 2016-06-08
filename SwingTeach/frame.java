import javax.swing.*;
import java.awt.event.*;




public class frame {

	public frame() {
		test();
	}
	
	public void test() {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		JButton b1 = new JButton("Action Listener");
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Action Listener is working");
			}
			
			
		});
		
		
		
		p.add(b1);
		f.add(p);
	}
	
	
	public static void main(String[] args) {
		new frame();

	}

}
