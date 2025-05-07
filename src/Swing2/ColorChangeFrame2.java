package Swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame2 extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel1;

    public ColorChangeFrame2 (){
        initData();
        setInitData();
        addEventListener();
    }

    private void initData(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        button1 = new JButton("click1");
        button2 = new JButton("click2");
    }
    private void setInitData(){
        setLayout(new BorderLayout());

        add(panel1, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);

        setVisible(true);
    }
    private void addEventListener(){
        button1.addActionListener(this); //다형성
        button2.addActionListener(this);

    }

    //이벤트리스너 콜백 매서드
    @Override
    public void actionPerformed(ActionEvent e) {

        //JButton - 다운캐스팅
        JButton selectedButton = (JButton)e.getSource();

    //같은 객체의 주소값을 가르키는 비교
        if (selectedButton == button1){
            panel1.setBackground(Color.BLUE);
        } else if (selectedButton == button2) {
            panel1.setBackground(Color.RED);
        }

    }

    public static void main(String[] args) {
        new ColorChangeFrame2();
    }
}
