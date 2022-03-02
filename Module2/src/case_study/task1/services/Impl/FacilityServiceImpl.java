package case_study.task1.services.Impl;

import case_study.task1.controllers.FacilityManagement;
import case_study.task1.models.Facility;
import case_study.task1.models.House;
import case_study.task1.models.Room;
import case_study.task1.models.Villa;
import case_study.task1.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> integerMap = new LinkedHashMap<>();

    /**
     *                  int idFacility,
     *                  String serviceName,
     *                  int usableArea,
     *                  int rentalCosts,
     *                  int maximumPeople,
     *                  String rentalType,
     *                  String roomStandard,
     *                  int areaSwimmingPool,
     *                  int floor
     */
    static {
        integerMap.put(new Villa(01,"Villa1".toLowerCase(Locale.ROOT),12220,1200000,10,"Long","Vip",120,3),0);
        integerMap.put(new Villa(01,"Villa1".toLowerCase(Locale.ROOT),12220,1200000,10,"Long","Vip",120,3),0);
        integerMap.put(new Villa(01,"Villa1".toLowerCase(Locale.ROOT),12220,1200000,10,"Long","Vip",120,3),0);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : integerMap.entrySet()) {
            System.out.println("Servicel: " + element.getKey().toString()+ "So lan da thue: " + element.getValue());
        }
    }

    @Override
    public void add() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.println("Enter choice: ");
            int choice = 0;
            boolean checkChoice = true;
            while (checkChoice) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkChoice = false;
                } catch (NumberFormatException ex) {
                    System.err.println("Nhap so cho dung");
                }
            }
            switch (choice) {
                case 1: {
                    addNewVilla();
                    break;
                }
                case 2: {
                    addNewHouse();
                    break;
                }
                case 3: {
                    addNewRoom();
                    break;
                }
                case 4: {
                    new FacilityManagement().displayFacilityMenu();
                    break;
                }
            }
            new FacilityManagement().displayFacilityMenu();
        }
    }


    @Override
    public void displayFacilityMaintenance() {

    }

    @Override
    public void addNewVilla() {
/**
 * int idFacility,
 *                  String serviceName,
 *                  int usableArea,
 *                  int rentalCosts,
 *                  int maximumPeople,
 *                  String rentalType,
 *                  String roomStandard,
 *                  int areaSwimmingPool,
 *                  int floor
 */
        System.out.println("Nhap id: ");
        int idFacility = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gia tien: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong nguoi: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap tieu chuan: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhap dien tich be boi: ");
        int areaSwimmingPool = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so tang: ");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idFacility, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, roomStandard, areaSwimmingPool, floor);
        integerMap.put(villa, 0);
        System.out.println("Them thanh cong");

    }

    @Override
    public void addNewHouse() {
//        int idFacility,
//        String serviceName,
//        int usableArea,
//        int rentalCosts,
//        int maximumPeople,
//        String rentalType,
//        int floor,
//        String roomStandard
        System.out.println("Nhap id: ");
        int idFacility = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gia tien: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong nguoi: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap so tang: ");
        int floor = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap tieu chuan: ");
        String roomStandard = scanner.nextLine();
        House house = new House(idFacility, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, floor, roomStandard);
        integerMap.put(house, 0);
        System.out.println("Them thanh cong");

    }

    @Override
    public void addNewRoom() {
//        int idFacility,
//        String serviceName,
//        int usableArea,
//        int rentalCosts,
//        int maximumPeople,
//        String rentalType,
//        String serviceFree
        System.out.println("Nhap id: ");
        int idFacility = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gia tien: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong nguoi: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap dich vu free: ");
        String serviceFree = scanner.nextLine();
        Room room = new Room(idFacility, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, serviceFree);
        integerMap.put(room, 0);
        System.out.println("Them thanh cong");

    }
}
