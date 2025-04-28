package _swing;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame  {

    LabelEx() {

        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel textLabel = new JLabel("제임스 고슬링 입니더!");

        ImageIcon img = new ImageIcon("image3.png");
        JLabel imageLabel = new JLabel(img);


        c.add(textLabel);
        c.add(imageLabel);

        setSize(300,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelEx();
    }

}
