/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProjectData;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author samarthmadduru
 */
public class PrintStatementSearchForFileLoc {
    private static void main(String[] args){
        FileFilter filter = new FileNameExtensionFilter("png", "jpg", "gif", "bmp");        
        JPanel panel = new JPanel();
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(true);
        chooser.addChoosableFileFilter(filter);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
        System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }
    }
}
