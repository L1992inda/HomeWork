package io.codelex.enums.practice;

public enum CardinalPoint {

    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String way;

    CardinalPoint(String way) {
        this.way = way;
    }

    public String getWay() {
        return way;
    }
}
