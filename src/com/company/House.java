package com.company;

public class House {
    private boolean Walls;
    private boolean Doors;
    private boolean Windows;
    private boolean Roof;
    private boolean Garage;

    House() {
        this.Walls = false;
        this.Doors = false;
        this.Windows = false;
        this.Roof = false;
        this.Garage = false;
    }

    public boolean isWalls() {
        return Walls;
    }

    public void setWalls(boolean walls) {
        Walls = walls;
    }

    public boolean isDoors() {
        return Doors;
    }

    public void setDoors(boolean doors) { Doors = doors; }

    public boolean isWindows() { return Windows; }

    public void setWindows(boolean windows) {
        Windows = windows;
    }

    public boolean isRoof() {
        return Roof;
    }

    public void setRoof(boolean roof) {
        Roof = roof;
    }

    public boolean isGarage() {
        return Garage;
    }

    public void setGarage(boolean garage) {
        Garage = garage;
    }
}
