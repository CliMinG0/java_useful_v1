package wrapper;

import java.util.ArrayList;

public class WrapperTest5 {

    public static void main(String[] args) {
        //컬렉션 프레임워크에서의 사용
        //컬렉션은 객체만 저장가능하다. 즉 래퍼클래스를 사용해 처리해야한다
        //정수값 (래퍼클래스)
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(Integer.valueOf(10)); //어떻게 int가 들어가지?
        numbers.add(20); //자동박싱이 되어서 (int -> Integer)

        int sum = numbers.get(0) + numbers.get(1); //자동언박싱
        System.out.println("합계 : " + sum);

    }//end of main
}//end of public class
