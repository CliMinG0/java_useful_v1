package _String;

public class StringBuffetTest1 {

    //string <- 클래스를 이야기 하기위해서 String을 이해
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        StringBuffer buffer1 = new StringBuffer(str1);
        //buffer1에 값을 수정해보자

        System.out.println("수정 전 : " + System.identityHashCode(buffer1));

        buffer1.append(str2);
        buffer1.append("111");
        buffer1.append("222");

        System.out.println("수정 후 : " + System.identityHashCode(buffer1));

        //이전 버전에서는 hashcode(); 해당객체의 유일성을 보장하는 점수 값
        //API 8버전에서는 buffer1.toString() 해야 값을 확인할수 있다
        System.out.println(buffer1);

        //StringBuffer 데이터타입을 String 으로 형변환하려면 .toString으로 형변환하면 된다.
        String result = buffer1.toString();

    }//end of main
}//end of public class
