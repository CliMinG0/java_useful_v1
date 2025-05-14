package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogDataFormatting {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("현 시 : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH일 mm분");

        System.out.println("지금 : " + now.format(formatter));
        System.out.println("세부 : " + now);


    }

}
