package _my_test;

import _swing.MyPaintFrame;

import javax.swing.*;
import java.awt.*;

public class MyTestFrame extends JFrame {

    private MyPanel myPanel;

    public MyTestFrame() {
        initData();
        setInitData();
    }

    public void initData() {
        setTitle("테스트");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();

    }

    private void setInitData() {
        super.add(myPanel);
    }

    //내부클래스
    static class MyPanel extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // 집 만들기
            g.drawRect(100, 100, 300, 300); //집틀
            g.drawLine(250, 45, 400, 100); //지붕
            g.drawLine(250, 45, 100, 100);
            // X2만 바꾸면 됨 (250기준좌우)
            g.drawRect(300,300 ,50,100); //문
            g.drawRect(305,350 ,7,7); //문손잡이
            g.drawRect(150,150 ,50,50); //창문
            g.drawRect(150,200 ,50,50);
            g.drawRect(200,150 ,50,50);
            g.drawRect(200,200 ,50,50);
            // 선, 사각형, 동그라미
            //g.drawArc(20,20,50,50,500,500); 원


        }
    }//end of inner class

    public static void main(String[] args) {

        new MyTestFrame();

    }//end of main
}//end of public class

