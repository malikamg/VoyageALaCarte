/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagealacarte;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author asus malik//
 */
public class MidletVoyage extends MIDlet {
    Display disp = Display.getDisplay(this);
    Form f = new Form("f1");
    Ticker t = new Ticker("Dexter:voyage a la carte");
    
    

    public void startApp() {
        f.setTicker(t);
        disp.setCurrent(f);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
