import java.awt.*;

public class main2 extends Frame {
    public main2() {

        setTitle("Color Text");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.RED);
        g.drawString("This is red text", 50, 50);
        g.setColor(Color.GREEN);
        g.drawString("This is green text", 50, 80);
        g.setColor(Color.BLUE);
        g.drawString("This is blue text", 50, 110);
    }
    public static void main(String args[]) {
        main2 a2 = new main2();
    }
}
