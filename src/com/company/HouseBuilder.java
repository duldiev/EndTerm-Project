package com.company;

public class HouseBuilder extends Worker implements Builder {
    private House product;

    HouseBuilder(int id, String name, String surname, String gender, int age) {
        super(id, name, surname, gender, age);
        this.reset();
    }

    public House getProduct() {
        return this.product;
    }

    @Override
    public int getId() {
        return getId();
    }

    @Override
    public void reset() {
        this.product = new House();
    }

    @Override
    public void buildWalls() {
        product.setWalls(true);
        System.out.println("Walls built.");
    }

    @Override
    public void buildDoors() {
        product.setDoors(true);
        System.out.println("Doors built.");
    }

    @Override
    public void buildWindows() {
        product.setWindows(true);
        System.out.println("Windows built.");
    }

    @Override
    public void buildRoof() {
        product.setRoof(true);
        System.out.println("Roof built.");
    }

    @Override
    public void buildGarage() {
        product.setGarage(true);
        System.out.println("Garage built.");
    }

}
