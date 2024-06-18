package multithreading.thread.concept;

public class ThreadExample extends Thread{
	
	

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		// To start the thread using Thread class
		
		ThreadExample th = new ThreadExample();
		ThreadExample th2 = new ThreadExample();
		th.start();
		th2.start();
		

	}

	
}


