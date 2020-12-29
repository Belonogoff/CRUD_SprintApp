package ru.belonogoff.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{

    List<String> playList = Arrays.asList("Queen", "Rammstein", "Linkin Park");

    @Override
    public List<String> getSong() {
        return playList;
    }
}
