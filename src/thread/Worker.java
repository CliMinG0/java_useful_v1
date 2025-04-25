package thread;

/*쓰레드 만들어보기 (생성)
 * 상속을 활용하여 쓰레드 만들어보기*/
public class Worker extends Thread {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    //서브작업자가 해야할일은 run()매서드 안에 재정의 해주어야 한다
    //약속된부분 ! start() 매서들 통해서 쓰레드한테 일을 시작하라고 명령을 줄수 있다
    //그러면 다른쓰레드가 run()안에 있는 부분을 수행시킨다

    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            System.out.println("worker" + name + " : " + i);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e1){
                System.out.println("외부에서 신호를 받아서 예외가 발생됐어");
                e1.printStackTrace(); //예외가 발생한 부분들 좀더 상세히 출력
            }catch (Exception e2){

            }


        }
    }
}

