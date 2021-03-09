package com.company;

public class Crib {
    private String address;
    private boolean Walls;
    private boolean Doors;
    private boolean Windows;
    private boolean Roof;
    private boolean Garage;
    private boolean Fence;
    private boolean Pool;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Crib() {
        this.Walls = false;
        this.Doors = false;
        this.Windows = false;
        this.Roof = false;
        this.Garage = false;
    }

    public boolean isFence() {
        return Fence;
    }

    public void setFence(boolean fence) {
        Fence = fence;
    }

    public boolean isPool() {
        return Pool;
    }

    public void setPool(boolean pool) {
        Pool = pool;
    }

    public boolean isWalls() {
        return this.Walls;
    }

    public void setWalls(boolean walls) {
        this.Walls = walls;
    }

    public boolean isDoors() {
        return this.Doors;
    }

    public void setDoors(boolean doors) { this.Doors = doors; }

    public boolean isWindows() { return this.Windows; }

    public void setWindows(boolean windows) {
        this.Windows = windows;
    }

    public boolean isRoof() {
        return this.Roof;
    }

    public void setRoof(boolean roof) {
        this.Roof = roof;
    }

    public boolean isGarage() {
        return this.Garage;
    }

    public void setGarage(boolean garage) {
        this.Garage = garage;
    }
}
