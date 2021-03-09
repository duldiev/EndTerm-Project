package com.company;

public class HouseOzbek extends Person implements Ozbek {
    private int masteryYear;
    private Crib newCrib;  // new crib that ozbek is going to build

    HouseOzbek() {
        this.reset();  // new crib
    }

    public void setNewCribAddress(String address) {  // sets the address for the new crib
        this.newCrib.setAddress(address);
    }

    public Crib getNewBuiltCrib() {
        return this.newCrib;
    }

    public int getMasteryYear() {
        return masteryYear;
    }

    public void setMasteryYear(int masteryYear) {
        this.masteryYear = masteryYear;
    }

    @Override
    public void reset() {
        this.newCrib = new Crib();
    }

    @Override
    public void buildWalls() {
        newCrib.setWalls(true);
        System.out.println("Walls are built.");
    }

    @Override
    public void buildDoors() {
        newCrib.setDoors(true);
        System.out.println("Doors are built.");
    }

    @Override
    public void buildWindows() {
        newCrib.setWindows(true);
        System.out.println("Windows are built.");
    }

    @Override
    public void buildFence() {
        newCrib.setFence(true);
        System.out.println("Fence is built.");
    }

    @Override
    public void buildRoof() {
        newCrib.setRoof(true);
        System.out.println("Roof is built.");
    }

    @Override
    public void buildGarage() {
        newCrib.setGarage(true);
        System.out.println("Garage is built.");
    }

    @Override
    public void buildPool() {
        newCrib.setPool(true);
        System.out.println("Pool is built.");
    }

}
