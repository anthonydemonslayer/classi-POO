import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Color rosso = Color.red;
		g2.setColor(rosso);
		
		
		Car car1 = new Car(0, 0);
		
		int x = getWidth() - Car.WIDTH;
		int y = getHeight() - Car.HEIGHT;

		Car car2 = new Car(x, y);

		car1.disegna(g2);
		car2.disegna(g2);
	}
}
