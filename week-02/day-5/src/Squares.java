import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

    public static void mainDraw(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(0,0, WIDTH, HEIGHT);
        g.setColor(Color.black);
        square(0, 0, 500,  g);
    }

    public static void square(int x, int y, int size, Graphics g) {
        if (size <= 1) {
            return;
        }
        g.drawRect(x, y + size / 3, size / 3, size / 3);
        g.drawRect(x + size /3, y, size / 3, size / 3);
        g.drawRect(x + (size / 3) * 2, y + size / 3, size / 3, size / 3);
        g.drawRect(x + size / 3, y + (size / 3) * 2, size / 3, size / 3);
        square(x, y + size / 3, size / 3, g);
        square(x + size /3, y, size / 3, g);
        square(x + (size / 3) * 2, y + (size/3), size / 3, g);
        square(x + (size / 3), y + (size/3) * 2, size / 3, g);
    }
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}