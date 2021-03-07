package com.company;

public interface Builder {
    public int getId();
    public void reset();
    public void buildWalls();
    public void buildDoors();
    public void buildWindows();
    public void buildRoof();
    public void buildGarage();
}
