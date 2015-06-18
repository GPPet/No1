package hw10_P4_Library;

import java.util.HashMap;

public class library_main {

	public static void main(String[] args) {
		// Create 5 books:
		Book lotr1 = new Book("Lord of the Rings: the Fellowship of the Ring", "J.R.R. Tolkien", 480);
		Book lotr2 = new Book("Lord of the Rings: the Two Towers", "J.R.R. Tolkien", 416);
		Book lotr3 = new Book("Lord of the Rings: the Return of the King", "J.R.R. Tolkien", 512);
		Book hobbit = new Book("The Hobbit; or, There and Back Again", "J.R.R. Tolkien", 300);
		Book hobbitIll = new Book("The Hobbit; or, There and Back Again (Illustrated Ed.)", "J.R.R. Tolkien (Illustrator: Jemima Catlin)", 384);
		
//		System.out.println(lotr1.toString());

		Library lib1 = new Library();
		lib1.setLibrary("Public Library, Razgrad");
		lib1.setAddress("Razgrad 7200, Str. Delio Voivoda 2");
		HashMap<Book, Integer> lib1Collection = new HashMap<Book, Integer>();
		lib1.setBookCollection(lib1Collection);
		lib1.addBookCopy(lib1Collection, lotr1, 3);
		lib1.addBookCopy(lib1Collection, lotr2, 3);
		lib1.addBookCopy(lib1Collection, lotr3, 3);
		lib1.addBookCopy(lib1Collection, hobbit, 2);
		lib1.addBookCopy(lib1Collection, hobbitIll, 1);
		
		System.out.println(lib1);
		
		//Add copies of lotr1
		lib1.addBookCopy(lib1Collection, lotr1, 2);
		System.out.println(lib1);
		
		//Remove 1 copy of lotr2
		lib1.deleteBookCopy(lib1Collection, lotr2);
		System.out.println(lib1);
	}

}
