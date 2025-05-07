package Colletions;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {

    public static void main(String[] args) {

        List mList; //리스트 인터페이스 계열

        int[] arrayInt = new int[10];

        ArrayList<Integer> list = new ArrayList();
        //<T> 제네렉 추후 배울 내용
        //Integer 참조타입 int 기본데이터 타입
        //Integer-Wrap 클래스 int 기본데이터 타입을 클래스로 설계해둔 데이터타입이다

        //ArrayList<Integer> list 정수값을 하나의 변수에 저장하는 리스트 계열헤 자료구조를 생성

        //1.값을 추가하는방법
        //arrayint[0] = 100
        list.add(100);
        list.add(null); //[100][null]

        //2.값꺼내기
        System.out.println(list.get(0));

        //3.값삭제하기
        list.remove(1);
        //3_1.삭제후 전체출력하기
        System.out.println(list.toString());

        //4.인덱스 번호로 지정해서 값 추가하기
        list.add(1,1000);
        System.out.println("출력확인1 : " + list);

        //4_1.삭제처리하기
        list.remove(2);
        //오브젝트 값으로도 삭제할수 있다
        System.out.println("출력확인2 : " + list);

        //4_2.전체삭제처리
        list.clear();
        System.out.println();
        System.out.println("출력확인3 : " + list);

        //5.리스트의 사이즈 확인
        //arrayInt.length; 얜 변수
        System.out.println("사이즈확인 : " + list.size());

        //num참조변수에 list참조변수에 주소값을 대입시킴
        System.out.println("list : " + list);
        //주소값을 복사했다 - 얕은 복사 개념
        ArrayList nums = list;
        System.out.println("새로 선언한 nums에 값을 추가했다");
        nums.add(10);
        nums.add(500);
        //nums라는 변수로 접근해서 add()를 했는데 왜 다시 list 출력하면 데이터가 존재하고 있지?
        System.out.println("list : " + list);
        System.out.println("nums : " + nums);

        System.out.println("리스트의 값 존재 여부 확인 : " + nums.contains(10));
        System.out.println("리스트의 요소의 위치(index) 확인: " + nums.indexOf(10));

        for(int i = 0; i < nums.size(); i++){
            //num[i] 배열방식
            System.out.println(nums.get(i));
        }//for end
    }//end of main
}//end of class
