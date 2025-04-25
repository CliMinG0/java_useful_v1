package thread;

public class MainTest {

    public static void main(String[] args) {


        //Process - 프로그램이 실행이되면 OS 로부터 메모리부터 할당받아 프로세스상태가 된다
        // thread - 하나에 프로세스에는 하나이상의 스레드를 가지게 되고 실제 작업을 수행하는 단위는 thread 이다

        //multi threading 이란?
        //여러 쓰레드가 동시에 수행되는 프로그래밍을 말한다 여러작업이 동시에 실행되는 효과를 만들어 낼수 있다
        //thread 는 각각자신만에 변수, 메서드 등 작업공간 등을 가질수 있다
        //단 , 멀티 쓰레딩 프로그래밍을 할떄 주의점이 있다
        //각 thread 사이에는 공유하는 자원을 가질수 있다.
        //여러 쓰레드가 자원을 공유하여 작업이 수행되는 경우 *서로 자원을 차지* 하려는
        //race condition 이 발생할수 있다.

    }//end of main
}//end of public class
