package june03rd;

public class Problem_1 {
	public static void main(String[] args) {
	
	int[] array = {0,3,4,5,6,7,82,345,677,890};
	int key = 3;
	
	int first = 0;
	int last = array.length - 1;
	int middle = (first + last) / 2;
			
			
	while (first <= last) {
		if (array[middle] < key){
			first = middle + 1;
			
		} else if (array[middle] == key) {
			System.out.format("The number %d is found. Next number: %d.", key, array[middle+1]);
			break;
			
		} else {
			
			last = middle - 1;
			
		}

		middle = (first + last) / 2;
	}

	if (first > last) {
		System.out.println("The number does not exits in the array.");
	}

}

	
}
