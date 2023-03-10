package Time;

import java.time.*;
import java.time.temporal.ChronoField;

public class TimePackage {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime present = LocalTime.now();
        System.out.println(today + " " + present);
        LocalDate birthDay = LocalDate.of(1982, 02, 19);
        // static LocalTime of(int hour, int minute, int second, int nanoOfSecond)
        LocalTime birthTime = LocalTime.of(02, 02, 00, 100000000);
        System.out.println(birthDay + " " + birthTime);

        System.out.println("올해는 " + today.getYear() + "년입니다.");
        System.out.println("이번달은 " + today.getMonthValue() + "월입니다.");
        System.out.println("오늘은 " + today.getDayOfMonth() + "일입니다.");
        System.out.println("요일은 " + today.getDayOfWeek() + "입니다.");



        System.out.println("지금은 " + (today.get(ChronoField.YEAR)));
        System.out.println("지금은 " + (today.get(ChronoField.MONTH_OF_YEAR)));
        System.out.println("지금은 " + (present.get(ChronoField.AMPM_OF_DAY)));
        String ampm;
        if(present.get(ChronoField.AMPM_OF_DAY) == 0) {
            ampm = "오전";
        } else {
            ampm = "오후";
        }
        System.out.println("지금은 " + ampm + "입니다.");
    }
}
