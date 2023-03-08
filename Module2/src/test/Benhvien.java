package test;

import java.util.*;

abstract class nguoi {
    private String hovaten;
    private int namsinh;
    double chiphi;

    public abstract double chiphi();

    public abstract void setChiPhi(double newCost);

    public double getChiphi() {
        return chiphi;
    }

    public void setChiphi(double chiPhi) {
        chiphi = chiPhi;
    }

    public abstract void add(Object obj);

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten benh nhan: ");
        hovaten = sc.nextLine();
        System.out.println("nhap nam sinh benh nhan: ");
        namsinh = sc.nextInt();
    }

    void output() {
        System.out.println("ho va ten cua benh nhan la: " + hovaten);
        System.out.println("nam sinh cua benh nhan la: " + namsinh);
    }

    int getnamsinh() {
        return namsinh;
    }

}

class ngoai_tru extends nguoi {
    double tien_dieu_tri;
    String phong_ban;

    public double chiphi() {
        return tien_dieu_tri;
    }

    @Override
    public void setChiPhi(double newCost) {
        this.tien_dieu_tri = newCost;
    }

    @Override
    public void add(Object obj) {

    }

    void input() {
        System.out.println("| nhap thong tin benh nhan ngoai tru |");
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("nhap phong ban cua benh nhan: ");
        phong_ban = sc.nextLine();
        System.out.println("nhap tien dieu tri cua benh nhan: ");
        tien_dieu_tri = sc.nextInt();
    }

    void output() {
        super.output();
        System.out.println("phong ban cua benh nhan la: " + phong_ban);
        System.out.println("tien dieu tri cua benh nhan la: " + tien_dieu_tri);
        System.out.println("chi phi cua benh nhan la: " + chiphi());
    }
}

class noi_tru extends nguoi {
    double tien_dieu_tri;
    double tien_o;

    public double chiphi() {
        return tien_dieu_tri * tien_o;
    }

    @Override
    public void setChiPhi(double newCost) {
        this.tien_dieu_tri = newCost;
    }

    @Override
    public void add(Object obj) {

    }

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("nhap tien dieu tri cua benh nhan: ");
        tien_dieu_tri = sc.nextDouble();
        System.out.println("nhap tien o cua benh nhan: ");
        tien_o = sc.nextDouble();
    }

    void output() {
        Scanner sc = new Scanner(System.in);
        super.output();
        System.out.println("tien dieu tri cua benh nhan la: " + tien_dieu_tri);
        System.out.println("tien o cua benh nhan la: " + tien_o);
        System.out.println("chi phi cua benh nhan la: " + chiphi());
    }
}

public class Benhvien {
    nguoi[] arr;
    private int i;

    void input() {
        int n, sobenhnhan;
        Scanner sc = new Scanner(System.in);
        System.out.println("| nhap danh sach benh nhan |");
        sobenhnhan = sc.nextInt();
        arr = new nguoi[sobenhnhan];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap nhan vien thu " + (i + 1));
            System.out.println(" nhap benh nhan ngoai tru la (0) ; benh nhan noi tru la (<0>) ");
            n = sc.nextInt();
            if (n == 0) {
                arr[i] = new ngoai_tru();
            } else {
                arr[i] = new noi_tru();
            }
            arr[i].input();
        }
    }

    void output() {
        System.out.println("Danh sach benh nhan: ");
        for (nguoi x : arr) x.output();
    }

    void sapxepgiamdan() {
        nguoi temp = new noi_tru();
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].chiphi() < arr[j].chiphi()) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
    }

    void giamchiphi() {
        double giam = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getnamsinh());
            if (arr[i].getnamsinh() <= 1970) {
                giam = (arr[i].chiphi() * 30) / 100;
                if (giam > 200) {
                    System.out.println("Chi giam duoc 200");
                    arr[i].setChiPhi(arr[i].chiphi() - 200);
                } else {
                    System.out.println("tien giam la:  " + (arr[i].chiphi() - giam));
                    arr[i].setChiPhi(arr[i].chiphi() - giam);
                }

            } else {
                double kiemtra = arr[i].chiphi();
                if (giam >= 200)
                    System.out.println("tien giam qua 200 nên tro ve chi phi cu: " + kiemtra);
            }
        }
    }

    //    public void giamtien()
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i].chiphi()<1970)
//            {
//                double tiengiam=(arr[i].getChiphi()*0.3);
//                if(tiengiam<=200)
//                    arr[i].setChiphi(arr[i].getChiphi()-tiengiam);
//            }
//        }
//    }
    public static void main(String[] args) {
        nguoi nguoi = new noi_tru();
        nguoi nguoi1 = new ngoai_tru();
        nguoi.add(nguoi1);
    }

}