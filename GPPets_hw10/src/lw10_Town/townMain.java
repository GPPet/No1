package lw10_Town;

import java.util.HashMap;

public class townMain {

	public static void main(String[] args) {
		// Направете HashSet  с Тоwn и добавете 5 града. 
		// Нека един от градовете да е със следните стойности: Варна, България, 330000. 
		// Проверете дали сетът съдържа Варна. Премахнете Варна от сета.

		HashMap<Integer, Town> townHM = new HashMap<Integer, Town>();
		Town varna = new Town("Varna", "Bulgaria", 330000l);
		Town london = new Town("London", "UK", 8416300l);
		Town tokyo = new Town("Tokyo", "Japan", 13890000l);
		Town newYork = new Town("New York", "USA", 8491000l);
		Town mumbai = new Town("Mumbai", "India", 12770000l);
		
		townHM.put(1, varna);
		townHM.put(2, london);
		townHM.put(3, tokyo);
		townHM.put(4, newYork);
		townHM.put(5, mumbai);
		
		String search = "Varna";
		int searchKey = 0;
		boolean searchFound = false;
		
		for(Integer key : townHM.keySet()){
//			System.out.println(townHM.get(key).toString());
			if(townHM.get(key).getTownName() == search){
				System.out.println(search + " is included in the DB at key: " + key);
				searchKey = key;
				searchFound = true;
				break;
			} 
		}
		
		if (searchFound == false) 
			System.out.println(search + " is not found in the DB.");
	
		if (searchKey != 0) townHM.remove(searchKey);
		
		for(Integer key : townHM.keySet()){
			System.out.println(townHM.get(key).toString());
		}
		
		
		
	}

}
