package case_study.task1.services.Impl;

import case_study.task1.models.Booking;
import case_study.task1.models.Contract;
import case_study.task1.models.Customer;
import case_study.task1.models.Facility;
import case_study.task1.services.ContactService;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    List<Contract> contractList = new ArrayList<>();

    @Override
    public void display() {
        for(Contract contract : contractList){
            System.out.println(contract.toString());
        }
    }

    @Override
    public void add() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().getSetBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        if ((bookingQueue.isEmpty())){
            System.out.println("chua co booking nao");
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomerCode();
            System.out.println("Dang tao hop dong cho Booking co thong tin : " + booking.toString());
            System.out.println("Dang tao hop dong cho Customer co thong tin : " + customer.toString());
            System.out.println("Nhap id hop dong: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Tien tra truoc: ");
            int pre = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap tien tra sau : ");
            int pay = Integer.parseInt(scanner.nextLine());
//                    int numberContract,
//                    Booking bookingCode,
//                    int advanceDepositAmount,
//                    int totaPayment,
//                    Customer customerCode
            Contract contract = new Contract(id, booking, pre, pay, customer);
            contractList.add(contract);
            System.out.println("Tao hop dong thanh cong");
        }
    }


}
