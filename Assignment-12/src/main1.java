import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main1 extends Frame {
    main1(){
        setTitle("Button Frame");
        Button b1=new Button("Button 1");
        Button b2=new Button("Button 2");
        Button b3=new Button("Button 3");
        b1.setBounds(30,150,90,30);
        b2.setBounds(150,150,90,30);
        b3.setBounds(270,150,90,30);
        setSize(400,300);
        setLayout(null);
        setVisible(true);
        add(b1);
        add(b2);
        add(b3);
        addWindowListener(new WindowAdapter() {

        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }});
    }
    public static void main(String args[]){
        main1 a=new main1();
    }
}