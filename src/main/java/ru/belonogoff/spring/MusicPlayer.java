package ru.belonogoff.spring;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    List<Music> playList;

    public MusicPlayer(List<Music> playList) {
        this.playList = playList;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + playList.get(random.nextInt(2)).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
