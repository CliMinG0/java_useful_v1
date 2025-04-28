package _swing;

import javax.swing.*;

/*배치관리자중에 설정을 아무것도 안하면 또는 null값을 셋팅을 하면
 * 좌표기준으로 배치를 할수있다*/
public class NoLayoutEx01 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public NoLayoutEx01() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("좌표값으로 버튼 배치하기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
    }

    private void setInitLayout() {
        //좌표값으로 작성 무조건 null
        setLayout(null);
        //좌표값을 선택하면 먼저 컴포넌트에 사이즈 입력하자
        //setter매서드
        button1.setSize(100,100);
        button2.setSize(100,100);
        button3.setSize(100,100);
        //배치관리자가 좌표값이기 떄문에 x,y값으 지정해줘야함
        button1.setLocation(0,0);
        button2.setLocation(100,0);
        button3.setLocation(0,100);
        //패널에 붙이기
        add(button1);
        add(button2);
        add(button3);
    }

    public static void main(String[] args) {

        new NoLayoutEx01();

    }//end of main
}//end of public class
