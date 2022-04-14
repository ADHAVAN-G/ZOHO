class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread());
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread());
		}
	}
}
public class Thread_name {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyThread1 obj1=new MyThread1();
		MyThread2 obj2=new MyThread2();
		obj1.start();
		obj2.start();
	}
}

result--->[main,5,main]---->[thread name,default priority,thread group]
