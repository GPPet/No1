package Problem_p49_2;

public class Test {
	
	public static void main(String args[]) {
		
		Synchronize test = new Synchronize();
		
		Thread t1 = new Thread() {
			public void run() {
				test.threadCount();;
			}
		};
		
		t1.start();

		Thread t2 = new Thread(){
			public void run() {
				test.threadRunning();;;
			}
		};
		
		t2.start();

	}

}
