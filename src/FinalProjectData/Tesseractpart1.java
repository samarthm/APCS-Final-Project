package FinalProjectData;

 

 

 
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.*;
import net.sourceforge.tess4j.*;
import java.util.Scanner;
import net.sourceforge.tess4j.util.LoadLibs;

public class Tesseractpart1 {

private File image1;
private File image2;
private Tesseract instance1;
private Tesseract instance2;
private String lineInput;

public Tesseractpart1(){
    
}


private static void main(String[] args) {
File imageFile = new File("/Users/samarthmadduru/Downloads/random.png");
Tesseract instance = Tesseract.getInstance(); //

    try {

        String result = instance.doOCR(imageFile);
        System.out.println(result);

    }catch (TesseractException e) {
        System.err.println(e.getMessage());
    }
}


/**
 * 
 * @param foo
 * @return output given a String, one version of method. Input should be the file location as a String.
 */   

public String getOutput(String foo){ 
    image1 = new File(foo);
    instance1 = Tesseract.getInstance();
    File tessDataFolder = LoadLibs.extractTessResources("tessdata"); // From the tess4j api
    instance1.setDatapath(tessDataFolder.getParent()); // Used to find the tessdata location
    try {

        String result = instance1.doOCR(image1);
        return result;

    } catch (TesseractException e) {
        System.err.println(e.getMessage());
        return null;
        
    }
}

/**
 * 
 * @returns same as other getOutput method with the exception that this one prompts you for the location.
 */

public String getOutput(){ 
    System.out.print("Enter a file name with the location: ");
    Scanner sc = new Scanner(System.in);
    lineInput=sc.nextLine();
    image2 = new File(lineInput);
    instance2 = Tesseract.getInstance();
    try {

        String result = instance2.doOCR(image2);
        return result;

    } catch (TesseractException e) {
        
        System.err.println(e.getMessage());
        return null;
        
    }
}

}
