package com.company;

public class HeadMaster extends Person {
    private Ozbek ozbek;  // director's builder

    HeadMaster(Ozbek ozbek) {  // constructor with Builder parameter
        this.ozbek = ozbek;
    }

    public void changeOzbek(Ozbek ozbek) {
        this.ozbek = ozbek;
    }  // changes current ozbek with the new one

    public void makeSimple() {  // HeadMasker requires builder to build new crib in s1mple type
        System.out.println("We are building new crib in simple option: ");
        this.ozbek.reset();
        this.ozbek.buildWalls();
        this.ozbek.buildDoors();
        this.ozbek.buildWindows();
    }

    public void makeStandard() {  // HeadMasker requires builder to build new crib in standard type
        System.out.println("We are building new crib in standard option: ");
        this.ozbek.reset();
        this.ozbek.buildWalls();
        this.ozbek.buildDoors();
        this.ozbek.buildWindows();
        this.ozbek.buildFence();
        this.ozbek.buildRoof();
    }

    public void makeEuro() {  // HeadMasker requires builder to build new crib in euro type
        System.out.println("We are building new crib in euro option: ");
        this.ozbek.reset();
        this.ozbek.buildWalls();
        this.ozbek.buildDoors();
        this.ozbek.buildWindows();
        this.ozbek.buildFence();
        this.ozbek.buildRoof();
        this.ozbek.buildPool();
        this.ozbek.buildGarage();
    }
}
