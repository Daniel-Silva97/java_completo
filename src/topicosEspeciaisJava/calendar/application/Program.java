package topicosEspeciaisJava.calendar.application;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf1.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(sdf1.format(d));

        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("Minutes: " + minutes);
        int month = 1 + cal.get(Calendar.MONTH);
        System.out.println("Month: " + month);

    }
}
