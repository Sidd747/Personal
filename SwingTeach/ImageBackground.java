import javax.swing.*;
import java.io.*;
import javax.imageio.*;





public class ImageBackground {
	
	public static void main(String[] args) {
		JFrame F = new JFrame("Sidd's Picture");
		
		try {
			
			F.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:/Users/Siddhant/Documents/Programming/Background.png")))));
			
		}catch(IOException e) {
			System.out.println("Error occurred");
		}
		
		F.setResizable(false);
		F.pack();
		F.setVisible(true);
	}

}
