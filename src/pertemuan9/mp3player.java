/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JApplet;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author iqbal
 */
public class mp3player extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public static void main(String[] args) throws JavaLayerException {
        
        try {
        FileInputStream fis = new FileInputStream("E://comethru - jeremy zucker cover by kimswizzled(MP3_160K).mp3");
        Player player = new Player(fis);
        System.out.println("it's running...");
        player.play();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        
        }catch (JavaLayerException e){
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
}
