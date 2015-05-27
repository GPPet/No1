
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class hw9_P7 {

	public static void main(String[] args) {
		String pathRead = "/home/gp5/Documents/Java/GPPet_java-course/GPPets_hw9/src/hw9_P6/LOTR_lines.txt";
		String pathWriteOdd = "/home/gp5/Documents/Java/GPPet_java-course/GPPets_hw9/src/hw9_P6/LOTR_odd.txt";
		String pathWriteEven = "/home/gp5/Documents/Java/GPPet_java-course/GPPets_hw9/src/hw9_P6/LOTR_even.txt";
		
		try {
			FileReader original = new FileReader(pathRead);
			BufferedReader bufferedOriginal = new BufferedReader(original);
			FileWriter odd = new FileWriter(pathWriteOdd);
			BufferedWriter bufferedOdd = new BufferedWriter(odd);
			FileWriter even = new FileWriter(pathWriteEven);
			BufferedWriter bufferedEven = new BufferedWriter(even);
			int count = 0;
			
			while (bufferedOriginal.ready()){
				try {
					String line = bufferedOriginal.readLine();
					count++;
					if (count % 2 != 0){
						bufferedOdd.write(line + "\n");
					} else {
						bufferedEven.write(line + "\n");
					}
					
					
					
				} catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}
			}
			
			bufferedOdd.close();
			bufferedEven.close();
			bufferedOriginal.close();
		
		} catch (IOException e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("Ready!!! :-)");
		
	}

}
