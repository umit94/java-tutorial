package dateCalendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Test {
    public static void main(String[] args) {
        //Date date = new Date(); //Date ms cinsinden tutar
        //System.out.println(date); //string formatında okunabilir cinsten alabiliriz

        //System.out.println(new Date(999999999999L)); //tarih ms cinsinden verilebilir


        TimeZone timeZone = TimeZone.getTimeZone("Africa/Dakar");

        GregorianCalendar cal = new GregorianCalendar(timeZone); //saati parça parça set edebilir
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        SimpleDateFormat format= new SimpleDateFormat("dd-MM/yyyy hh:mm:ss.SS");
        System.out.println(format.format(cal.getTime()));

        LocalDateTime localDateTime = LocalDateTime.parse("2022-07-04T10:12:43.819Z", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println(zonedDateTime);

    }
}
