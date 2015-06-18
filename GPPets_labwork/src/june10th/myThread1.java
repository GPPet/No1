package june10th;

public class myThread1 extends Thread{
	public void run() {
		for(int i = 0; i < 100000; i++){
			System.out.print("z");
		}
		
	}

}
