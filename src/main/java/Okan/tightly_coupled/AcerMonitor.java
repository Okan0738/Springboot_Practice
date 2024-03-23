package Okan.tightly_coupled;

public class AcerMonitor {
    private String model;
    private String manufacturer;
    private int size;

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }
}
