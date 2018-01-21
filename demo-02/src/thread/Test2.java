package thread;

public class Test2 {
	public static void main(String[] args) {
		TicketNum tn = new TicketNum(100);
		new SellTicket(tn);
		new SellTicket(tn);
		new SellTicket(tn);
	}
}

class TicketNum{
	private int total;
	
	public TicketNum(int num) {
		this.total = num;
	}
	
	public synchronized boolean sellTicket() {
		if(this.total>0) {
			this.total = this.total-1;
			return true;
		}else {
			return false;
		}
	}
}

class SellTicket extends Thread{
	
	private static int threadID = 0;
	
	private TicketNum tn;
	private int count;
	
	public SellTicket(TicketNum tn) {
		super("ID: "+(++threadID));
		this.tn = tn;
		this.start();
	}
	
	public String toString() {
		return super.getName();
	}
	
	public void run() {
		while(true) {
			boolean flag = this.tn.sellTicket();
			if(flag) {
				this.count+=1;
				System.out.println(this.getName()+" sell 1 page");
				try {
					sleep((int)(Math.random()*100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				break;
			}
		}
		System.out.println(this.getName()+" sold "+count+"уе");
	}
}
