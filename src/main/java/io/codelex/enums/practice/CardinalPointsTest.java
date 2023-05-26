package io.codelex.enums.practice;

public class CardinalPointsTest {
    public static void main(String[] args) {
        CardinalPoint direction = CardinalPoint.EAST;
        switch (direction) {
            case NORTH -> System.out.println("North up");
            case SOUTH -> System.out.println("South down");
            case EAST -> System.out.println("East right");
            case WEST -> System.out.println("North up");
        }

        for (CardinalPoint x : CardinalPoint.values()) {
            System.out.println(x.name() + ":" + x.ordinal() + ":" + x.getWay());

        }
    }
}
