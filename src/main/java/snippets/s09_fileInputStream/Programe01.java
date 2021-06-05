package snippets.s09_fileInputStream;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Programe01 {
	 public static void main(String[] args) {
		 
		 String fileLocation = "/Users/junghyunkang/Downloads/downImg.gif";
		 String WebUrL = "https://www.google.com/logos/doodles/2020/december-holidays-days-2-30-6753651837108830.3-law.gif";
				 
		 URL url;
		try {
			url = new URL(WebUrL);
			FileInputStreamFormWeb web = new FileInputStreamFormWeb(url.openStream(), fileLocation);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
