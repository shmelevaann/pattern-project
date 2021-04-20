package ru.chiffa.creational.factory;

import java.util.List;

public class HappyAnswerFactory implements AnswerFactory{
    private final List<String> answers = List.of("Nice", "Great!", "Fantastic!");

    @Override
    public String createAnswer() {
        return answers.get((int) (Math.random() * answers.size()));
    }
}
