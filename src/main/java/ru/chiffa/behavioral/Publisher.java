package ru.chiffa.behavioral;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public boolean unsubscribe(Observer subscriber) {
        return subscribers.remove(subscriber);
    }

    protected void notifySubscribers() {
        subscribers.forEach(Observer::update);
    }
}
