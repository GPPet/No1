package Problem_p49_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// Напишете задача, която създава 5 нишки и всяка от тях да изписва “The thread is started!”
		// и да изчаква произволен брой секунди (от 1 до 10) преди да изпише „Тhe thread complete!“.  
		// Стартирайте всичките нишки. Разширете задача като преди да заспи сложете произволно 
		// някакво име на всяка нишка и нека това име да е уникално. След като нишката е именувана, 
		// то нека тя се представи. Решете задачата без да използвате thread pool.
		// Решете същата задача по втори начин като създадете thread pool със 7 нишки, но използвате само 5 от тях.

		MyThread t1 = new MyThread(3, "Beginning Thread");
		MyThread t2 = new MyThread(1);
		MyThread t3 = new MyThread(2, "KeepOnGoing Thread");
		MyThread t4 = new MyThread();
		MyThread t5 = new MyThread(9, "Last Thread");
		MyThread t6 = new MyThread(1, "Sixth Thread");
		MyThread t7 = new MyThread(5, "Seventh Thread");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		Queue<MyThread> threadQueue = new LinkedList<MyThread>();
		threadQueue.offer(t1);
		threadQueue.offer(t2);
		threadQueue.offer(t3);
		threadQueue.offer(t4);
		threadQueue.offer(t5);
		threadQueue.offer(t6);
		threadQueue.offer(t7);
		
		ExecutorService queExecutor = Executors.newFixedThreadPool(7);
		
		for(MyThread t : threadQueue)
			queExecutor.execute(t);
		queExecutor.shutdown();
		while (!queExecutor.isTerminated()) {
		}
		System.out.println("\nFinished ALL threads");
				
	}

}
