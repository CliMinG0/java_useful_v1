package wrapper;

public class WrapperTest2 {

    public static void main(String[] args) {
        //도전문제
        //double 데이터 타입을 래퍼클래스로 변환
        double num = 9.5;

        Double aDouble = Double.valueOf(num);
        System.out.println(aDouble);

        // 래퍼클래스(Double 선언과 초기화) ---> 기본 데이터 타입으로 변환( double 변수에 담아 보기)
        Double DNum2 = Double.valueOf(39.5);
        double num2 = DNum2.doubleValue();
        System.out.println("num2 : " + num2);

        //박싱,언박싱 예제코드를 작성하시오
        Double autoDouble = 12.0; //자동박싱
        double autoUndouble = autoDouble; //자동언박싱

        //자동박싱,언박싱 코드 작성



    }//end of main
}//end of public class
