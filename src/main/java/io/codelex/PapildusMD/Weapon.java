package io.codelex.PapildusMD;

import java.util.ArrayList;

public class Weapon {
    private final int capacity;
    private final ArrayList<String> catrige = new ArrayList<String>();

    public Weapon(int capacity) {
        this.capacity = capacity;
    }

    public void loadBullet(String bullet) {
        if (catrige.size() < capacity) {
            catrige.add(bullet);
        }

    }

    public boolean isLoaded() {
        return catrige.size() > 0;
    }

    public void shot() {
        if (catrige.size() > 0) {
            System.out.println("ShooT!");
            catrige.remove(catrige.size() - 1);
        } else {
            System.out.println("empty magazine");
        }

    }
}

