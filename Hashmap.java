import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Hashmap { // Hash map class to store user name and password
	
	public static void main (String[] args) throws IOException { // main method
		
		HashMap<String,String> HashMap = new HashMap<String,String> (); // create hash map
		
		String line; // line string variable
		BufferedReader BufferedReader = new BufferedReader (new FileReader("WrittenDocuments/Registrations.txt")); // reader reads from text file
		while ((line = BufferedReader.readLine()) != null) { // while there is a line
			String [] LineArray = line.split(" "); // split the line into 2 sting variables and store it in array
			if(LineArray.length >= 2){ // while line array length is 2 or more 
				String key = LineArray [0]; // store as user name
				String value = LineArray [1]; // store as password
				HashMap.put(key,value); //set user name as key and password as value
				
			} // end of if 
			
			else { // while if condition is not met
				System.out.println("ignore the line" + line);
			} // else 
		}// end of while
		
		for (String key : HashMap.keySet()) { // for 
			System.out.println(key + " " + HashMap.get (key));
		} // for
		BufferedReader.close(); // close reader 
	} // main method
}// class