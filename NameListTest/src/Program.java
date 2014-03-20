public class Program
{
	public static void main(String[] args)
	{
		NameList list = new NameList(10);
		
		while (true)
		{
			System.out.println("1. Add a name");
			System.out.println("2. Display names");
			System.out.println("3. Sort names");
			System.out.println("0. Exit");
			
			Integer selection = Input.getInteger("Please make a selection: ");
			
			switch (selection)
			{
				case 1:
					list.addName();
					break;
				case 2:
					list.display();
					break;
				case 3:
					list.sort();
					break;
				case 0:
					System.exit(0);
					break;
			}
		}
	}
}