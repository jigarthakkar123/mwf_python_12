class Callback
{
	public void call(String msg)
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Caller implements Runnable
{
	Thread t;
	String msg;
	Callback c;
	public Caller(String msg,Callback c) throws InterruptedException {
		this.c=c;
		this.msg=msg;
		t=new Thread(this);
		t.start();
		t.join();
	}
	public void run() {
		synchronized (c) {
			c.call(msg);
		}
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		Callback c=new Callback();
		Caller c1=new Caller("Hello", c);
		Caller c2=new Caller("World", c);
		Caller c3=new Caller("Synchronization", c);
		
		
		
	}
}
