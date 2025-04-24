package _String;


public class StringTest3 {
    public static void main(String[] args) {

        String str1 = "ABCD";
        int countStr1 = str1.length();
        System.out.println("countStr : " + countStr1);

        //replace 매서드는 문자열 내에서 특정 문자열을 다른 문자나 문자열을 교체하는데
        //사용할수 있다
        String str2 = "Hello World";
        String str3 = str2.replace("World", "Java");

        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);

        //subString 매서드는 문자열 일부분을 추출하여 새로운 문자열을 반환합니다
        //두가지 오버로딩된 매소드를 제공합니다
        //startIndex 포함
        //endIndex 불포함
        //문자열 인덱스 인덱스는 0부터 시작한다
        String result3 = str1.substring(0,5);
        System.out.println("result3 : " + result3);

    }//end of main
}//end of public class
