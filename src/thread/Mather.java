package thread;

public class Mather extends Thread{

    BankAccount bankAccount;

    public Mather(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        //계좌에 출금요청 0.5초 걸림
        bankAccount.widthDraw(5000);
    }
}
