import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends Rectangle{

	Random random;
	int xVelocity;
	int yVelocity;
	int ballSpeed = 5;
	
	Ball(int X, int Y, int BALL_WIDTH, int BALL_HEIGHT) {
		super(X, Y, BALL_WIDTH, BALL_HEIGHT);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		int randomYDirection = random.nextInt(2);
		
		if (randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection * ballSpeed);
		
		if (randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection * ballSpeed);
		
	}
	
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}
	public void move(){
		x += xVelocity;
		y += yVelocity;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(x, y, width, height);
	}
}
