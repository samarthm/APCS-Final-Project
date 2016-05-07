/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProjectData;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import net.sourceforge.tess4j.*;
import java.util.Scanner;
/**
 *
 * @author samarthmadduru
 */
public class KeyWordIdentifier {
    
    ArrayList<String> arr =new ArrayList<>();
    int loc=0;
    
    public KeyWordIdentifier(String str){
        ArrayList<String> arr =new ArrayList<>();
        
        for(String word : str.split(" ")) {
            arr.add(word);
        }
        
    }
    
    
}
