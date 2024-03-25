package Okan.bean_annotation;

import Okan.bean_annotation.casefactory.Case;
import Okan.bean_annotation.motherboardFactory.Motherboard;
import Okan.bean_annotationmonitorfactory.Monitor;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();

    }
    private void drawLogo(){
        monitor.drawPixelAt();
    }
}
