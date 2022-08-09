package ru.msaggik.spring;

import org.springframework.stereotype.Component;

@Component // создание бина к классу с id classicalMusic
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "I.S. Bach Musette in D major";
    }
}
