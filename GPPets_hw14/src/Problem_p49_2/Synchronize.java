package Problem_p49_2;

public class Synchronize {
	synchronized void threadCount(){
		System.out.println("Thread1 starts counting...");
		for (int i = 0; i <= 25000; i++)
			System.out.println(i + " / ");
		
		try{
			wait();
		} catch (Exception e){
		} finally{
			System.out.println("Thread1 keeps on counting...");
			for (int i = 25001; i <= 50000; i++)
				System.out.println(i + "\\");
		}
	}
	
	synchronized void threadRunning(){
		System.out.println("Thread2 running...");
		int count = 0;
		while(count < 20){
			System.out.println("Running... ");
			count++;
			try{
				Thread.sleep(1000);
			} catch (InterruptedException e){
				System.out.println(e);
			}
		}
		notify();
		
	}

}
