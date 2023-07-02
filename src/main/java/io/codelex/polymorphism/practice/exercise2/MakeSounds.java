package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Sound parrot = new Parrot();
        parrot.playSound();
        Sound parrot2 = new Parrot();
        parrot2.playSound();
        Sound radio = new Radio();
        radio.playSound();
        Sound radio2 = new Radio();
        radio2.playSound();


        List<Sound> sounds = new ArrayList<>();
        sounds.add(parrot);
        sounds.add(parrot2);
        sounds.add(radio);
        sounds.add(radio2);
        sounds.forEach(Sound::playSound);


    }


}

