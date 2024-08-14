package pong;

// TODO Clean up unused imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GamePanel extends JPanel implements Runnable {
    public static final int GAME_WIDTH = 1000;
    // The height and width dimensions represent a 5:9 ratio
    public static final int GAME_HEIGHT = GAME_WIDTH * (5 / 9);
    public static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    public static final int BALL_DIAMETER = 20;
    public static final int PADDLE_WIDTH = 25;
    public static final int PADDLE_HEIGHT = 100;
    private Thread gameThread;
    private Image image;
    private Graphics graphics;
    private Random random;
    private Paddle paddle1;
    private Paddle paddle2;
    private Ball ball;
    private Score score;


    public GamePanel() {}
    public void newBall() {}
    public void newPaddles() {}
    public void paint(Graphics g) {}
    public void draw(Graphics g) {}
    public void move() {}
    public void checkCollision() {}
    public void run() {}
    public class ActionListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {}
        public void keyReleased(KeyEvent e) {}
    }
}
