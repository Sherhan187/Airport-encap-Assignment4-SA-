package com.company;

public class Plane {

    private boolean landed;

    public Plane() {
        landed = true;
    }

    public boolean isLanded() {
        return this.landed;
    }

    public void land() {
        this.landed = true;
    }


}