package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {

        //Duration - 시간차이를 계산할때 사용
        LocalTime start = LocalTime.of(9,0); // 오전 9시를 가르킴
        LocalTime end = LocalTime.of(11,30);

        Duration duration = Duration.between(start,end);

        System.out.println("duration : " + duration);
        System.out.println("소요시간 : " + duration.toMinutes() + "분");
        System.out.println("소요시간 : " + duration.toSeconds() + "초");

    }
}
