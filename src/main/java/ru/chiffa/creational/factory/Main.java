package ru.chiffa.creational.factory;

public class Main {
    public static void main(String[] args) {
        String emotionOfTheDay = args[0];

        AnswerFactory factory;
        switch (emotionOfTheDay) {
            case "happy":
                factory = new HappyAnswerFactory();
                break;
            case "sad":
                factory = new SadAnswerFactory();
                break;
            default:
                factory = new AllPurposeAnswerFactory();
        }
    }
}
