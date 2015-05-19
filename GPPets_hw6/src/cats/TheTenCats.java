package cats;

import java.util.ArrayList;

public class TheTenCats {
	public static void main(String[] agrs){
		
		ArrayList<Object> catList = new ArrayList<Object>();
		catList.add(new Cat("Deisy", 2));
		catList.add(new Cat("Tom", 12));
		catList.add(new Cat("Elli", 5));
		catList.add(new Cat("Josh", 6));
		catList.add(new Cat("Monic", 10));
		catList.add(new Cat("Simon", 4));
		catList.add(new Cat("Dollie", 9));
		catList.add(new Cat("Joda", 13));
		catList.add(new Cat("Cool", 8));
		catList.add(new Cat("Set", 8));
		catList.add(new Cat("Tomie", 6));
		catList.add(new Cat("Savage", 3));
		
		System.out.println("Total number of cats: " + catList.size());
		System.out.println();
		
		for (Object Cat: catList) {
			((cats.Cat) Cat).Say();
		}
		
	}
}
