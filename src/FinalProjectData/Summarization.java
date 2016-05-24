/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProjectData;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 *
 * @author samarthmadduru
 */
public class Summarization {
    
    /**
     *
     * @param str
     * @return An arrayList full of search suggestions
     */
    public static ArrayList<String> mine(String str){
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(str.split(" ")));
        int total=0;
        for(int p=0; p<wordsList.size();p++){
            total+=wordsList.get(p).length();
        }
        total=total/wordsList.size();
        ArrayList<String> fin = new ArrayList<>();
        for(int x=0; x<wordsList.size(); x++){
            if(Character.isUpperCase(wordsList.get(x).charAt(0)) && wordsList.get(x).length()>total) {
                fin.add(wordsList.get(x));
            }
            else if(wordsList.get(x).length()>total){
                fin.add(wordsList.get(x));
            }
        }
        for (int y=0;y<fin.size();y++){
            if(fin.get(y).endsWith(",") || fin.get(y).endsWith(".")){
                fin.set(y, fin.get(y).substring(0, fin.get(y).length()-1));
            }
        }
        return fin;
    }
    

    private static void main(String[] args){
        System.out.print(mine("Timothy Tyrone Foster, an African-American, is on death row in Georgia for the 1987 murder of an elderly white woman, Queen Madge White. The jury that convicted him was all white. Twenty years after his sentence his attorneys obtained notes the prosecution team took while it was engaged in picking a jury, including marking potential jurors who were black had a \"b\" written by their name."));
        
    }
}
