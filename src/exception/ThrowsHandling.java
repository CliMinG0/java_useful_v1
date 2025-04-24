package exception;

public class ThrowsHandling {
    public static void main(String[] args) {

        Calc calc = new Calc();
//        try {
//            int result = calc.divide(10, 0);
//            System.out.println("result : " + result);
//        }catch (Exception e){
//            System.out.println(e.getClass());
//            System.out.println("에러발생");
//        }

        try {
            calc.divide(10, 0);
        } catch (Exception e) {
            System.out.println("인수로 0을 넣지 마시오");
            //throw new RuntimeException(e);
        }

    }//end of main
}//end of public class

class Calc {

    public int divide(int n1, int n2) throws ArithmeticException, Exception {
        //예외 발생할수 있는 코드에서 직접 예외 처리할수 있지만
        //사용하는 시점 알아서 적절하게 예외처리 던질수 있다
        return n1 / n2;
    }
}//end of class