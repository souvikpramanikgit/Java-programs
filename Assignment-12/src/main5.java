import java.awt.*;
import javax.swing.*;
class main5{
    public static void main(String args[]){
         awtborderlayout layout1 = new awtborderlayout("Border Layout");
//         awtgridlayout layout2 = new awtgridlayout("Grid Layout");
//         awtboxlayout layout3 = new awtboxlayout("Box Layout");
//         awtflowlayout layout4 = new awtflowlayout("Flow Layout");
    }

    static class awtborderlayout{
        awtborderlayout(String title){
            Frame frame = new Frame(title);
            frame.setSize(400, 300);

            Button btn1 = new Button("NORTH");
            Button btn2 = new Button("SOUTH");
            Button btn3 = new Button("EAST");
            Button btn4 = new Button("WEST");
            Button btn5 = new Button("CENTER");

            frame.setLayout(new BorderLayout(7,7));

            frame.add(btn1,BorderLayout.NORTH);
            frame.add(btn2,BorderLayout.SOUTH);
            frame.add(btn3,BorderLayout.EAST);
            frame.add(btn4,BorderLayout.WEST);
            frame.add(btn5,BorderLayout.CENTER);

            frame.setVisible(true);
        }
    }

    static class awtgridlayout{
        awtgridlayout(String title){
            Frame frame = new Frame(title);
            frame.setSize(400, 300);

            Button btn1 = new Button("ONE");
            Button btn2 = new Button("TWO");
            Button btn3 = new Button("THREE");
            Button btn4 = new Button("FOUR");
            Button btn5 = new Button("FIVE");
            Button btn6 = new Button("SIX");

            frame.setLayout(new GridLayout(2,3));

            frame.add(btn1);
            frame.add(btn2);
            frame.add(btn3);
            frame.add(btn4);
            frame.add(btn5);
            frame.add(btn6);

            frame.setVisible(true);
        }
    }
    static class awtboxlayout{
        awtboxlayout(String title){
            Frame frame = new Frame(title);
            frame.setSize(400, 300);

            Button btn1 = new Button("ONE");
            Button btn2 = new Button("TWO");
            Button btn3 = new Button("THREE");
            Button btn4 = new Button("FOUR");
            Button btn5 = new Button("FIVE");
            Button btn6 = new Button("SIX");

            frame.add(btn1);
            frame.add(btn2);
            frame.add(btn3);
            frame.add(btn4);
            frame.add(btn5);
            frame.add(btn6);

            frame.setLayout(new BoxLayout(frame,BoxLayout.X_AXIS));
            frame.setVisible(true);
        }
    }

    static class awtflowlayout{
        awtflowlayout(String title){
            Frame frame = new Frame(title);
            frame.setSize(400, 300);

            Button btn1 = new Button("ONE");
            Button btn2 = new Button("TWO");
            Button btn3 = new Button("THREE");
            Button btn4 = new Button("FOUR");
            Button btn5 = new Button("FIVE");
            Button btn6 = new Button("SIX");

            frame.add(btn1);
            frame.add(btn2);
            frame.add(btn3);
            frame.add(btn4);
            frame.add(btn5);
            frame.add(btn6);

            frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
            frame.setVisible(true);
        }
    }
}