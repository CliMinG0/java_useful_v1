package thread;

public class Worker2MainTest {
    public static void main(String[] args) {

//        상속을 활용한 쓰레드 생성
//        Worker worker1 = new Worker("워커1");
//        worker1.start();


        //인터페이스를 구현한 쓰레드 확인
        Worker worker2 = new Worker("워커1");
        //인터페이스를 사용했을때 start()메서드가 없어서 실제 동작을 못시키고 있다
        //worker2.start();
        Thread subT1 = new Thread(worker2);
        subT1.start();
        //인터페이스를 활용해서 쓰레드를 start()시키는 방법

    }//end of main
}//end of public class
