
public class Program
{
	static Cohort test = new Cohort(10);
	
	public static void main(String[] args)
	{		
		addTestStudents();
		while (true)
		{
			
			showMenu();
			getInput();
		}		
	}
	
	public static void showMenu ()
	{
		System.out.println("1. Add a new student");
		System.out.println("2. Display students");
		System.out.println("3. Sort students");
		System.out.println("0. Exit");	
	}
	
	public static void getInput ()
	{
		Integer selection = Input.getInteger("Please select an option: ");
		
		switch (selection)
		{
			case 0:
				exit();
				break;
			case 1:
				addStudent();
				break;
			case 2:
				displayStudents();
				break;
			case 3:
				sortStudents();
				break;
		}
	}
	
	public static void exit ()
	{
		System.exit(0);
	}
	
	public static void addStudent ()
	{
		
		String name = Input.getString("Name: ");
		String bannerId = Input.getString("Banner ID: ");
		String campus = Input.getString("Campus: ");

		test.add(new Student(name, bannerId, campus));
	}
	
	public static void displayStudents ()
	{
		test.display();
	}
	
	public static void sortStudents ()
	{
		test.sort();
	}
	
	public static void addTestStudents ()
	{
		test.add(new Student("Smith, John", "B00333333", "Paisley"));
		test.add(new Student("Jones, Bill", "B00666666", "Ayr"));
		test.add(new Student("Smith, Jane", "B00555555", "Dumfries"));
		test.add(new Student("Burns, Andrew", "B00111111", "Hamilton"));
		test.add(new Student("Bloggs, Joe", "B00444444", "Hamilton"));
		test.add(new Student("Smith, John", "B00222222", "Paisley"));
	}
}
