package io.codelex.oop.Parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;

    }

    public boolean validate() {
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            return false;
        } else if (xLength + yLength + zLength > 300) {
            return false;
        } else return !(weight > 15);
    }

}