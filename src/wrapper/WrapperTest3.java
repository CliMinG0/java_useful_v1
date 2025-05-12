package wrapper;

public class WrapperTest3 {

    public static void main(String[] args) {
        //래퍼클래스의 활용
        //String -> 기본데이터타입(int,double,boolean)
        //문자인걸 바꾸어서 처리해줌

        String strNum = "123";
        String strdouble = "45.67";
        String strbool = "true";

        //래퍼클래스를 활용해서 형변환 처리
        int num = Integer.parseInt(strNum);
        System.out.println(num);

        double dnum = Double.parseDouble(strdouble);
        System.out.println(dnum);

        boolean boolNum = Boolean.parseBoolean(strbool);
        System.out.println(boolNum);

    }//end of main
}//end of public class
