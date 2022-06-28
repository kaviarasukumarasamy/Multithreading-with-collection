import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Staff implements Runnable{
	List<String> list = new ArrayList();
	Scanner input = new Scanner(System.in);
	Scanner input1 = new Scanner(System.in);
	public void run() {
		System.out.println("Enter the staff name");
		String name = input.nextLine();
		list.add(name);
		System.out.println("Enter the staff name");
		String name1 = input.nextLine();
		list.add(name1);
		System.out.println("Enter the stafrunf name");
		String name2 = input.nextLine();
		list.add(name2);
		System.out.println("The array list" + list);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}
}
	
	
