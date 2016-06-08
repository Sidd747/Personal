
import java.awt.event.*;
import javax.swing.*;


public class tutorial {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		JMenuBar mb = new JMenuBar();
		
		JMenu file = new JMenu("File");
		mb.add(file);
		JMenu edit = new JMenu("Edit");
		mb.add(edit);
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		
		f.setJMenuBar(mb);
		
	}
}
