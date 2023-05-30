import java.awt.*;
import java.awt.event.*;
class MyApp extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField txt1;
    TextField txt2;
    Button b;

    public MyApp() {
        super("Addition");
        setSize(500, 600);// w,h
        setLayout(null);
        setVisible(true);

        l1 = new Label("First number : ");
        l1.setBounds(10, 50, 70, 20);

        txt1 = new TextField();
        txt1.setBounds(150, 50, 250, 20);

        l2 = new Label("Second number : ");
        l2.setBounds(10, 100, 100, 20);

        txt2 = new TextField();
        txt2.setBounds(150, 100, 250, 20);

        b = new Button("Add");
        b.setBounds(241, 150, 60, 30);
        b.addActionListener(this);

        l3 = new Label("--");
        l3.setBounds(10, 200, 300, 30);

        add(l1);
        add(txt1);
        add(l2);
        add(txt2);
        add(b);
        add(l3);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = txt1.getText();
        String s2 = txt2.getText();
        if(s1.isEmpty() || s2.isEmpty()) {
            l3.setText("Please Enter The data");
        }else {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a+b;
            String result = String.valueOf(c);
            l3.setText("The sum is = "+result);
        }

    }

}

public class main3 {
    public static void main(String[] args) {
        MyApp frm = new MyApp();
    }

}
