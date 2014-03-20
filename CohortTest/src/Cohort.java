
public class Cohort
{
	private Student[] students;
	private int numberOfStudents = 0;
	
	public Cohort (int size)
	{
		this.students = new Student[size];
	}
	
	public void add (Student s)
	{
		// Check if the cohort is full.
		if (numberOfStudents < students.length)
		{
			// Add a new student and increment the number
			// of students in the array.
			students[numberOfStudents] = s;
			numberOfStudents++;
		}
		else
		{
			System.out.println("The cohort is full.");
		}
	}
	
	public void display ()
	{
		// For every student in the students array
		if (numberOfStudents > 0)
		{
			for (Student s:students)
			{
				// Display the student details
				if (s != null)
					s.display();
			}
		}
		else
		{
			System.out.println("There are no students in the cohort.");
		}
	}
	
	public void sort ()
	{
		QuickSort.sort(students);
	}
}
