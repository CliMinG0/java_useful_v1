package inner;
/*익명내부클래스
* 익명이란 이름이 없다*/
public class OuterClass3 {

    Runnable runnable; //인터페이스
    //인터페이스는 기본적으로 인스턴스화 할수 없다
    //단 익명 내부클래스로 구현할수 있다

    public static void main(String[] args) {

        //구현부를 만들어준다
        //추상매서드를 구현매서드로 바꾼다
        new Runnable(){
            @Override
            public void run(){

            }
        };

        //익명 클래스란 이름이 없는 클래스다
        new OuterClass3(); //익명클래스
        //outerClass3.runnable;

    }

}//end of public class
