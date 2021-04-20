package ru.chiffa.creational.factory;

import java.util.List;

public class AllPurposeAnswerFactory implements AnswerFactory{
    private final List<String> answers = List.of("Uhh..", "Mmm", "Yeah");

    @Override
    public String createAnswer() {
        return answers.get((int) (Math.random() * answers.size()));
    }
}
