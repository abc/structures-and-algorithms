public class NameList
{
	Name[] names;
	int nameCount = 0;
	
	public NameList (int size)
	{
		this.names = new Name[size];
	}
	
	public void addName ()
	{
		if (nameCount < names.length)
		{
			this.names[nameCount] = new Name();
			nameCount++;
		}
		else
		{
			System.out.println("The names array is full.");
		}
	}
	
	public void display ()
	{
		if (nameCount > 0)
		{
			for (Name name:names)
			{
				if (name != null)
					name.display();
			}
		}
		else
		{
			System.out.println("No names to display.");
		}
	}
	
	public void sort ()
	{
		InsertionSort.sort(names);
	}
}