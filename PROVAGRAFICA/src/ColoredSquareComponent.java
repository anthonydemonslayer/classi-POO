import java.awt.*;
import javax.swing.*;

public class ColoredSquareComponent extends JComponent {
	private Color fillColor;

	public ColoredSquareComponent(Color aColor) {
		fillColor = aColor;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(fillColor);

		final int SQUARE_LENGTH = 100;

		Rectangle square = new Rectangle((getWidth() - SQUARE_LENGTH) / 2, (getHeight() - SQUARE_LENGTH) / 2,
				SQUARE_LENGTH, SQUARE_LENGTH);

		g2.fill(square);

	}
}
