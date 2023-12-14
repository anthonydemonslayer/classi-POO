import javax.swing.*;

public class RectangleViewer {

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Nuovo JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		frame.setVisible(true);
	}

}
