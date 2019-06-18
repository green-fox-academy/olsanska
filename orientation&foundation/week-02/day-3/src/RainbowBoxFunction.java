import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {

        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int size = WIDTH;

        int colorWidth = 50;

        Color[] colors = new Color[7];
        colors[0] = (new Color(255, 0, 0));
        colors[1] = (new Color(255, 127, 0));
        colors[2] = (new Color(255, 255, 0));
        colors[3] = (new Color(0, 255, 0));
        colors[4] = (new Color(0, 0, 255));
        colors[5] = (new Color(75, 0, 130));
        colors[6] = (new Color(75, 0, 130));

        for (int i = 0; i <= 7; i++) {


            if (i == 0){
                graphics.setColor(colors[0]);
            }

            if (i == 1){
                graphics.setColor(colors[1]);
            }

            if (i == 2){
                graphics.setColor(colors[2]);
            }

            if (i == 3){
                graphics.setColor(colors[3]);
            }

            if (i == 4){
                graphics.setColor(colors[4]);
            }

            if (i == 5){
                graphics.setColor(colors[5]);
            }

            if (i == 6){
                graphics.setColor(colors[6]);
            }




            SquareDrawer(size, graphics.getColor(), graphics);

            size = size - colorWidth;
        }

    }

    public static void  SquareDrawer(int size, Color color, Graphics g){
        g.setColor(color);
        g.fillRect(WIDTH / 2 - (size / 2), HEIGHT / 2 - (size / 2), size, size);
    }

    /*
    int[] color = {255, 0, 0};

            if (i == 0){
                color = new int[]{255, 127, 0};
            } if (i == 1){
                color = new int[]{255, 255, 0};
            } if (i == 2){
                color = new int[]{0, 255, 0};
            } if (i == 3){
                color = new int[]{0, 0, 255};
            } if (i == 4){
                color = new int[]{75, 0, 130};
            } if (i == 5){
                color = new int[]{148, 0, 211};
            }
     */


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
