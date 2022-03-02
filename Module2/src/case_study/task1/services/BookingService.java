package case_study.task1.services;

import case_study.task1.models.Booking;
import case_study.task1.utils.BookingComparator;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public interface BookingService extends Service{

    @Override
    default void display() {

    }

    @Override
    default void add() {

    }
}
