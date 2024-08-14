package pong;

// TODO Clean up unused imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Paddle extends Rectangle {
    // The id specifies which player the paddle belongs to
    private final int id;
    private int yVelocity;
    private int speed;
    // TODO Refactor to use public constants
    public Paddle(int x, int y, int paddle_width, int paddle_height, int id) {
        super(x, y, paddle_width, paddle_height);
        this.id = id;
        speed = 10;
    }
    public void keyPressed(KeyEvent e) {
        switch(id) {
            // Paddle movement for player 1
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                }
                else if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
                break;
            // Paddle movement for player 2
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                    move();
                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                    move();
                }
                break;
        }
    }
    // TODO Refactor to reduce repetition and switch statements
    public void keyReleased(KeyEvent e) {
        switch(id) {
            // Paddle movement for player 1
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(0);
                    move();
                }
                else if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }
                break;
            // Paddle movement for player 2
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(0);
                    move();
                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0);
                    move();
                }
                break;
        }
    }
    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }
    public void move() {
        // y and x are inherited properties from the Rectangle parent class
        y += yVelocity;
    }
    public void draw(Graphics g) {
        if (id == 1) {
            g.setColor(Color.blue);
        } else {
            g.setColor(Color.RED);
        }
        g.fillRect(x, y, width, height);
    }
}
