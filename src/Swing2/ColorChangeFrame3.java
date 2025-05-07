package Swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ColorChangeFrame3 extends JFrame implements ActionListener {

    private JButton[] button; // 버튼을 배열로 7개 만들기
    private JPanel panel1;
    private JPanel panel2;


    public ColorChangeFrame3() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("패널연습");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        panel1 = new JPanel();

        button = new JButton[5];

        for (int i = 0; i < button.length; i++){
            button[i] = new JButton("버튼" + i);
        }
    }

    private void setInitLayout() {
        setLayout(new GridLayout(1, 1));
    for (int i = 0; i < button.length; i++) {
        panel1.add(button[i]);
    }
        add(panel1);

        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

    }

    private void addEventListener() {
        for (int i = 0; i < button.length; i++) {
            button[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton selectedButton = (JButton)e.getSource();

        for (int i = 0; i < button.length;i++) {
            if (selectedButton == button[0]) {
                panel1.setBackground(Color.RED);
            } else if (selectedButton == button[1]) {
                panel1.setBackground(Color.ORANGE);
            } else if (selectedButton == button[2]) {
                panel1.setBackground(Color.YELLOW);
            } else if (selectedButton == button[3]) {
                panel1.setBackground(Color.green);
            } else if (selectedButton == button[4]) {
                panel1.setBackground(Color.BLUE);
            }
            // 버튼마다 클릭하면 색상변경하기
        }
    }

    //테스트 코드
    public static void main(String[] args) {

        new ColorChangeFrame3();

    }//end of main
}
