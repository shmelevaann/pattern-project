package ru.chiffa.behavioral;

public class PrintObserver implements Observer{
    @Override
    public void update() {
        System.out.println("button pushed");
    }
}
