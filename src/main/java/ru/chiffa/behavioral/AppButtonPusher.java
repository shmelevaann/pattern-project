package ru.chiffa.behavioral;

public class AppButtonPusher {
    public static void main(String[] args) {
        Button button = new Button();
        button.subscribe(new CountObserver());
        button.subscribe(new PrintObserver());

        button.push();
    }
}
