package Colletions;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

        //상황 사용자가 키보드로 입력한 ID 데이터를 많이 저장해야 한다
        //고유한 값이여야한다. 메모리상으로 관리할 예정
        private HashSet<String>registeredIDs;

        public UniqueUserIDSystem(){
            registeredIDs = new HashSet<>();
        //printALlIDs매서드를 테스트하기위해서 샘플데이터입력해보기 - 샘플데이터 입력
            registeredIDs.add("홍길동");
            registeredIDs.add("이순신");
            registeredIDs.add("야스오");
        }

        //사용자 ID를 등록하는 매서드
    public boolean addUserId(String userId){
            return registeredIDs.add(userId);
    }

    //사용자 ID를 출력하는 매서드를 직접 만들어 보자 - 전체출력
    //매서드 이름을 동사로 시작하는 것이 권장사항이다.
    public void UID (){
            //registeredIDs 순회해서 콘솔창에 출력하고자 한다
            //초기화 for 구문, Iterator 로 형변환해서 순회시킬수 있다.

            //HashSet 안에 요소가 아무것도 없다면
            if (registeredIDs.isEmpty()){
                System.out.println("등록된 사용자 ID가 없습니다");
                return; //실행의 제어권 반납
            }

            for (String id : registeredIDs){
                System.out.println("id : " + id);
            }

        System.out.println("총 등록된 ID 개수 : " + registeredIDs.size());

    }

    public void ShowIds(){

        System.out.println(registeredIDs);

    }

    //시스템을 실행할 매서드
    public void start(){

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("사용하고 싶은 ID를 입력하세요 종료하려면 'exit' 입력");
            String input = scanner.nextLine().trim(); //.trim() 공백제거

            //사용자가 키보드에서 값을 넣지않고 바로 엔터를 누르는경우
            //빈입력처리
            if (input.isEmpty()){
                System.out.println("ID를 입력해주세요");
                continue;
            }

            if("exit".equals(input)){
                System.out.println("시스템을 종료합니다");
                break;
            }

            boolean isRegistered = addUserId(input);
            if (isRegistered){
                System.out.println("새로운 사용자 ID가 등록되었습니다");
            }else {
                System.out.println("이미 등록된 사용자  ID 입니다");
            }

        }//end of while

        scanner.close(); //자원해제

    }//end of start

    //메인함수
    public static void main(String[] args) {
        UniqueUserIDSystem idsystem = new UniqueUserIDSystem();
        //idsystem.start();
        idsystem.UID();
        //idsystem.ShowIds();
    }


}//end of class
