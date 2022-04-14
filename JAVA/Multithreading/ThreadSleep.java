class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
			Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
			System.out.println(Thread.currentThread());
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
			System.out.println(Thread.currentThread());
		}
	}
}
public class ThreadSleep {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread());
		MyThread1 obj1=new MyThread1();
		MyThread2 obj2=new MyThread2();
		obj1.start();
		obj2.start();
	}

}
