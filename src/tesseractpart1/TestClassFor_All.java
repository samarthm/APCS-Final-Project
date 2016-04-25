/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesseractpart1;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.*;
import java.util.*;
import net.sourceforge.tess4j.*;
import java.util.Scanner;
/**
 *
 * @author samarthmadduru
 */
public class TestClassFor_All {
    static ReturnResults rtres= new ReturnResults();
    static GoogleSearch dsrch= new GoogleSearch();
    static Tesseractpart1 test=new Tesseractpart1();
    
    public static void main(String[] args){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            String str=test.getOutput();
            ArrayList<String> hello = new ArrayList<>();
            str=str.substring(0, 50);
            
            
            hello= rtres.returnFilteredSearchResults(rtres.returnFullLink(str));
            for (int i=0; i<hello.size(); i++){
                System.out.println(hello.get(i));
            }
            
            
            
    }

}
