package Problem_p22_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	private String path;
	
	public String file2String(String path) throws FileNotFoundException, IOException{
		String result = "";
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while (bufferedReader.ready()) {
			result += bufferedReader.readLine();
		}
		bufferedReader.close();
		
		return result;
	}

}
