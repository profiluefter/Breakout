import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GameGUI {
	private JFrame frame = new JFrame("Breakout");

	public GameGUI() {
		frame.setLayout(null);
	}

	private class ImagePanel extends JPanel {
		private BufferedImage image;

		public ImagePanel(String filePath) {
			try {
				image = ImageIO.read(getClass().getResourceAsStream(filePath));
			} catch(IOException e) {
				System.err.println("Couldn't load image " + filePath + "!");
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image,0,0,this);
		}
	}
}
