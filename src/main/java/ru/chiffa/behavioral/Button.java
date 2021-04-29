package ru.chiffa.behavioral;

public class Button extends Publisher{
    public void push() {
        notifySubscribers();
    }
}
