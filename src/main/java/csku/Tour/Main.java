package csku.Tour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ReserveManager mng = new ReserveManager();
        SingleTour waterMarket = new SingleTour("ตลาดน้ำ", 250, 10);
        SingleTour watPraKaew = new SingleTour("วัดพระแก้ว", 500, 15);

        System.out.println("ทัวร์"+waterMarket.getName()+" ราคา "+waterMarket.getPrice()+" มี " +waterMarket.getAvailableSeats()+" ที่นั่ง");
        mng.reserveTour(waterMarket,2);
        System.out.println("ทัวร์"+waterMarket.getName()+" ราคา "+waterMarket.getPrice()+" เหลือ " +waterMarket.getAvailableSeats()+" ที่นั่ง");
        System.out.println("------------------------------------------");
        System.out.println("ทัวร์"+watPraKaew.getName()+" ราคา "+watPraKaew.getPrice()+" มี " +watPraKaew.getAvailableSeats()+" ที่นั่ง");
        mng.reserveTour(watPraKaew,2);
        System.out.println("ทัวร์"+watPraKaew.getName()+" ราคา "+watPraKaew.getPrice()+" เหลือ " +watPraKaew.getAvailableSeats()+" ที่นั่ง");
        System.out.println("------------------------------------------");

        List<Tour> tours = new ArrayList<Tour>();
        tours.add(new SingleTour("ตลาดน้ำ", 250, 10));
        tours.add(new SingleTour("วัดพระแก้ว", 500, 15));
        PackageTour package1 = new PackageTour("ตลาดน้ำและวัดพระแก้ว",tours);
        System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" มี " +package1.getAvailableSeats()+" ที่นั่ง");
        mng.reserveTour(package1,5);
        System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" เหลือ " +package1.getAvailableSeats()+" ที่นั่ง");
        mng.reserveTour(package1,5);
        System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" เหลือ " +package1.getAvailableSeats()+" ที่นั่ง");

    }
}
