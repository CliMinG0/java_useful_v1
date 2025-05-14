package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KoreaDateTimeFomatting {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현날짜 시간 : " + now);

        //한국식 포맷을 정의 (EX.2025.05.14 12.00)
        //패턴을 지정할수 있다
        //패턴 - yyyy.MM.dd.HH.mm(년월일시분)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분");

        //now.format(formatter);
        //우리가 정의한 포맷 형태로 현재 시간을 출력해준다
        System.out.println("지금1 : " + now.format(formatter));
        System.out.println("지금2 : " + now);

    }

}
