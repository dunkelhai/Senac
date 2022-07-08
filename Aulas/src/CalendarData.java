package Aulas.src;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarData {
    public static void main(String[] args) {


        //Somando unidade de tempo

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(sdf.format(d));

        //Obtendo unidade de tempo

        System.out.println(sdf.format(d));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d);
        int minutes = cal2.get(Calendar.MINUTE);
        int month = 1 + cal2.get(Calendar.MONTH);
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

    }
}
