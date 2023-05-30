import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class main3 {
    public static void main(String args[]) {
        AWTframe frame = new AWTframe("Message");
    }

    static class AWTframe implements ItemListener {
        CheckboxGroup cbg;
        Checkbox cb1, cb2, cb3, cb4;
        Label l;

        AWTframe(String title) {
            Frame frame = new Frame(title);
            frame.setSize(400, 300);

            l = new Label("Select a message");

            cbg = new CheckboxGroup();
            cb1 = new Checkbox("Hello", cbg, false);
            cb2 = new Checkbox("BYE", cbg, false);
            cb3 = new Checkbox("Good Morning", cbg, false);
            cb4 = new Checkbox("Good Night", cbg, false);

            cb1.addItemListener(this);
            cb2.addItemListener(this);
            cb3.addItemListener(this);
            cb4.addItemListener(this);

            frame.add(l);
            frame.add(cb1);
            frame.add(cb2);
            frame.add(cb3);
            frame.add(cb4);

            frame.setLayout(new FlowLayout(FlowLayout.CENTER));
            frame.setVisible(true);

        }
        public void itemStateChanged(ItemEvent e) {
            String message = cbg.getSelectedCheckbox().getLabel();
            l.setText(message);
        }
    }
}