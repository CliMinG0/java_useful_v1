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

    }//end of main
}//end of public class
