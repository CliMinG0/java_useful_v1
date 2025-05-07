package Swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*자바는 단일 상속만을 지원한다
* object 클래스 제외 이벤트 리스너 예제코드 작성*/

//ActionListener (인터페이스)
public class ColorChangeFrame extends JFrame implements ActionListener {

    private JButton button1;

    public ColorChangeFrame(){
        initData();
        setInitData();
        addEventListener();
    }

    private void initData(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button1");
    }

    private void setInitData(){
        setLayout(new FlowLayout());
        add(button1);
        setVisible(true);
    }
    private void addEventListener(){
        button1.addActionListener(this);
    }

    public static void main(String[] args) {
        new ColorChangeFrame();

    }
    //운영체제와 약속되어 있는 추상메서드를 오버라이드 했다
    //이벤트가 발생되면 이 매서드를 자동으로 수행해 미리 정해져있는
    //정보를 받을수 있다
    //단 어떤 컴포넌트가 이벤트를 실행시킬건지 먼저 등록 해주어야한다
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("actionPerformed()매서드가 호출되었다");
        System.out.println(e.toString());
    }
}
