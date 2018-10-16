package csku;

import csku.Tour.PackageTour;
import csku.Tour.ReserveManager;
import csku.Tour.SingleTour;
import csku.Tour.Tour;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestTour {

    ReserveManager mng;
    SingleTour waterMarket;
    PackageTour package1;

    @BeforeEach
    void init(){
        mng = new ReserveManager();
        waterMarket = new SingleTour("ตลาดน้ำ", 250, 10);
        List<Tour> tours = new ArrayList<Tour>();
        tours.add(new SingleTour("ตลาดน้ำ", 250, 10));
        tours.add(new SingleTour("วัดพระแก้ว", 500, 15));
        package1 = new PackageTour("ตลาดน้ำและวัดพระแก้ว",tours);
    }

    @Test
    void testReserveSingleTour(){
        mng.reserveTour(waterMarket,2);
        assertEquals(8, waterMarket.getAvailableSeats());
    }

    @Test
    void testCalPricePackageTour(){
        assertEquals(675, package1.getPrice());
    }

    @Test
    void testReservePackageTour(){
        mng.reserveTour(package1,2);
        assertEquals(8, package1.getAvailableSeats());
    }

}
