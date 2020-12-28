package ru.belonogoff.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music rockMusic = context.getBean("someRockMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        rockMusicPlayer.playMusic();

        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
        classicalMusicPlayer.playMusic();

        context.close();
    }

}