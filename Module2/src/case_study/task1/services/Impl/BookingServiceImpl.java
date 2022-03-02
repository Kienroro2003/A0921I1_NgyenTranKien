package case_study.task1.services.Impl;

import case_study.task1.models.Booking;
import case_study.task1.models.Customer;
import case_study.task1.models.Facility;
import case_study.task1.models.Villa;
import case_study.task1.services.Service;
import case_study.task1.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements Service {
    static Set<Booking> setBooking = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add((new Customer("06/01/2003", "Kien", "nam", 1,
                0123123123, 1231313, "kienroro281@gmail.com",
                12313, "Vip", "Da Nang")));
        customerList.add((new Customer("12/11/2003", "Nu", "nu", 2,
                231433, 1231313, "Nu@gmail.com",
                12313, "Normal", "Da Nang")));
        facilityIntegerMap.put(new Villa(01, "Villa1", 12220,
                1200000, 10, "Long", "Vip", 120, 3), 0);
        facilityIntegerMap.put(new Villa(02, "Villa2", 123,
                3213, 10, "Short", "Normal", 60, 3), 0);
    }

    public Set<Booking> getSetBooking() {
        return setBooking;
    }

    @Override
    public void display() {
        for (Booking booking : setBooking) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void add() {
        int id = 1;
        if (!setBooking.isEmpty()) {
            id = setBooking.size() +1;
        }
        Customer customer = choiceCustormer();
        Facility facility = choiceFacility();
        System.out.println("Ngay bat dau thue: ");
        String startDate = scanner.nextLine();
        System.out.println("Ngay ket thuc thue: ");
        String endDate = scanner.nextLine();

//        int bookingCode,
//        String dayStart,
//        String dayEnd,
//        int customerCode,
//        String service,
//        String serviceType
        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        setBooking.add(booking);
        System.out.println("Them moi thanh cong");
    }

    public static Customer choiceCustormer() {
        System.out.println("Danh sach khach hang: ");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        System.out.println("Nhap id khach hang: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        while (check) {
            for (Customer customer : customerList) {
                if (customer.getID() == id) {
                    return customer;
                }
            }
            if (check) {
                System.out.println("Vui long nhap lai id: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }


        return null;
    }

    public static Facility choiceFacility() {
        System.out.println("Danh sach dich vu: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhap id dich vu: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (entry.getKey().getIdFacility() == id) {
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Vui long nhap lai id: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }


        return null;
    }


}
