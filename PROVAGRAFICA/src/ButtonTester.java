import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonTester {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JButton button = new JButton("Click me!");
		frame.add(button);

		ActionListener listener = new ClickListener();
		button.addActionListener(listener);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 60;

}
