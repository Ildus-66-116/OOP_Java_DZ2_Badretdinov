package org.example.DZ2;

public class Treadmill {
    Integer distance;

    public Treadmill(Integer distance) {
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "distance=" + distance +
                '}';
    }
}
