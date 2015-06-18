package may29th.obicham;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue_stack {

	public static void main(String[] args) {
		String string = "AiTFloHvDJeYYyoIu";
		
		Stack<String> upperStack = new Stack<String>();
		Queue<String> lowerQueue = new LinkedList<String>();
		
		int n = string.length();
		String[] stringArr = new String[n];
		for(int i = 0; i < stringArr.length; i++){
			stringArr[i] = "" + string.charAt(i);
			if (stringArr[i].equals(stringArr[i].toUpperCase())){
				upperStack.push(stringArr[i]);
			} else {
				lowerQueue.offer(stringArr[i]);
			}
		}
 		
		while(!upperStack.isEmpty()){
			String current = upperStack.pop();
			System.out.print(current);
		}

		System.out.println();
		
		while (lowerQueue.size() > 0) {		
			System.out.print(lowerQueue.poll());	
		}
	
	}

}
