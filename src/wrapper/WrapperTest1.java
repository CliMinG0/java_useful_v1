package wrapper;

public class WrapperTest1 {

    public static void main(String[] args) {

        //박싱(Boxing)
        //기본 데이터를 래퍼 클래스 객체로 변환하는 과정
        int num = 10;
        Integer wrapperedNum = Integer.valueOf(num); //박싱하다
        System.out.println(wrapperedNum);

        //언박싱(unBoxing)
        //래퍼 클래스 객체를 기본 데이터로 변환하는 과정
        Integer wrapperedNum2 = Integer.valueOf(30);
        int num2 = wrapperedNum2.byteValue();
        System.out.println("num2 : " + num2);


        String char2 = "A??";
        char share2 =   String.valueOf(char2).charAt(0);
        //아 맞다 char는 문자 하나만 담고 String은 문자열이었다
        System.out.println("char : " + share2);

        //편의성을 제공 - Java 5부터 도입된 기능
        //자동 박싱, 자동 언박싱

        Integer autoBoxed = 20; //자동 박싱 (int(값) -> integer (..))
        int autoUnboxed = autoBoxed; //자동 언박싱 (Integer(값) -> int)

    }//end of main

}//end of public class
