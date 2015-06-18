package may27th.Companies;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<Company> companies = new ArrayList<Company>();
		
		companies.add(new Company("Clean and Go", 234));
		companies.add(new Company("Vasilka Clean", 123));
		companies.add(new Company("Titan", 5230));
		
		System.out.println("Initial list:");
		for (int i = 0; i < companies.size(); i++) {
			System.out.println(companies.get(i).getName());
		}
		
		int max = 0;
		int index = -1;
		
		for (int i = 0; i < companies.size(); i++) {
			if (max < companies.get(i).getNumberEmployees()){
				max = companies.get(i).getNumberEmployees();
				index = i;
			}
		}
		System.out.println(max + " at " + index);
		
		companies.remove(index);
		max = 0;
		index = -1;
		
		System.out.println("Intermediate list:");
		for (int i = 0; i < companies.size(); i++) {
			System.out.println(companies.get(i).getName());
		}
		
		
		
		companies.add(new Company("Solejka", 12));
		companies.add(new Company("Чистота", 3245));
		
		for (int i = 0; i < companies.size(); i++) {
			if (max < companies.get(i).getName().length()){
				max = companies.get(i).getName().length();
				index = i;
			}
		}
		System.out.println("Longest name " + max + " at " + index);
		
		companies.remove(index);
		companies.add(index, new Company("Novel", 1234));
		
		System.out.println("Final list:");
		for (int i = 0; i < companies.size(); i++) {
			System.out.println(companies.get(i).getName());
		}

	}

}
