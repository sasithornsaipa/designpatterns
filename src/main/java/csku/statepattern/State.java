package csku.statepattern;

public interface State {
    void pushStartBtn();
    void chooseStation(String dest);
    void insertCoin(int coin);
}
