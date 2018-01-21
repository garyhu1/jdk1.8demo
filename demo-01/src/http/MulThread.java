package http;

public class MulThread {
	
	private static int flag = 1;
	
	public static void main(String[] args) {
		
		new MyThread(flag).start();
	}
}

class MyThread extends Thread{
	
	private int flag;
	
	public MyThread(int flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		this.print1();
		this.print2();
		this.print3();
	}
	
	public synchronized void print1() {
		try {
			if(flag!=1) {
				this.wait();
			}
			
			System.out.println("MyThread flag = "+flag);
			
			flag = 2;
			this.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void print2() {
		try {
			if(flag!=2) {
				this.wait();
			}
			
			System.out.println("MyThread flag = "+flag);
			
			flag = 3;
			this.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void print3() {
		try {
			if(flag!=3) {
				this.wait();
			}
			
			System.out.println("MyThread flag = "+flag);
			
			flag = 1;
			this.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
