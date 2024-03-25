package Okan.bean_annotationmonitorfactory;

public class SonyMonitor extends Monitor {

    public SonyMonitor(String model, String manufacturer, int size) {

        super(model, manufacturer, size);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
