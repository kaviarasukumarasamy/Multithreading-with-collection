import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Thread {
	List<String> list = new ArrayList();
	Scanner input = new Scanner(System.in);
	Scanner input1 = new Scanner(System.in);

	public void start() {
		System.out.println("Thread Started");
	}

	public void add() {
		System.out.println("Enter the student name");
		String name = input.nextLine();
		list.add(name);
		System.out.println("Enter the student name");
		String name1 = input.nextLine();
		list.add(name1);
		System.out.println("Enter the student name");
		String name2 = input.nextLine();
		list.add(name2);
		System.out.println("The array list" + list);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}

	public void change() {
		System.out.println("Add the element to change his position");
		String st1 = input.next();
		list.set(2, st1);
		System.out.println("Updated list in array" + list);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
	}

	public void remove() {
		System.out.println("Enter the Student name to remove");
		String ss = input1.nextLine();
		if (list.contains(ss)) {
			list.remove(ss);
			System.out.println("The element is removed successfully");
		} else {
			System.out.println("The element is not in a list");
		}
		System.out.println("The updated arraylist" + list);
	}

	public void iterate() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("" + list.get(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}

		}
	}
}
