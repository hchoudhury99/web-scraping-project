import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class IMAGEdownloader { // IMAGEdownloader class to download the image.

	public static void main(String[] args) throws Exception { // main method throws exception
		
		String BodyBuildingIcon = "https://www.bodybuilding.com/images/bb-favicon-62.png"; // where to find the image
		String ImageFile = "BodyBuildingICON.jpg"; // what to name the saved image
		saveImage(BodyBuildingIcon, ImageFile); // call save image method
	} // end of main method

	public static void saveImage(String BodyBuildingIcon, String ImageFile) throws IOException { // the save image method
		
		URL Icon = new URL(BodyBuildingIcon);
		InputStream InputStream = Icon.openStream();
		OutputStream OutputStream = new FileOutputStream(ImageFile);

		byte[] Size = new byte[1024];
		int length;

		while ((length = InputStream.read(Size)) != -1) { // while 
			OutputStream.write(Size, 0, length);
		}//end while

		InputStream.close();
		OutputStream.close();
		
		System.out.println("Image file created and icon downloaded");
	} // saveImage method

}// IMAGEdownloader class