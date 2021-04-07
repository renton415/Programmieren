package de.dhbwka.java.exercise.threads.search;

import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.net.URL; 

public class PageLoader implements Runnable {

    public String url;
    private String content;
    private final static String ENCODING = "UTF-8";

    @Override
    public void run () {
        content = getStringContentFromUrl();
    }

    public boolean pageLoaded(){
        return this.content != null;
    }

    public String getStringContentFromUrl() {
        StringBuilder buffer = new StringBuilder(); 
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(this.url).openStream(), PageLoader.ENCODING))){ 
           while (br.ready()) { 
              buffer.append(br.readLine()).append(System.lineSeparator()); 
           } 
        } catch (IOException ex) { 
        } 
        return buffer.toString();
    }

    public String getPageContent() { 
        return this.content != null 
              ? this.content.replaceAll( "(\\r|\\n)+", "##" ) : null; 
     } 



    public PageLoader (String url) {
        this.url = url;
        this.content = null;
    }
    
}
