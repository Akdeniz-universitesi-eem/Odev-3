import java.awt.Container;
import java.awt.Image;
import java.awt.font.ImageGraphicAttribute;
import java.io.File;
import java.util.Random;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Soru2 extends JFrame { 
	
	public static void main(String[] args) {
	Random random=new Random();
	int x=random.nextInt(7);

	Container co;
	JPanel panel;
	if (x==1) {
		String Image = "ımage1.png";

        ImageIcon icon = new ImageIcon(Soru2.class.getResource(Image));

        JLabel label = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
	}
	else if (x==2) {
		String Image = "ımage2.png";

        ImageIcon icon = new ImageIcon(Soru2.class.getResource(Image));

        JLabel label = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
		
	}
	else if (x==3) {
		String Image = "ımage3.png";

        ImageIcon icon = new ImageIcon(Soru2.class.getResource(Image));

        JLabel label = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
		
	}
	else if (x==4) {
		String Image = "ımage4.png";

        ImageIcon icon = new ImageIcon(Soru2.class.getResource(Image));

        JLabel label = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
		
	}
	else if (x==5) {
		String Image = "ımage5.png";

        ImageIcon icon = new ImageIcon(Soru2.class.getResource(Image));

        JLabel label = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
		
	}
	else {
		String Image = "ımage6.png";

        ImageIcon icon = new ImageIcon(Soru2.class.getResource(Image));

        JLabel label = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
		
	}
	}

}
