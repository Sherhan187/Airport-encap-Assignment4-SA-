package com.company;
import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> planeArrayList;
    private int capacity;
    private Weather weather;

    public Airport(int capacity, Weather weather) {
        this.capacity = capacity;
        planeArrayList = new ArrayList<>();
        this.weather = weather;
    }

    private int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public int GetNumberOfPlanes() {
        return planeArrayList.size();
    }

    public boolean land(Plane plane) {
        if (capacity() || plane.isLanded() || stormy()) {
            return false;
        }
        planeArrayList.add(plane);
        plane.land();
        return true;
    }


    private boolean capacity() {
        return GetNumberOfPlanes() == getCapacity();
    }

    public boolean stormy() {
        return weather.stormy();
    }
}