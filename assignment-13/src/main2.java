import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class main2{
    public static void main(String args[]){

        AWTframe frame = new AWTframe("Java AWT");

    }
    static class AWTframe implements ActionListener{

        Label l;

        AWTframe(String title){
            Frame frame = new Frame(title);
            frame.setSize(400, 300);

            l = new Label();
            l.setBounds(50,50, 150,20);

            Button btn1=new Button("OK");
            btn1.setBounds(50,100,60,30);
            Button btn2=new Button("Submit");
            btn2.setBounds(120,100,60,30);
            Button btn3=new Button("Cancel");
            btn3.setBounds(190,100,60,30);

            btn1.addActionListener(this);
            btn2.addActionListener(this);
            btn3.addActionListener(this);

            frame.add(l);
            frame.add(btn1);
            frame.add(btn2);
            frame.add(btn3);

            frame.setLayout(null);
            frame.setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            l.setText(command+" Button clicked");
        }

    }
}