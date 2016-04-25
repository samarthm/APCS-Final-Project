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
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import net.sourceforge.tess4j.*;
import java.util.Scanner;
/**
 *
 * @author samarthmadduru
 */
public class TestClassFor_GoogleSearch {
    private static void main(String[] args) throws MalformedURLException{
        URL myURL;
        myURL = new URL("http://google.com/");
        GoogleSearch hello= new GoogleSearch();
        GoogleSearch.openWebpage(myURL);
    }
    
}
