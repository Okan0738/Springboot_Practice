package Okan.tightly_coupled;

public class AsusMotherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

}
