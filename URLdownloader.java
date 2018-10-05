import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;
 
public class URLdownloader { // class URLdownloader to download a sites HTML code 
 
    public static void DownloadWebPage(String URL) { // download web page method
        
    	try { 
 
            URL WhatsNew = new URL(URL);
            BufferedReader BufferReader = new BufferedReader(new InputStreamReader(WhatsNew.openStream()));
 
            BufferedWriter BufferedWriter = new BufferedWriter(new FileWriter("BodyBuildingArticle#60HTML.html")); // write the HTML code to file
             
            String line;
            while ((line = BufferReader.readLine()) != null) {
                BufferedWriter.write(line);
            }
 
            BufferReader.close();
            BufferedWriter.close();
            System.out.println("HTML File created and Content downloaded");
        }
 
        catch (MalformedURLException mue) {
            System.out.println("Malformed URL Exception raised");
        }
        
    	catch (IOException ie) {
            System.out.println("IOException raised");
        }
    } //DownLoadWebPage method
    
    public static void main(String args[]) throws IOException { // main method
        
    	String URL = "https://www.bodybuilding.com/fun/podcast-episode-31-brandan-fokkens-wild-fitness-journey.html"; // link to page
        DownloadWebPage(URL); // call DownLoadWebPage method 
    } // main method
} // URLdownloader class
