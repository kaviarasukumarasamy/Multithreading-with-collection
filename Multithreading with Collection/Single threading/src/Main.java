import java.util.ArrayList;

public class Main {
	public static void main(String[] args)

	{
		System.out.println("Welcome to Single threading");

		Student student = new Student();
		student.start();
		student.add();
		student.change();
		student.remove();
		student.iterate();
	}

}
