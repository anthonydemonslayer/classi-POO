import java.awt.*;
import javax.swing.*;

public class ColorViewer {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String input;

		input = JOptionPane.showInputDialog("red");
		double red = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("green");
		double green = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("blue");
		double blue = Double.parseDouble(input);

		Color fillColor = new Color((float) red, (float) green, (float) blue);
		ColoredSquareComponent component = new ColoredSquareComponent(fillColor);
		frame.add(component);
		frame.setVisible(true);

	}
}
