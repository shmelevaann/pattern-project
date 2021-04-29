package ru.chiffa.behavioral;

public class CountObserver implements Observer{
    private int counter = 0;

    @Override
    public void update() {
        counter++;
    }
}
