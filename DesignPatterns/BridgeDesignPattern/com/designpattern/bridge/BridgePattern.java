package com.designpattern.bridge;

public class BridgePattern {
  public static void main(String[] args) {
    Engine petrolEngine = new Petrol();
    Engine electricEngine = new Electric();
    Engine dieselEngine = new Diesel();

    CarType suvPetro = new SUV(petrolEngine);
    CarType sedanDiesel = new Sedan(dieselEngine);
    CarType suvElectric = new SUV(electricEngine);

    suvPetro.drive();
    sedanDiesel.drive();
    suvElectric.drive();
  }
}
