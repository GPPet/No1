package june10th;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new myThread1();
		Thread t2 = new myThread2();
		Thread t3 = new myThread3();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
