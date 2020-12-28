package ru.belonogoff.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> playList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(List<Music> playList) {
        this.playList = playList;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        for (Music song : playList) {
            System.out.println("Playing " + song.getSong());
        }
    }

    public List<Music> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
