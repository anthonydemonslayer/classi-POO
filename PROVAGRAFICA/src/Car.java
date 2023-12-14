import java.awt.*;
import java.awt.geom.*;

public class Car {

	public static int WIDTH = 60;
	public static int HEIGHT = 30;
	private int xLeft;
	private int yTop;

	public Car(int x, int y) {
		xLeft = x;
		yTop = y;
	}

	public void disegna(Graphics2D g2) {
		Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
		Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
		Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
		Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
		Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);
		Line2D.Double frontWindShield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindShield = new Line2D.Double(r3, r4);

		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindShield);
		g2.draw(roofTop);
		g2.draw(rearWindShield);

	}
}
