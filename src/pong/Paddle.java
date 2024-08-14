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
    // TODO Refactor to use public constants
    public Paddle(int x, int y, int paddle_width, int paddle_height, int id) {
        super(x, y, paddle_width, paddle_height);
        this.id = id;
    }
    public void keyPressed(KeyEvent e) {}
    public void setYDirection(int yDirection) {}
    public void move() {}
    public void draw(Graphics g) {
        if (id == 1) {
            g.setColor(Color.blue);
        } else {
            g.setColor(Color.RED);
        }
        g.fillRect(x, y, width, height);
    }
}
