import java.util.*;
class Booking{
	private static int total_seats=25;
	public void bookSeat(int n) {
		total_seats-=n;
		if(total_seats<0)
			System.out.println("seats unavailable");
		else
			System.out.println("your seat is booked");
	}
	public int getRemainingSeat() {
		return total_seats;
	}
}
class MyThread1 extends Thread{
	Booking b;
	int n;
	MyThread1(int n){
		b=new Booking();
		this.n=n;
	}
	synchronized public void run() {
		b.bookSeat(n);
	}
}
public class SeatBooking {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Ticket booking system");
		System.out.println("Total number of seats available---->"+new Booking().getRemainingSeat());
		while(true) {
			System.out.println("3 requests can be process at a time");
			System.out.println("More than three not possible");
			Scanner scan =new Scanner(System.in);
			MyThread1 obj1=null,obj2=null,obj3=null;
			String user1,user2,user3;
			System.out.println("Enter a number of tickets to be booked");
		
			System.out.print("request1------>");
			if(scan.hasNext()) {
				user1=scan.next();
				obj1=new MyThread1(Integer.parseInt(user1));
			}
			
			System.out.print("request2------>");
			if(scan.hasNext()) {
				user2=scan.next();
				obj2=new MyThread1(Integer.parseInt(user2));
			}
			System.out.print("request3------>");
			if(scan.hasNext()) {
				user3=scan.next();
				obj3=new MyThread1(Integer.parseInt(user3));
			}
			if(!obj1.equals(null))
				obj1.start();
			if(!obj2.equals(null))
				obj2.start();
			if(!obj3.equals(null))
				obj3.start();
			Thread.currentThread().join(500);
			if(obj1.b.getRemainingSeat()<0) {
				break;
			}
			else
				System.out.println("Available seats--->"+new Booking().getRemainingSeat());
		}
		System.out.println("Tickets are full");
	}
}
