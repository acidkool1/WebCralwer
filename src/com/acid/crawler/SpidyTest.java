package com.acid.crawler;

public class SpidyTest {
	
	   /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
        Spidy spider = new Spidy();
        spider.search("https://www.flipkart.com/", "bug");
    }

}
