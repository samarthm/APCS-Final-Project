/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tesseractpart1;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import net.sourceforge.tess4j.*;
import java.util.Scanner;
/**
 *
 * @author samarthmadduru
 */
public class GoogleSearch {
    
    public static void openWebpage(URI uri) {
    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
        } catch (Exception e) {
        }
    }
}

public static void openWebpage(URL url) {
    try {
        openWebpage(url.toURI());
    } catch (URISyntaxException e) {
    }
}
}
