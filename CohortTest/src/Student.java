
public class Student implements Comparable<Student>
{
	private String bannerId;
	private String name;
	private String campus;
	
	public Student (String bannerId, String name, String campus)
	{
		this.bannerId = bannerId;
		this.name = name;
		this.campus = campus;
	}
	
	public void display ()
	{
		System.out.println(bannerId + "\t"+ name +"\t" + campus);
	}

	public int compareTo(Student s)
	{
		if (campus.compareTo(s.campus) == 0)
		{
			return (bannerId.compareTo(s.bannerId));
		}
		else
		{
			return campus.compareTo(s.campus);
		}
	}
}
