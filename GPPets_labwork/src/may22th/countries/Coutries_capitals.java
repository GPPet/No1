package may22th.countries;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Coutries_capitals {

	public static void main(String[] args) {
		readFile("/home/gp5/Documents/Java/GPPet_java-course/GPPets_labwork/src/may22th/countries/countries.txt");
		
	}

	private static void readFile(String path) {
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while (bufferedReader.ready()){
				String line = bufferedReader.readLine();
				System.out.println(line);
			}
			
			bufferedReader.close();
		
		} catch (IOException e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		
	}

}
