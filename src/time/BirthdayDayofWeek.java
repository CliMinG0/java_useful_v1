package time;

import java.time.LocalDate;

public class BirthdayDayofWeek {

    public static void main(String[] args) {
        //2000년 5월 13일이 무슨 요일일까?
        LocalDate birthday = LocalDate.of(2000,5,13);

        //해당 날짜의 요일을 반환 (예 : MONDAY..)
        System.out.println("2000년 5월 13일에 요일은? : " + birthday.getDayOfWeek());
    }
}
