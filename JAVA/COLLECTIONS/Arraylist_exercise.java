import java.util.*;
public class Arraylist_exercise {

	public static void main(String[] args) {
		ArrayList<String>color=new ArrayList<String>();
		color.add("blue");
		color.add("red");
		color.add("black");
		color.add("green");
		System.out.println("sample element---->"+color.toString());
		System.out.println(1+"---->add element");
		System.out.println(2+"---->set element");
		System.out.println(3+"---->remove element");
		System.out.println(4+"---->delete all elements");
		System.out.println(5+"---->check list is empty or not");
		System.out.println(6+"---->check element present in list or not");
		System.out.println(7+"---->display all the elements");
		System.out.println(8+"---->stop the operation");
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the operation to be done=");
			int operation=scan.nextInt();
			if(operation==1) {
				System.out.println("enter a element=");
				String element=scan.next();
				color.add(element);
				System.out.println("value added");
			}
			else if(operation==2) {
				System.out.println("enter a element and index");
				String element=scan.next();
				int index=scan.nextInt();
				color.set(index, element);
				System.out.println("value setted");
			}
			else if(operation==3) {
				System.out.println("enter a index to remove");
				int index=scan.nextInt();
				if(index>=color.size())
					System.out.println("give value less than total size of the list");
				else {
					color.remove(index);
					System.out.println("value removed successfully");
				}
			}
			else if(operation==4) {
				color.clear();
				System.out.println("all elements are deleted");
			}
			else if(operation==5) {
				if(color.isEmpty())
					System.out.println("list is empty");
				else
					System.out.println("list is not empty");
			}
			else if(operation==6) {
				System.out.println("enter an element to check=");
				String element=scan.next();
				if(color.contains(element))
					System.out.println("element is present");
				else
					System.out.println("element is not present");
			}
			else if(operation==7) {
				System.out.println(color.toString());
			}
			else if(operation==8) {
				System.out.println("exit");
				break;
			}
			
		}
	}

}
