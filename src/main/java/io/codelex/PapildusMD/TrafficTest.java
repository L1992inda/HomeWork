package io.codelex.PapildusMD;

public class TrafficTest {
    public static void main(String[] args) {
        Traffic trafficlight = new Traffic("green", 10);


        System.out.println("Light is red: " + trafficlight.isRed());
        System.out.println("Light is green: " + trafficlight.isGreen());
        System.out.println("Light duration: " + trafficlight.getDuration());
        System.out.println();

        trafficlight.setColor("yellow");
        trafficlight.setDuration(30);

        System.out.println("Light is red: " + trafficlight.isRed());
        System.out.println("Light is yellow: " + trafficlight.isYellow());
        System.out.println("Light duration: " + trafficlight.getDuration());


    }
}
