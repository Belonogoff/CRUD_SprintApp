package ru.belonogoff.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> playList = Arrays.asList("Бах", "Шуберт", "Чайковский");

    @Override
    public List<String> getSong() {
        return playList;
    }
}
