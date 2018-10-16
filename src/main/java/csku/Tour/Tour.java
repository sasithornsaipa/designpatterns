package csku.Tour;

public interface Tour {
    String getName();
    double getPrice();
    int getAvailableSeats();
    void setReservedSeats(int reservedSeats);
}
