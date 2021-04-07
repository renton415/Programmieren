package de.dhbwka.java.exercise.threads.search;

import java.util.ArrayList; 
import java.util.List; 

public class SearchEngine {

    public static final int MAXTHREADS = 3; 
 
    private List<PageLoader> pageLoader = new ArrayList<>(); 
    private List<String> urls = new ArrayList<>();

    public void crawl( String... urls ) { 
        for (String url : urls ) { 
           this.urls.add(url); 
        } 
   
        while (!this.urls.isEmpty() || !this.pageLoader.isEmpty()) { 
           // URLs and loaders available? -> start new thread 
           if (this.urls.size() > 0 && this.pageLoader.size() < SearchEngine.MAXTHREADS ) { 
   
              PageLoader pl = new PageLoader(this.urls.remove(0)); 
              this.pageLoader.add(pl); 
   
              new Thread(pl).start(); 
              System.out.println( "Started loading: " + pl.url.toString() ); 
           } 
   
           // check for running threads if content was loaded 
   
           // make copy so we can remove items from original list 
           List<PageLoader> pageLoaderCopy = new ArrayList<>(this.pageLoader); 
           for (PageLoader pl : pageLoaderCopy) { 
              if (pl.pageLoaded()) { 
                 System.out.println("Loaded: " + pl.url.toString()); 
                 System.out.println("  Content: " + pl.getPageContent().substring(0,40)); 
                 this.pageLoader.remove( pl ); 
              } 
           } 
        } 
     }

     public static void main( String[] args ) { 
        new SearchEngine().crawl("http://www.sueddeutsche.de", "http://www.spiegel.de", "http://www.kit.edu", "http://www.faz.net"); 
     }
}
