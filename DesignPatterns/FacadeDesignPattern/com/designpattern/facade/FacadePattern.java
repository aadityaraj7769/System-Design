package com.designpattern.facade;

  class PowerSupply {
    public void providePower() {
      System.out.println("Power supply provided");
    }
  }

   class Cpu {
    public void initialize() {
      System.out.println("Cpu initialized");
    }
  }

   class Memory {
    public void selfTest() {
      System.out.println("Memory initialized");
    }
  }

  class Harddrive {
    public void spinUp() {
      System.out.println("Harddrive spinning up");
    }
  }

  class OperatingSystem {
    public void load() {
      System.out.println("Operating system loaded");
    }
  }

  class CoolingSystem {
    public void startFans() {
      System.out.println("Cooling System: Fans started...");
    }
  }

  class Bios {
    public void boot(Cpu cpu, Memory memory) {
      System.out.println("BIOS: Booting CPU and Memory checks...");
      cpu.initialize();
      memory.selfTest();
    }
  }

  // Facade
  class ComputerFacade {
    private PowerSupply powerSupply = new PowerSupply();
    private CoolingSystem coolingSystem = new CoolingSystem();
    private Cpu cpu = new Cpu();
    private Memory memory = new Memory();
    private Harddrive hardDrive = new Harddrive();
    private Bios bios = new Bios();
    private OperatingSystem os = new OperatingSystem();

    public void startComputer() {
      System.out.println("----- Starting Computer -----");
      powerSupply.providePower();
      coolingSystem.startFans();
      bios.boot(cpu, memory);
      hardDrive.spinUp();
      os.load();
      System.out.println("Computer Booted Successfully!");
    }
  }

public class FacadePattern {
    public static void main(String[] args) {
      ComputerFacade computerFacade = new ComputerFacade();
      computerFacade.startComputer();
    }
}


