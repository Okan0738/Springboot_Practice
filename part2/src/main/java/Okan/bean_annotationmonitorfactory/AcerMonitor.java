package Okan.bean_annotationmonitorfactory;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class AcerMonitor extends Monitor {
    public AcerMonitor(String model, String manufacturer, int size) {
        super(model, manufacturer, size);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer");
    }
}
