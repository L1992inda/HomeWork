package io.codelex.PapildusMD;

public class Traffic {
    private String color;
    private int duration;

    public Traffic(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equals("red");
    }

    public boolean isYellow() {
        return color.equals("yellow");
    }

    public boolean isGreen() {
        return color.equals("green");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

