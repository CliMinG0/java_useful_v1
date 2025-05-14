package time;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculation {

    public static void main(String[] args) {
        //나이계산
        LocalDate birth = LocalDate.of(2000,5,13);

        //현재날짜 가져오기
        LocalDate today = LocalDate.now();

        //생일과 오늘 사이의 기간을 계산
        Period age = Period.between(birth,today);

        System.out.println("나이 : " + age.getYears() + "세");

    }
}
