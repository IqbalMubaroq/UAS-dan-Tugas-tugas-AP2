/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JApplet;

/**
 *
 * @author iqbal
 */
public class WavPlayer extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    private static AudioClip musik;
    
    public void mainmusik(String source) {
        // TODO start asynchronous download of heavy resources
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.play();
    }
    public void stopmusik(String source) {
        // TODO start asynchronous download of heavy resources
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.stop();
    }
    
    public static void main(String[] args) {
       WavPlayer sik = new WavPlayer();
       sik.mainmusik("comethru - jeremy zucker cover by kimswizzled(MP3_160K).wav");
    }
    // TODO overwrite start(), stop() and destroy() methods
}
