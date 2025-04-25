package thread;

public class BankAccountMainTest {
//메인쓰레드
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        Father father = new Father(bankAccount);
        Mather mather = new Mather(bankAccount);

        //아버지가 먼저 입금 요청
        father.start(); //3초걸림

        //어머니가 출금 요청
        mather.start(); //0.5초걸림

        //동시에 작업하려 하는것을 임계영역
        //입금과 출금 동일한 계좌에서 처리
        //10만 + 1만 - 5천 = 10.5만
        //멀티스레딩 프로그램을 구성할떄 레이스커디션 상태를 만들어 낼수있다 - 주의
        //의도 하지 않은 결과를 만들어 낼수 있다

    }//end of main
}//end of public class
