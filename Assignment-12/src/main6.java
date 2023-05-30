import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class main6 {
    public static void main(String args[]) {

        AWTframe frame = new AWTframe("Drawing");

    }

    static class AWTframe {
        AWTframe(String title) {
            Frame frame = new Frame(title);
            frame.setSize(800, 600);

            frame.add(new MyCanvas());

            frame.setLayout(null);
            frame.setVisible(true);

            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }

    static class MyCanvas extends Canvas {
        MyCanvas() {
            setBackground(Color.WHITE);
            setSize(700, 600);
        }

        public void paint(Graphics window) {
            Graphics2D g2 = (Graphics2D) window;
            Stroke oldStroke = g2.getStroke();
            g2.setStroke(new BasicStroke(4));

            int x[] = {100, 250, 300, 50};
            int y[] = {50, 50, 150, 150};
            int numberofpoints = 4;

            window.setColor(new Color(255,127,39));
            window.fillPolygon(x, y, numberofpoints);
            window.setColor(Color.BLACK);
            window.drawPolygon(x, y, numberofpoints);

            window.setColor(new Color(255,242,0));
            window.fillRect(50, 150, 250, 150);
            window.setColor(Color.BLACK);
            window.drawRect(50, 150, 250, 150);

            window.setColor(new Color(34,177,76));
            window.fillRect(145, 180, 60, 120);
            window.setColor(Color.BLACK);
            window.drawRect(145, 180, 60, 120);

            window.setColor(new Color(153,217,234));
            window.fillOval(75, 180, 50, 50);
            window.setColor(Color.BLACK);
            window.drawOval(75, 180, 50, 50);

            window.setColor(new Color(153,217,234));
            window.fillOval(225, 180, 50, 50);
            window.setColor(Color.BLACK);
            window.drawOval(225, 180, 50, 50);

            window.setColor(new Color(0,162,232));
            window.fillOval(50, 320, 250, 50);
            window.setColor(Color.BLACK);
            window.drawOval(50, 320, 250, 50);

            g2.setStroke(oldStroke);

        }
    }
}