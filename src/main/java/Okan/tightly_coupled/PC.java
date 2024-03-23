package Okan.tightly_coupled;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PC {
    private DellCAse theCase;
    private AcerMonitor monitor;
    private AsusMotherboard motherboard;



    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();

    }
    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"black");
    }
}
