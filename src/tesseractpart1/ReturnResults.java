/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesseractpart1;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import static java.awt.SystemColor.desktop;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import net.sourceforge.tess4j.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author samarthmadduru
 */
public class ReturnResults {

    static String initial = "http://www.google.com/search?q=";
    static String extension = "&btnI";

    /**
     *
     * @param str
     * @return
     * @throws java.net.MalformedURLException
     */
    public static URL returnOneResult(String str) throws MalformedURLException {
        str = str.replace(" ", "+");
        String resultAsString = initial + str + extension;
        URL myURL = new URL(resultAsString);
        return myURL;
    }

    private static Pattern patternDomainName;
    private Matcher matcher;
    private static final String DOMAIN_NAME_PATTERN = "([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,6}";

    static {
        patternDomainName = Pattern.compile(DOMAIN_NAME_PATTERN);
    }

    public static void main(String[] args) {

        ReturnResults obj = new ReturnResults();
        ArrayList<String> result = obj.returnFullLink("stop+signs");
        for (String temp : result) {
            System.out.println(temp);
        }
        System.out.println(result.size());
    }

    public String getDomainName(String url) {

        String domainName = "";
        matcher = patternDomainName.matcher(url);
        if (matcher.find()) {
            domainName = matcher.group(0).toLowerCase().trim();
        }
        return domainName;

    }

    public ArrayList<String> getDataFromGoogle(String query) {

        ArrayList<String> result = new ArrayList<String>();
        String request = "https://www.google.com/search?q=" + query + "&num=20";
        System.out.println("Sending request..." + request);

        try {

            // need http protocol, set this as a Google bot agent :)
            Document doc = Jsoup
                    .connect(request)
                    .userAgent("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)").timeout(5000).get();

            // get all links
            Elements links = doc.select("a[href]");
            for (Element link : links) {

                String temp = link.attr("href");
                if (temp.startsWith("/url?q=")) {
                    //use regex to get domain name
                    result.add(temp);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public ArrayList<String> returnFullLink(String query){
        ArrayList<String> variableArray = new ArrayList<>();
        ArrayList<String> urls =  getDataFromGoogle(query);
        for(int i=0; i<5; i++){
            int index;
            index = urls.get(i).indexOf("&sa");
            variableArray.add(urls.get(i).substring(7, index));
        }
        return variableArray;
    }

}


