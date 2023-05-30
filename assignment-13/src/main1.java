import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class main1 {
    public static void main(String args[]) {

        AWTframe frame = new AWTframe("Java AWT");

    }

    static class AWTframe implements ActionListener {
        TextField field;

        AWTframe(String title) {
            Frame frame = new Frame(title);
            frame.setSize(400, 300);

            field = new TextField();
            field.setBounds(50, 50, 150, 20);

            Button btn = new Button("click me");
            btn.setBounds(50, 100, 60, 30);

            btn.addActionListener(this);

            frame.add(field);
            frame.add(btn);

            frame.setLayout(null);
            frame.setVisible(true);

            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
            field.setText("Welcome");
        }
    }
}