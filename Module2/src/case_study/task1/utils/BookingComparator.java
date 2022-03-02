package case_study.task1.utils;

import case_study.task1.models.Booking;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate1 = LocalDate.parse(o1.getDayStart(), simpleDateFormat);
        LocalDate startDate2 = LocalDate.parse(o2.getDayStart(), simpleDateFormat);
        LocalDate endDate1 = LocalDate.parse(o1.getDayEnd(), simpleDateFormat);
        LocalDate endDate2 = LocalDate.parse(o2.getDayEnd(), simpleDateFormat);
        if (startDate1.compareTo(startDate2) < 0) {
            return -1;
        } else if (startDate1.compareTo(startDate2) > 0) {
            return 1;
        } else {
            if (endDate1.compareTo(endDate2) < 0) {
                return -1;
            } else if (endDate1.compareTo(endDate2) > 0) {
                return 1;
            }else{
                return 1;
            }
        }
    }
}
