package ru.chiffa.creational.factory;

import java.util.List;

public class SadAnswerFactory implements AnswerFactory {
    private final List<String> answers = List.of("So sad..", ":(", "So sorry");

    @Override
    public String createAnswer() {
        return answers.get((int) (Math.random() * answers.size()));
    }
}
