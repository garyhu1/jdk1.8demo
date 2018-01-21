package thread;

public class Test1 {
	public static void main(String[] args) {
		NewThread thread1 = new NewThread();
		NewThread thread2 = new NewThread();
		
		thread1.start();
		thread2.start();
		System.out.println(thread1.getName());
		
		NewRunnable nr = new NewRunnable();
		Thread t = new Thread(nr,"first");
		t.start();
	}
}

class NewThread extends Thread{
	
	private static int threadID = 0;
	
	public NewThread() {
		super("ID: "+(++threadID));
	}
	
	public String toString() {
		return super.getName();
	}
	
	public void run() {
		System.out.println(this);
	}
}

class NewRunnable implements Runnable{
	
	public String toString() {
		return Thread.currentThread().getName();
	}
	
	public void run() {
		System.out.println(this);
	}
}
