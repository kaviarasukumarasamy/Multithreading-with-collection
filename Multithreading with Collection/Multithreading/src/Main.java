import java.util.ArrayList;

public class Main {
	public static void main(String[] args)

	{
		System.out.println("Welcome to Multithreading");
		Student student = new Student();
		Runnable msg = new Staff();
		Thread t1 = new Thread(msg);
		student.start();
		student.add();
		student.change();
		student.remove();
		student.iterate();
		
		t1.start();
		//t1.start();

	}

}
