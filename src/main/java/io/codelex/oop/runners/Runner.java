package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(30, 60),
    INTERMEDIATE(20, 50),
    ADVANCED(10, 40);

    final double minimumMinutesRunning;
    final double maximumMinutesRunning;

    Runner(double minimumMinutesRunning, double maximumMinutesRunning) {
        this.minimumMinutesRunning = minimumMinutesRunning;
        this.maximumMinutesRunning = maximumMinutesRunning;
    }

    public static void getFitnessLevel(double time) {
        if (time >= BEGINNER.getMinimumMinutesRunning() && time <= BEGINNER.getMaximumMinutesRunning()) {
            System.out.println(BEGINNER.name());
        } else if (time >= INTERMEDIATE.getMinimumMinutesRunning() && time <= INTERMEDIATE.getMaximumMinutesRunning()) {
            System.out.println(INTERMEDIATE.name());
        } else if (time >= ADVANCED.getMinimumMinutesRunning() && time <= ADVANCED.getMaximumMinutesRunning()) {
            System.out.println(ADVANCED.name());
        }
    }

    public double getMinimumMinutesRunning() {
        return minimumMinutesRunning;
    }

    public double getMaximumMinutesRunning() {
        return maximumMinutesRunning;
    }
}