package ru.belonogoff.spring;

import java.util.Arrays;
import java.util.List;

public class RapMusic implements Music{

    List<String> playList = Arrays.asList("Eminem", "50 Cent", "Snoop Dog");

    @Override
    public List<String> getSong() {
        return playList;
    }
}
